package Thread;

/**
 * 售票线程类
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
				// 操作：售出一张票
				System.out.println(threadName + "：第" + tic.getCount() + "张票已售出！");
				// 操作：售出一张票后，总票数减1
				tic.setCount(tic.getCount() - 1);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				// 当票数为0是输出“票已售空"
				// 因为while还在循环，所以要减1，否则会进入“票已售空”无限死循环
				tic.setCount(tic.getCount() - 1);
				System.out.println(threadName + "的票已售空！");
			}
		}

	}

}
