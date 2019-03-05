package jb.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> namesList = new ArrayList<String>();
		
		namesList.add("Moshe");
		namesList.add("David");
		namesList.add("Shirli");
		namesList.add("Liat");
		
		for (String name : namesList) {
			System.out.println(name);
		}
		
		System.out.println("----------");
		
		for (int i=0; i<namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}
		
		String name = namesList.get(2);
		
		int size = namesList.size();
		System.out.println(size);
		
		boolean shirliExists = namesList.contains("Shirli1");
		System.out.println(shirliExists);
		
		System.out.println(name);
	}
}
/*
Moshe
David
Shirli
Liat
----------
Moshe
David
Shirli
Liat
4
false
Shirli
*/