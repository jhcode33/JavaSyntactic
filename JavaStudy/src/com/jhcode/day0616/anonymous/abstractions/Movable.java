package com.jhcode.day0616.anonymous.abstractions;

public interface Movable {
	default void move() {
		System.out.println("do Move");
	};

}
