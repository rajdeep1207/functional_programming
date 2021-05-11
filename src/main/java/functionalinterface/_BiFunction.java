package functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {

	public static void main(String[] args) {
		int increment=incrementByOneAndMultiply(0,10);
		System.out.println(increment);
		
		//BiFunction
		System.out.println(incrementByOneAndMultiplyBiFunction.apply(0, 10));
				
	}
	
	static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction=
			(a,b)-> (a+1)*b;
			
	
	static int incrementByOneAndMultiply(int number,int numToMultiplyBy) {
		return (number+1)*10;
	}

}

