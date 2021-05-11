package streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapperIntExample {

	public static void main(String[] args) {
		List<String> names=List.of("Peter","Shyam","Greg","Ryan");
		
		
		names.stream()
		.filter(name -> !name.equals("Shyam"))
		.map(User::new)
		.forEach(System.out::println);
		
		List<User> userList=names.stream()
		.filter(name -> !name.equals("Shyam"))
		.map(User::new)
		.collect(Collectors.toList());
		
		int sumOfAges=userList.stream()
		.mapToInt(User::getAge)
		.sum();
		System.out.println("Sum of all ages: "+sumOfAges);
		
		int sumOfAgesUsingReduce=
				userList.stream().map(user -> user.getAge()).reduce(0,(a,b) -> a+b);
		
		long count=userList.parallelStream().count();
		
		System.out.println("Sum of all ages using ages: "+sumOfAgesUsingReduce);
		
		
		
		//userList.parallelStream().forEach(System.out::println);
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
