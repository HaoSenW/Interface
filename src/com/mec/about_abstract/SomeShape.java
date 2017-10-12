package com.mec.about_abstract;

public class SomeShape {
	private Shape shape;
	
	public SomeShape(Shape shape) {
		this.shape = shape;
	}
	
	public double area() {
		if(shape == null) {
			return 0.0;
		}
		
		return shape.getArea();
	}
}
