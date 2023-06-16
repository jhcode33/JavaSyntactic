package com.jhcode.day0616.abstractions.concreate;

import com.jhcode.day0616.abstractions.abstraction.Shape;
import com.jhcode.day0616.abstractions.abstraction.ShapeFuntion;

public class Triangle extends Shape implements ShapeFuntion {
	
	public String shape;
	
	public Triangle(int totalPoint) {
		super(totalPoint);
		this.shape = "삼각형";
	}

	@Override
	public void drowShape() {
		System.out.println("Drawing a triangle");
	}

	@Override
	public void move() {
		System.out.println("Move triangle");
		
	}

	@Override
	public void resize() {
		System.out.println("Resize triangle");
	}

}
