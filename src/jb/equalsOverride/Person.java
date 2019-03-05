package jb.equalsOverride;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (o instanceof Person) {
			
			Person otherPerson = (Person) o;
			
			char otherPerson_firstLetterInName = otherPerson.name.charAt(0);
			char otherPerson_secondLetterInName = otherPerson.name.charAt(1);
			
			char thisPerson_firstLetterInName = this.name.charAt(0);
			char thisPerson_secondLetterInName = this.name.charAt(1);
			
			if (otherPerson_firstLetterInName == thisPerson_firstLetterInName &&
					otherPerson_secondLetterInName == thisPerson_secondLetterInName) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
/*
not equal
equal!!
not equal
*/