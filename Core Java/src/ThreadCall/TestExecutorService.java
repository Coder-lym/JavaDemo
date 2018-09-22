package ThreadCall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);

		// 设置线程池要执行的任务
		for (int i = 0; i < 3; i++) {
			Handler h = new Handler();
			threadPool.execute(h);

		}
	}

}

class Handler implements Runnable {

	@Override
	public void run() {
		// 每隔一秒输出当前线程的名字
		String tname = Thread.currentThread().getName();
		System.out.println("执行当前任务的线程为：" + tname);
		for (int i = 0; i < 5; i++) {
			System.out.println(tname + ":" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tname + "任务完毕！");
	}

}