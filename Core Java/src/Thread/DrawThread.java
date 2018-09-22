package Thread;

public class DrawThread implements Runnable {

	private Account account;
	private double drawAmount;

	/**
	 * @param name 线程名
	 * @param account 模拟用户账户
	 * @param drawAmount 当前取钱线程所取的钱数
	 */
	public DrawThread(Account account, double drawAmount) {
		this.account = account;
		this.drawAmount = drawAmount;
	}

	@Override
	public void run() {
		account.draw(drawAmount);
	}

}
