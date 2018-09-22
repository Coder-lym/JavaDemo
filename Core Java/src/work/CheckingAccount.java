package work;

public class CheckingAccount extends Account {

	double overdraft;
	
	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double overdraft) {
		super(balance);
		this.overdraft = overdraft;
	}
	
	@Override
	public boolean withdraw(double amount) {
		return false;
	}

	public boolean getOverdraft(){
		return false;
	}
	
	
}
