package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

	public static void main(String[] args) {
		List<Person> people = List.of(new Person("Alice", Gender.MALE), new Person("John", Gender.MALE),
				new Person("Bob", Gender.MALE), new Person("Mary", Gender.FEMALE), new Person("Lisa", Gender.FEMALE),
				new Person("Lilly", Gender.PREFER_NOT_TO_SAY));
		/*
		 * people.stream().map(person -> person.gender) .collect(Collectors.toSet())
		 * .forEach(System.out::println);
		 */
		
		boolean match=people.stream().
				allMatch(person -> Gender.FEMALE.equals(person.gender));
		System.out.println("All Females ? "+match);
		
		boolean anyMatch=people.stream().
				anyMatch(person -> Gender.FEMALE.equals(person.gender));
		System.out.println("Atleast one Female ? "+anyMatch);


	}

	static class Person {
		private final String name;
		private final Gender gender;

		Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		MALE, FEMALE, PREFER_NOT_TO_SAY;
	}

}
