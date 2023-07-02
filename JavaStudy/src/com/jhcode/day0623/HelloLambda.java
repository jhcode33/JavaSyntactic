package com.jhcode.day0623;

public class HelloLambda {
	public static void main(String[] args) {
		 new Thread( () -> System.out.println("run")).start();
	}
}
