package jb.polymorphism;

public class Square extends Shape {

	private int sideLength;
	
	public Square(int sideLength) {
		this.sideLength = sideLength;
	}
	
	@Override
	public int calcArea() {
		return sideLength * sideLength;
	}
	
	@Override
	public String toString() {
		return "Square";
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