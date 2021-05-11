package functionalinterface;

import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		int increment=increment(0);
		System.out.println(increment);
		
		//Using Function
		
		int increment2=incrementByOneFunction.apply(0);
		System.out.println(increment2);
		
		int multiply=multiplyBy10.apply(increment2);
		System.out.println(multiply);
		
		//combining two functions
		Function<Integer,Integer> addBy1andThenMultiplyBy10=
				incrementByOneFunction.andThen(multiplyBy10);
		System.out.println(addBy1andThenMultiplyBy10.apply(1));
		
		
		
	}
	static Function<Integer,Integer> incrementByOneFunction = i -> i+1;
	static Function<Integer,Integer> multiplyBy10 = i -> i*10;
	
	static int increment(int number) {
		return number+1;
	}

}
