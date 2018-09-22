package ThreadCall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);

		// �����̳߳�Ҫִ�е�����
		for (int i = 0; i < 3; i++) {
			Handler h = new Handler();
			threadPool.execute(h);

		}
	}

}

class Handler implements Runnable {

	@Override
	public void run() {
		// ÿ��һ�������ǰ�̵߳�����
		String tname = Thread.currentThread().getName();
		System.out.println("ִ�е�ǰ������߳�Ϊ��" + tname);
		for (int i = 0; i < 5; i++) {
			System.out.println(tname + ":" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tname + "������ϣ�");
	}

}