package c02.q07.v2;

import c02.q07.v2.Person.Gender;

public class OldSample {
	public static void main(String[] args) {
		Person sample = new Person (Gender.MALE, 19);		
		if(sample.getGender().equals(Gender.MALE)
				|| sample.getGender().equals(Gender.FEMALE)
				&& sample.getAge() >= 20) {
			System.out.println("OK");
			return;
		}
		System.out.println("NG");
	}
}
