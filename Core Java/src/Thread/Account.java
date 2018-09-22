package Thread;

/**
 * �˻��� ����ͬ���������Ǿ�̬����������ʽָ��ͬ����������ͬ��������ͬ������������this��Ҳ���ǵ��ø÷����Ķ���
 * ��ͬ������飺synchronized(obj){} ����ʽָ��ͬ��������obj
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

	// ͬ������
	public synchronized void draw(double drawAmount) {
		String threadName = Thread.currentThread().getName();
		if (balance >= drawAmount) {
			// �³���Ʊ
			System.out.println(threadName + " ȡǮ�ɹ����³���Ʊ��" + drawAmount);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// �޸Ľ��
			balance -= drawAmount;
			System.out.println("�˻����Ϊ��" + balance);
		} else {
			System.out.println(threadName + " ���㣬ȡǮʧ�ܣ�");
		}
	}

}
