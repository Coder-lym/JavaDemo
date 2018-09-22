package Thread;

public class DrawThread implements Runnable {

	private Account account;
	private double drawAmount;

	/**
	 * @param name �߳���
	 * @param account ģ���û��˻�
	 * @param drawAmount ��ǰȡǮ�߳���ȡ��Ǯ��
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
