package ThreadCall;

public class customPhone implements Runnable {

	private PhoneBox box;

	public customPhone(PhoneBox box) {
		super();
		this.box = box;
	}

	@Override
	public void run() {
        for (int i = 1; i <= 20; i++) {
			try {
				box.pop();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
