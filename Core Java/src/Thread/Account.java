package Thread;

/**
 * 账户类 含有同步方法（非静态），无需显式指定同步监视器，同步方法的同步监视器就是this，也就是调用该方法的对象
 * 而同步代码块：synchronized(obj){} 需显式指定同步监视器obj
 * 
 * @author Administrator
 *
 */
public class Account {

	private String accountNo;
	private double balance;

	public Account() {
	}

	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// 同步方法
	public synchronized void draw(double drawAmount) {
		String threadName = Thread.currentThread().getName();
		if (balance >= drawAmount) {
			// 吐出钞票
			System.out.println(threadName + " 取钱成功！吐出钞票：" + drawAmount);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 修改金额
			balance -= drawAmount;
			System.out.println("账户余额为：" + balance);
		} else {
			System.out.println(threadName + " 金额不足，取钱失败！");
		}
	}

}
