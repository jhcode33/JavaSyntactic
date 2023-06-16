package com.jhcode.day0616.abstractions.abstraction;

public interface ShapeFuntion {
	
	public void move();
	public void resize();
	default void rotate() {
		System.out.println("Rotate Shape");
	};
}
