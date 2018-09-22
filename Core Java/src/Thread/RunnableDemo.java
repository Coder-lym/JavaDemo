package Thread;
/*
 * �ڶ��ִ����̵߳ķ�ʽ
 * �����߳���runnable
 */
public class RunnableDemo {

	public static void main(String[] args) {
		Runnable run1=new MyRunnable1();
		Runnable run2=new MyRunnable2();
		
		Thread t1=new Thread(run1);
		Thread t2=new Thread(run2);
		
		t1.start();
		t2.start();
	}

}

class MyRunnable1 implements Runnable{
	public void run() {
		for (int i=0;i<10;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("����˭ѽ��");
	}
  }
}
class MyRunnable2 implements Runnable{
	public void run() {
		for (int i=0;i<10;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("������ˮ�ܵġ�");
	}
  }
}