package Thread;

public class accountTest {

	public static void main(String[] args) {
		// �����˻�
		Account account = new Account("123456", 5000);
		// ģ������ȡǮ�߳�
		/**
		 * Thread(Runnable target, String name)
		 */
		new Thread(new DrawThread(account, 800), "��").start();
		new Thread(new DrawThread(account, 800), "��").start();
		new Thread(new DrawThread(account, 800), "��").start();
		new Thread(new DrawThread(account, 800), "��").start();
	}

}
