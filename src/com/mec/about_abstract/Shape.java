package com.mec.about_abstract;

public abstract class Shape {
	protected int centerX;
	protected int centerY;
	
	public Shape() {
		this(0, 0);
	}

	public Shape(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
