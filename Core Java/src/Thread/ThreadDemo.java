package Thread;
/*第一种创建线程的方式
 * 继承Thread类，重写run方法*/
 
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		
		/*
		 * start方法用于将线程纳入线程调度，这时，线程进入runnable
		 * 状态，等待线程调度分配时间片段。
		 * 当线程调度将时间片段分配给当前线程，该线程的run方法才开始执行。
		 * 直到线程的run方法执行完毕，线程结束，最终被回收。
		 * 在线程的run方法执行期间，该线程处于走走停停。
		 */
        t1.start();
        t2.start();
	}

}

class MyThread1 extends Thread{
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("你是谁呀？");
		}
	}
}

class MyThread2 extends Thread{
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("我是查水表的。");
		}
	}
}