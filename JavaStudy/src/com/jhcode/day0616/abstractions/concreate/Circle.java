package com.jhcode.day0616.abstractions.concreate;

import com.jhcode.day0616.abstractions.abstraction.Shape;
import com.jhcode.day0616.abstractions.abstraction.ShapeFuntion;

public class Circle extends Shape implements ShapeFuntion {

	public String shape;
	
	public Circle(int totalPoint) {
		super(totalPoint);
		this.shape = "원";
	}

	@Override
	public void move() {
		System.out.println("Move Circle");
	}

	@Override
	public void resize() {
		System.out.println("Resize Circle");
	}

	@Override
	public void drowShape() {
		System.out.println("Dorw Circle");
	}

}
