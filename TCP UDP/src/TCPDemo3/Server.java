package TCPDemo3;

import java.io.BufferedReader;
/*
 * �����Ӧ�ó���
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket server;

	public Server() throws IOException {
		try {
			System.out.println("��ʼ�������");
			server = new ServerSocket(8088);
			System.out.println("��ʼ����������");
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	// �����߳��壬ѭ����ȡ�ͻ��˷��͵���Ϣ
	private class ClientHandler implements Runnable {
		private Socket socket;

		public ClientHandler(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				InetAddress address = socket.getInetAddress();
				int port = socket.getPort();
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(isr);

				while (true) {
					System.out.println(address + "�ͻ���" + port + "�˿�:" + br.readLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// ��������ʼ�����ķ���
	public void start() {
		try {
			while (true) {
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				InetAddress address = socket.getInetAddress();
				int port = socket.getPort();
				System.out.println("�ͻ���" + address + ":" + port + "������!");

				// ����һ���߳��������Ըÿͻ��˵Ľ���
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
//				t.setDaemon(true);
				t.start();
				
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
				PrintWriter pw = new PrintWriter(osw, true);

				Scanner scanner = new Scanner(System.in);
				while (true) {
					String str = scanner.nextLine();
					pw.println(str);
				}
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
