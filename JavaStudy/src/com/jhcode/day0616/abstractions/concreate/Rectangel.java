package com.jhcode.day0616.abstractions.concreate;

import com.jhcode.day0616.abstractions.abstraction.Shape;
import com.jhcode.day0616.abstractions.abstraction.ShapeFuntion;

public class Rectangel extends Shape implements ShapeFuntion {
	
	public String shape;

	public Rectangel(int totalPoint) {
		super(totalPoint);
		this.shape = "사각형";

	}
	
	@Override
	public void move() {
		System.out.println("Move Rectangel");
	}

	@Override
	public void resize() {
		System.out.println("Resize Rectangel");
	}

	@Override
	public void drowShape() {
		System.out.println("Dorw Rectangel");
	}
}
