package Thread;

public class RunnableTest {

	public static void main(String[] args) {
		Apple a = new Apple();
		new Thread(a, "A").start();
		new Thread(a, "B").start();
		new Thread(a, "C").start();
	}
}

class Apple implements Runnable {

	static int appNum = 50;

	@Override
	public void run() {
		eat();
	}

	public synchronized void eat() {
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (appNum > 0) {
				System.out.println(Thread.currentThread().getName() + "吃了第" + appNum + "个苹果");
				appNum--;
			}

		}
	}
}