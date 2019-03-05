package jb.polymorphism;

public class Circle extends Shape {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public int calcArea() {
		return (int) (3.14f * Math.pow(radius, 2));
	}

	@Override
	public String toString() {
		return "Circle";
	}
	
	public int getRadius() {
		return radius;
	}
}
/*
not equal
equal!!
not equal
*/