package ThreadCall;

import java.util.ArrayList;
import java.util.List;

public class PhoneBox {
	private static final int PhoneBox_VOL = 10;
	private List<Phone> box = new ArrayList<>();
	
    //取出手机
	public synchronized Phone pop() throws InterruptedException {
		if (box.size() == 0) {
			this.wait();
		}
		Phone phone = box.remove(box.size() - 1);
		System.out.println("消费："+phone);
		this.notify();
		return phone;
	}
	//放入手机
	public synchronized void push(Phone phone) throws Exception {
		if (box.size() == PhoneBox_VOL) {
			this.wait();
		}
		box.add(phone);
		System.out.println("生产："+phone);
		this.notify();
	}

}
