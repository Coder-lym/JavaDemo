package work;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	String name;
	List<Account> accounts = new ArrayList<>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public Account getAccount(int index) {
		return null;
	}

	public ArrayList<Account> getAllAccount() {
		return null;
	}

	public void addAccount(Account account) {

	}

	public String getName() {
		return name;
	}

}
