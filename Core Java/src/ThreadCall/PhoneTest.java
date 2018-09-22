package ThreadCall;

public class PhoneTest {

	public static void main(String[] args) {
		PhoneBox box = new PhoneBox();
		new Thread(new producePhone(box)).start();
		new Thread(new customPhone(box)).start();

	}

}
