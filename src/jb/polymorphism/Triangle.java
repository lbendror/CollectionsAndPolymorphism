package jb.polymorphism;

public class Triangle extends Shape {

	private int baseLength;
	private int height;
	
	public Triangle(int baseLength, int height) {
		this.baseLength = baseLength;
		this.height = height;
	}
	
	@Override
	public int calcArea() {
		return (int) (baseLength * height / 2);
	}
	
	@Override
	public String toString() {
		return "Triangle";
	}
}
/*
Circle area: 28
Square area: 16
Triangle area: 7
Circle area: 153
Circle area: 706
Circle area: 28
Square area: 16
Triangle area: 7
Circle area: 153
Circle area: 706
Circle area: 28
Square area: 16
Triangle area: 7
Circle area: 153
Circle area: 706
Circle with radius 3 area: 28
Square area: 16
Triangle area: 7
Circle with radius 7 area: 153
Circle with radius 15 area: 706
*/