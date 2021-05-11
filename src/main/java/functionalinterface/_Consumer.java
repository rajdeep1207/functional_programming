package functionalinterface;

import java.util.function.BiConsumer;

public class _Consumer {

	public static void main(String[] args) {
		
		//Imperative using Java Function
		Customer maria=new Customer("John", "9999");
		greetCustomer(maria,false);
		
		//Consumer Functional interface
		greetCustomerBiConsumer.accept(maria,false);
	}
	
	
	//Declarative using Consumer
	static BiConsumer<Customer,Boolean> greetCustomerBiConsumer=(customer,showPhoneNumber) -> 
		System.out.println("Hello: "+customer.customerName
			+" Thanks for registering phone number "+
				(showPhoneNumber?customer.customerPhoneNumber:"*******"));
	
	static void greetCustomer(Customer customer,boolean showPhoneNumber) {
		System.out.println("Hello: "+customer.customerName
				+" Thanks for registering phone number "+
					(showPhoneNumber?customer.customerPhoneNumber:"*******"));
	}
	
	static class Customer{
		private final String customerName;
		private final String customerPhoneNumber;
		
		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
		
		
	}

}
