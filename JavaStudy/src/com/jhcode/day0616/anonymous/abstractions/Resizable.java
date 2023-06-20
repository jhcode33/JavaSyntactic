package com.jhcode.day0616.anonymous.abstractions;

public interface Resizable {
	default void resize() {
		System.out.println("do Move");
	};

}
