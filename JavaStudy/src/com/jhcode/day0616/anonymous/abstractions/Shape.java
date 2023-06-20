package com.jhcode.day0616.anonymous.abstractions;

public abstract class Shape implements Movable, Resizable, Rotatable {
	private Movable movable;
	private Resizable resizable;
	
	public Shape(Movable movable, Resizable resizable) {
		this.movable = movable;
		this.resizable = resizable;
	}
	
    public abstract void draw();

    public void move() {
        movable.move();
    }

    public void resize() {
        resizable.resize();
    }

}
