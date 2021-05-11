package streams;

import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String> names=List.of("Peter","Shyam","Greg","Ryan");
		
		//Imperative
		for(String name:names) {
			if(!name.equals("Shyam")) {
				System.out.println(name);
			}
		}
		
		//Declarative
		
		names.stream()
			.filter(name -> !name.equals("Shyam"))
			.forEach(System.out::println);
		

	}

}
