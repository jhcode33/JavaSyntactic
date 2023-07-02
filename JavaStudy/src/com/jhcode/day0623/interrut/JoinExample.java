package com.jhcode.day0623.interrut;

public class JoinExample {
   public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(Thread.currentThread()));
        thread.start();

        try {
            // 다른 스레드가 끝날 때까지 대기
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("main 스레드 : 인터럽트가 발생했습니다.");
        }
        
        System.out.println("main 스레드 : Goodbye.");
    }

    private static class MyRunnable implements Runnable {
        private Thread mainThread;

        public MyRunnable(Thread mainThread) {
            this.mainThread = mainThread;
        }

        @Override
        public void run() {
            try {
                System.out.println("스레드가 시작되었습니다.");

                // 5초간 대기
                Thread.sleep(5000);
                
                mainThread.interrupt();

                System.out.println("스레드가 정상적으로 종료되었습니다.");
            } catch (InterruptedException e) {
                System.out.println("스레드가 인터럽트되었습니다.");
                mainThread.interrupt(); // main 스레드를 인터럽트
            }
        }
    }
}
