package c02.q07;

import java.util.function.Predicate;

import c02.q07.Person.Gender;

public class NewSample {
	public static void main (String[] args) {
		Predicate<Person> isMail = p -> p.getGender().equals(Gender.MALE);
		Predicate<Person> isFemale = p -> p.getGender().equals(Gender.FEMALE);
		Predicate<Person> isAdult = p -> p.getAge() >= 20;
		
		Person sample = new Person(Gender.MALE, 19);
		if(isMail.or(isFemale.and(isAdult)).test(sample)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		
		
		main3();
	}
	
	public void main2(Person sample) {
		boolean isMail = sample.getGender().equals(Gender.MALE);
		boolean isFemale = sample.getGender().equals(Gender.FEMALE);
		boolean isAdult = sample.getAge() >= 20;
		if(isMail || (isFemale && isAdult)) {
			System.out.println("OK");
			return;
		}
		System.out.println("NG");
	}
	
	public static void main3 () {
		Predicate<String> p1 = str -> str.startsWith("a");
		Predicate<String> p2 = str -> str.endsWith("e");
		Predicate<String> p3 = p1.and(p2);
		System.out.println(p3.test("abcde"));
	}
}
