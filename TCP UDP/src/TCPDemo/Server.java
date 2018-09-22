package TCPDemo;

import java.io.BufferedReader;
/*
 * 服务端应用程序
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// 运行在服务端的Socket
	private ServerSocket server;

	// 构造方法，用于初始化服务器
	public Server() throws IOException {
		// 创建Socket时需要指定服务端口
		try {
			System.out.println("初始化服务端");
			server = new ServerSocket(8088);
			System.out.println("初始化服务端完毕");
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	// 服务器开始工作的方法
	public void start() {
		try {
			/*
			 * ServerSocket的accept方法用于监听8088端口，等待客户连接 该方法是一个阻塞方法，直到一个客户端连接，
			 * 否则该方法一直阻塞。若一个客户端连接了，会返回该客户端的Socket
			 */
			System.out.println("等待客户端连接...");
			Socket socket = server.accept();
			// 获取客户端ip地址
			InetAddress address = socket.getInetAddress();
			// 获取客户端端口号
			int port = socket.getPort();
			System.out.println("客户端" + address + ":" + port + "已连接!");

			// 通过刚刚连上的客户端的Socket获取输入流，来读取客户端发来的信息
			InputStream in = socket.getInputStream();
            //将 字节流 转换成 字符流
			InputStreamReader isr = new InputStreamReader(in, "UTF-8");
            //将 字符流 转换成 缓冲字符流
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				System.out.println(address + "客户端" + port + "端口:" + br.readLine());
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
