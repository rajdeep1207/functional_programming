package streams;

import java.util.List;
import java.util.Optional;

public class FlatMapExample {

	public static void main(String[] args) {
		List<User> users = List.of(new User("Peter", 20, List.of("1", "2")),
				new User("Sam", 40, List.of("3", "4", "5")), new User("Adam", 60, List.of("6")),
				new User("Peter", 70, List.of("7", "8")));
		
		
		
		Optional<String> stringOptional=users.stream()
			.map(user-> user.getPhoneNumbers().stream())
			.flatMap(number -> number.filter(x->x.equals("5"))).findAny();
		stringOptional.ifPresent(System.out::println);

	}

	static class User {
		private String name;
		private Integer age = 30;
		private List<String> phoneNumbers;

		public User(String name, Integer age, List<String> phoneNumbers) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNumbers = phoneNumbers;
		}

		public List<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		public void setPhoneNumbers(List<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}

	}

}
