package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {

		// Without Predicate
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("090aabb0000"));

		// With Predicate Functional Programming
		System.out.println(isPhoneNumberValidFunctional.test("07000000000"));
		System.out.println(isPhoneNumberValidFunctional.test("070000000"));
		System.out.println(isPhoneNumberValidFunctional.test("090aabb0000"));
		
		//Combining two Predicates
		System.out.println("Is phone number valid and contains 3 "+
				isPhoneNumberValidFunctional.and(contains3).test("07000030000"));
		
		System.out.println("Is phone number valid or contains 3 "+
				isPhoneNumberValidFunctional.or(contains3).test("07000030000"));

	}

	static Predicate<String> isPhoneNumberValidFunctional = phoneNumber -> phoneNumber.startsWith("07")
			&& phoneNumber.length() == 11;

	static Predicate<String> contains3 = phoneNumber -> phoneNumber.contains("3")
			&& phoneNumber.length() == 11;

	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}

}
