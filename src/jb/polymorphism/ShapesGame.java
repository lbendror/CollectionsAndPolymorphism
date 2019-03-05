package jb.polymorphism;
import java.util.ArrayList;
public class ShapesGame {
	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		Circle circ1 = new Circle(15);
		shapes.add(new Circle(3));
		shapes.add(new Square(4));
		shapes.add(new Triangle(3, 5));
		shapes.add(new Circle(7));
		shapes.add(circ1);
		
		for(int i=0; i<shapes.size(); i++) {
			System.out.println(shapes.get(i) + " area: " + shapes.get(i).calcArea()); 
		}
		for(Shape shape : shapes) {
			System.out.println(shape + " area: " + shape.calcArea());
		}
		printShapesArea(shapes);
	}
	
	public static void printShapesArea(ArrayList<Shape> shapes) {
		
		for (Shape shape : shapes) {
			System.out.println(shape + " area: " + shape.calcArea());
		}
		
		for (Shape shape : shapes) {
			
			if (shape instanceof Circle) {
				Circle c = (Circle) shape;
				int radius = c.getRadius();
				System.out.println("Circle with radius " + radius + " area: " + shape.calcArea());
			}
			
			else if (shape instanceof Triangle) {
				System.out.println("Triangle area: " + shape.calcArea());
			}
			
			else if (shape instanceof Square) {
				System.out.println("Square area: " + shape.calcArea());
			}
		}
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