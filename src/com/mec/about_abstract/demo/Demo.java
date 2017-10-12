package com.mec.about_abstract.demo;

import com.mec.about_abstract.Rectange;
import com.mec.about_abstract.Square;

public class Demo {
	public static void main(String[] args) {
		Square square = new Square(10);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
		
		System.out.println("-------------------");
		
		Rectange rectange = new Rectange(10, 20);
		System.out.println(rectange.getArea());
		System.out.println(rectange.getPerimeter());
		
		System.out.println("-------------------");
	}
}
