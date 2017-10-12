package com.mec.about_abstract;

public class Square extends Shape {
	private double edge;
	
	public Square() {
		this(0);
	}

	public Square(double edge) {
		super();
		this.edge = edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	@Override
	public double getArea() {
		return edge*edge;
	}

	@Override
	public double getPerimeter() {
		return 4*edge;
	}

}
