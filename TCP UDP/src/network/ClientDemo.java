package network;

import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 8888);
		System.out.println("�ɹ����ӷ����");
	}

}
