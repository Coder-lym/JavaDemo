package Thread;

public class accountTest {

	public static void main(String[] args) {
		// 创建账户
		Account account = new Account("123456", 5000);
		// 模拟两个取钱线程
		/**
		 * Thread(Runnable target, String name)
		 */
		new Thread(new DrawThread(account, 800), "甲").start();
		new Thread(new DrawThread(account, 800), "乙").start();
		new Thread(new DrawThread(account, 800), "丙").start();
		new Thread(new DrawThread(account, 800), "丁").start();
	}

}
