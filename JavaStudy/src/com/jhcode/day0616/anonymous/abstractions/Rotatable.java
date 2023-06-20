package com.jhcode.day0616.anonymous.abstractions;

public interface Rotatable {
	default void rotatable() {
		System.out.println("do Move");
	};
}
