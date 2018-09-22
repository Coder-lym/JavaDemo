package Thread;

/**
 * ��Ʊ�߳���
 * 
 * @author Administrator
 */
public class SaleTicThread implements Runnable {

	private Ticket tic;

	public SaleTicThread(Ticket tic) {
		super();
		this.tic = tic;
	}

	public Ticket getTic() {
		return tic;
	}

	public void setTic(Ticket tic) {
		this.tic = tic;
	}

	@Override
	public void run() {
		sale();
	}

	public synchronized void sale() {
		String threadName = Thread.currentThread().getName();
		while (tic.getCount()>=0) {
			if (tic.getCount() > 0) {
				// �������۳�һ��Ʊ
				System.out.println(threadName + "����" + tic.getCount() + "��Ʊ���۳���");
				// �������۳�һ��Ʊ����Ʊ����1
				tic.setCount(tic.getCount() - 1);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				// ��Ʊ��Ϊ0�������Ʊ���ۿ�"
				// ��Ϊwhile����ѭ��������Ҫ��1���������롰Ʊ���ۿա�������ѭ��
				tic.setCount(tic.getCount() - 1);
				System.out.println(threadName + "��Ʊ���ۿգ�");
			}
		}

	}

}
