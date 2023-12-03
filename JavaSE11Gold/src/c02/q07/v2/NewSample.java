package c02.q07.v2;

import java.util.function.Predicate;

import c02.q07.v2.Person.Gender;

public class NewSample {
	public static void main(String[] args) {
		Predicate<Person> isMail = p -> p.getGender().equals(Gender.MALE);
		Predicate<Person> isFemale = p -> p.getGender().equals(Gender.FEMALE);
		Predicate<Person> isAdult = p -> p.getAge() >= 20;
		Predicate<Person> criteria = isMail.or(isFemale.and(isAdult));
		Person sample = new Person(Gender.MALE, 19);
		if (criteria.test(sample)) {
			System.out.println("OK");
			return;
		}

		System.out.println("NG");
	}
}
