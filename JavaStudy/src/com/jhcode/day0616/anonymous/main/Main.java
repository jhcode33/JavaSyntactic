package com.jhcode.day0616.anonymous.main;

import com.jhcode.day0616.anonymous.abstractions.Movable;
import com.jhcode.day0616.anonymous.abstractions.Resizable;
import com.jhcode.day0616.anonymous.abstractions.Shape;
import com.jhcode.day0616.anonymous.concreate.Circle;
import com.jhcode.day0616.anonymous.concreate.Rectangel;

public class Main {

	public static void main(String[] args) {
		
		Movable movable = new Movable() {
			@Override
			public void move() {
				System.out.println("도형을 이동합니다.");
			}
		};
		
		Resizable resizable = new Resizable() {
			@Override
			public void resize() {
				System.out.println("도형의 크기를 조절합니다.");
			}
		};
	
		Shape rectangle = new Rectangel(movable, resizable);
		rectangle.draw();
		rectangle.move();
		rectangle.resize();
		
		System.out.println();
		
		Shape circle = new Circle(movable, resizable);
		circle.draw();
		circle.move();
		circle.resize();
	
	}

}
