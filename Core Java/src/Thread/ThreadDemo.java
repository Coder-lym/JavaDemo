package Thread;
/*��һ�ִ����̵߳ķ�ʽ
 * �̳�Thread�࣬��дrun����*/
 
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		
		/*
		 * start�������ڽ��߳������̵߳��ȣ���ʱ���߳̽���runnable
		 * ״̬���ȴ��̵߳��ȷ���ʱ��Ƭ�Ρ�
		 * ���̵߳��Ƚ�ʱ��Ƭ�η������ǰ�̣߳����̵߳�run�����ſ�ʼִ�С�
		 * ֱ���̵߳�run����ִ����ϣ��߳̽��������ձ����ա�
		 * ���̵߳�run����ִ���ڼ䣬���̴߳�������ͣͣ��
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("����˭ѽ��");
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("���ǲ�ˮ��ġ�");
		}
	}
}