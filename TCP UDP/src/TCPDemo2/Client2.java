package TCPDemo2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//客户端应用程序
public class Client2 {
	// Socket,用于连接服务端的ServerSocket
	private Socket socket;

	// 客户端构造方法，用于初始化客户端
	public Client2() throws Exception {
		try {
			// 创建Socket对象时，就会尝试根据给定的地址与端口连接服务端。 所以，若该对象创建成功，说明与服务端连接正常。
			System.out.println("正在连接服务端...");
			socket = new Socket("localhost", 8088);
			System.out.println("成功连接服务端");
		} catch (Exception e) {
			throw e;
		}
	}

	// 客户端启动方法
	public void start() {
		try {
			//可以通过Socket的getOutputStream()方法获取一条输出流， 用于将信息发送至服务端
			OutputStream out = socket.getOutputStream();
			//使用字符流来根据指定的编码集将字符串转化为字节后，再通过out发给服务端
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			//将字符流包装为缓冲字符流，就可以按行为单位写出字符串
			PrintWriter pw = new PrintWriter(osw, true);
			// 创建Scanner，用于接收用户输入的内容
			Scanner scanner = new Scanner(System.in);
			while (true) {
				String str = scanner.nextLine();
				pw.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		try {
			Client2 client = new Client2();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("客户端初始化失败");
		}

	}

}
