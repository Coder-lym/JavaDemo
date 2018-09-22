package TCPDemo3;

import java.io.BufferedReader;
/*
 * 服务端应用程序
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
			System.out.println("初始化服务端");
			server = new ServerSocket(8088);
			System.out.println("初始化服务端完毕");
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	// 创建线程体，循环读取客户端发送的信息
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
					System.out.println(address + "客户端" + port + "端口:" + br.readLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 服务器开始工作的方法
	public void start() {
		try {
			while (true) {
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				InetAddress address = socket.getInetAddress();
				int port = socket.getPort();
				System.out.println("客户端" + address + ":" + port + "已连接!");

				// 启动一个线程来完成针对该客户端的交互
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
			System.out.println("服务端初始化失败");
		}

	}

}
