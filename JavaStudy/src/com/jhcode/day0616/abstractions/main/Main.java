package com.jhcode.day0616.abstractions.main;

import com.jhcode.day0616.abstractions.concreate.Circle;
import com.jhcode.day0616.abstractions.concreate.Rectangel;
import com.jhcode.day0616.abstractions.concreate.Triangle;

public class Main {
	public static void main(String[] args) {
		
		Circle circle = new Circle(0);
		circle.drowShape();
		System.out.println("모양: " + circle.shape);
		System.out.println("꼭지점: " + circle.getTotalPoint());
		circle.move();
		circle.resize();
		circle.rotate();
		System.out.println();
		
		Rectangel rectangel = new Rectangel(4);
		rectangel.drowShape();
		System.out.println("모양: " + rectangel.shape);
		System.out.println("꼭지점: " + rectangel.getTotalPoint());
		rectangel.move();
		rectangel.resize();
		rectangel.rotate();
		System.out.println();
		
		Triangle triangle = new Triangle(3);
		triangle.drowShape();
		System.out.println("모양: " + triangle.shape);
		System.out.println("꼭지점: " + triangle.getTotalPoint());
		triangle.move();
		triangle.resize();
		triangle.rotate();
	}
}
