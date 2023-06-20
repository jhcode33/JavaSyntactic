package com.jhcode.day0616.anonymous.concreate;

import com.jhcode.day0616.anonymous.abstractions.Movable;
import com.jhcode.day0616.anonymous.abstractions.Resizable;
import com.jhcode.day0616.anonymous.abstractions.Shape;

public class Circle extends Shape {
	
	public Circle(Movable movable, Resizable resizable) {
		super(movable, resizable);
	}
	
	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}

}
