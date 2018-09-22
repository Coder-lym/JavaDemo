package ThreadCall;

public class producePhone implements Runnable {

	private PhoneBox box;

	public producePhone(PhoneBox box) {
		super();
		this.box = box;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				box.push(new Phone(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
