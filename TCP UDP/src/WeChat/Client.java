package WeChat;
/**
 * �ͻ�����
 * @author Administrator
 */

import java.net.Socket;

public class Client {
    // �ͻ��˳�ʼ��
	private Socket socket;
	public Client() throws Exception {
		System.out.println("�������ӷ�����...");
		try {
			socket = new Socket("localhost", 8088);
			System.out.println("�ѳɹ����ӷ�������");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	// �ͻ�����������
	public void startClient() {
		Thread t1 = new Thread(new InputHandle(socket));
		t1.setDaemon(true);
		t1.start();
		new Thread(new OutputHandle(socket)).start();
	}
	
}
