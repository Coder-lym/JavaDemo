package Thread;
/*
 * 第二种创建线程的方式
 * 定义线程体runnable
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
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("你是谁呀？");
	}
  }
}
class MyRunnable2 implements Runnable{
	public void run() {
		for (int i=0;i<10;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("我是修水管的。");
	}
  }
}