package work;

public class SavingAccount extends Account {

	double rate;
	
	public SavingAccount(double balance) {
		super(balance);
	}
	public SavingAccount(double balance,double rate) {
		super(balance);
		this.rate=rate;
	}

}
