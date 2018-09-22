package work;

public class Account {

	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		return false;
	}
    
	public boolean withdraw(double amount) {
		return false;
	}
}
