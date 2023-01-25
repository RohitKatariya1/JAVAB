package com.code.project;

public class Circle {

	public static void main(String[] args) {
		float radius= 5.0f,area,diameter,circumference;
	//Radius =3.14*R*R 
		area = 3.14f*radius*radius;
	//diameter of a circle = 2*r
		diameter = 2*radius;
	//circumference = 2*3.14*r
		circumference = 2*3.14f*radius;
		System.out.println("Area of a circle is: "+ area);
		System.out.println("diameter of a circle is: "+diameter);
		System.out.println("circumference of a circle is: "+circumference);
	}

}
