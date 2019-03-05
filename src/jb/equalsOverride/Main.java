package jb.equalsOverride;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("Dani");
		Person p2 = new Person("David");
		Person p3 = new Person("Moshe");
		Car c1 = new Car("Mazda");
		
		if (p1.equals(c1)) {
			System.out.println("equal!!");
		}
		else {
			System.out.println("not equal");
		}
		
		if (p1.equals(p2)) {
			System.out.println("equal!!");
		}
		else {
			System.out.println("not equal");
		}
		
		if (p1.equals(p3)) {
			System.out.println("equal!!");
		}
		else {
			System.out.println("not equal");
		}
	}
}
/*
 not equal
equal!!
not equal
 */