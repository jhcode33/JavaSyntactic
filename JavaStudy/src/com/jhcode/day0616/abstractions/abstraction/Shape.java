package com.jhcode.day0616.abstractions.abstraction;

public abstract class Shape {

	protected int totalPoint;    //총 점의 갯수

	public Shape(int totalPoint) {
		this.totalPoint = totalPoint;
	}
	
	public abstract void drowShape();
	
	public int getTotalPoint() {
		return totalPoint;
	}
}
