package WeChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/**
 * ������Ϣ�߳�
 * @author Administrator
 */
public class InputHandle implements Runnable {

	private Socket socket;

	public InputHandle() {
		super();
	}

	public InputHandle(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			InetAddress address = socket.getInetAddress();
			int port = socket.getPort();
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while (true) {
				System.out.println(address + ":" + port + "�˿� ˵:" + br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
