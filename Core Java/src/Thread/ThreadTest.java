package Thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread A = new Student("A");
		Thread B = new Student("B");
		Thread C = new Student("C");

		A.start();
		B.start();
		C.start();

	}
}

class Student extends Thread {

	static int appNum = 50;
	public static final String LOCK = new String();

	public Student(String name) {
		super(name);
	}

	@Override
	public void run() {

		while (appNum > 0) {
			synchronized (LOCK) {
				try {
					sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + "吃了第" + appNum + "个苹果");
				appNum--;
			}
		}

		super.run();
	}
}