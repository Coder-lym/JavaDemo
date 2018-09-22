package work;

import java.util.HashMap;

public class Bank {

	int custNum;
	HashMap<Integer,Customer> customers = new HashMap<>();

	public Bank() {
		super();
	}
	public void addCustomer(Customer customer) {
		
	}
	public Customer getCustomer(int index) {
		return null;
	}
	public HashMap<Integer, Customer> getAllCustomer(){
		return customers;
	}
	public int getCustomer() {
		return custNum;
	}
	
}
