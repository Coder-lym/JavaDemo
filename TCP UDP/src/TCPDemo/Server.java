package TCPDemo;

import java.io.BufferedReader;
/*
 * �����Ӧ�ó���
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// �����ڷ���˵�Socket
	private ServerSocket server;

	// ���췽�������ڳ�ʼ��������
	public Server() throws IOException {
		// ����Socketʱ��Ҫָ������˿�
		try {
			System.out.println("��ʼ�������");
			server = new ServerSocket(8088);
			System.out.println("��ʼ����������");
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	// ��������ʼ�����ķ���
	public void start() {
		try {
			/*
			 * ServerSocket��accept�������ڼ���8088�˿ڣ��ȴ��ͻ����� �÷�����һ������������ֱ��һ���ͻ������ӣ�
			 * ����÷���һֱ��������һ���ͻ��������ˣ��᷵�ظÿͻ��˵�Socket
			 */
			System.out.println("�ȴ��ͻ�������...");
			Socket socket = server.accept();
			// ��ȡ�ͻ���ip��ַ
			InetAddress address = socket.getInetAddress();
			// ��ȡ�ͻ��˶˿ں�
			int port = socket.getPort();
			System.out.println("�ͻ���" + address + ":" + port + "������!");

			// ͨ���ո����ϵĿͻ��˵�Socket��ȡ������������ȡ�ͻ��˷�������Ϣ
			InputStream in = socket.getInputStream();
            //�� �ֽ��� ת���� �ַ���
			InputStreamReader isr = new InputStreamReader(in, "UTF-8");
            //�� �ַ��� ת���� �����ַ���
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				System.out.println(address + "�ͻ���" + port + "�˿�:" + br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("����˳�ʼ��ʧ��");
		}
		
	}

}
