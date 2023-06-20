package com.jhcode.day0616.anonymous.concreate;

import com.jhcode.day0616.anonymous.abstractions.Movable;
import com.jhcode.day0616.anonymous.abstractions.Resizable;
import com.jhcode.day0616.anonymous.abstractions.Shape;

public class Rectangel extends Shape {

	public Rectangel(Movable movable, Resizable resizable) {
		super(movable, resizable);
	}
	
	@Override
	public void draw() {
		System.out.println("사격형을 그립니다.");
	}
}
