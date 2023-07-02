package com.jhcode.day0623;

public class HelloThread extends Thread {
	
	public void run() {
		System.out.println("Hello from a thread!");
	}

	public static void main(String args[]) {
		(new HelloThread()).start();
	}
}
