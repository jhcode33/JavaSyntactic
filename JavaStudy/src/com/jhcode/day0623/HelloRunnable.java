package com.jhcode.day0623;

public class HelloRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Hello from a thread!");
	}
	
	public static void main(String args[]) {
		(new Thread(new HelloRunnable())).start();
		//new Thread를 Open Declearation하면 this가 나오는데 이는 Thread의 오버로딩된 생성자를 가리킨다.
		
	}
}
