package streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {

	public static void main(String[] args) {
		List<String> names=List.of("Peter","Shyam","Greg","Ryan");
		
		
		names.stream()
		.filter(name -> !name.equals("Shyam"))
		.map(User::new)
		.forEach(System.out::println);
		
		boolean anyMatch = names.stream().anyMatch(name -> name.equals("Greg"));
		
		names.stream()
		.filter(name -> !name.equals("Shyam"))
		.map(User::new)
		.collect(Collectors.toList());
	}
	
	static class User{
		private String name;
		private Integer age=30;
		
		public User(String name) {
			this.name = name;
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
