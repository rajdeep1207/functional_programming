package functionalinterface;

import java.util.function.Consumer;

public class _BiConsumer {

	public static void main(String[] args) {
		
		//Imperative using Java Function
		Customer maria=new Customer("John", "9999");
		greetCustomer(maria);
		
		//Consumer Functional interface
		greetCustomerConsumer.accept(maria);
	}
	
	
	//Declarative using Consumer
	static Consumer<Customer> greetCustomerConsumer=customer -> 
		System.out.println("Hello: "+customer.customerName
			+" Thanks for registering phone number "+customer.customerPhoneNumber);
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello: "+customer.customerName
				+" Thanks for registering phone number "+customer.customerPhoneNumber);
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
