package ThreadCall;

import java.util.ArrayList;
import java.util.List;

public class PhoneBox {
	private static final int PhoneBox_VOL = 10;
	private List<Phone> box = new ArrayList<>();
	
    //ȡ���ֻ�
	public synchronized Phone pop() throws InterruptedException {
		if (box.size() == 0) {
			this.wait();
		}
		Phone phone = box.remove(box.size() - 1);
		System.out.println("���ѣ�"+phone);
		this.notify();
		return phone;
	}
	//�����ֻ�
	public synchronized void push(Phone phone) throws Exception {
		if (box.size() == PhoneBox_VOL) {
			this.wait();
		}
		box.add(phone);
		System.out.println("������"+phone);
		this.notify();
	}

}
