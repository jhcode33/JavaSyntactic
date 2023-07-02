package com.jhcode.day0623;

public class SynchronizedCounter {
	//동기화를 쓰지 않을 경우, 두 개의 Thread가 값을 동시에 참조할 수 있어서
	//실행할 때마다 값이 달라짐
	
	//동기화를 할 경우(Synchronized 키워드를 쓰면 하나의 Thread만 작업을 할 수 있어서
	//매번 같은 값이 나온다.
	
	private int c = 0;

    public /*synchronized*/ void increment() {
        c++;
    }

    public /*synchronized*/ void decrement() {
        c--;
    }

    public /*synchronized*/ int value() {
        return c;
    }
    
    
    public static void main(String[] args) {
       SynchronizedCounter example = new SynchronizedCounter();

        // 스레드 A
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // 스레드 B
        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.decrement();
            }
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + example.value());
    }

}
