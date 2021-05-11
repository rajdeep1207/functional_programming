package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		System.out.println(getDBConnectionURL());
		System.out.println(getDBConectionURLSupplier.get());

	}
	
	static Supplier<String> getDBConectionURLSupplier=
			() -> "jdbc://localhost:5432/users";
	
	static String getDBConnectionURL() {
		return "jdbc://localhost:5432/users";
	}

}
