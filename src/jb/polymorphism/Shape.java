package jb.polymorphism;

public class Shape {

	public int calcArea() {
		return -1;
	}
	
	@Override
	public String toString() {
		
		if (this instanceof Circle) {
			return "Circle";
		}
		else if (this instanceof Triangle) {
			return "Triangle";
		}
		else if (this instanceof Square) {
			return "Square";
		}
		
		return "";
	}
}
/*
not equal
equal!!
not equal
*/