package WeChat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 服务器类
 * @author Administrator 
 */
public class Server {
	// 服务器初始化
	private ServerSocket serverSocket;
	public Server() throws IOException {
		System.out.println("正在初始化服务器...");
		try {
			serverSocket = new ServerSocket(8088);
			System.out.println("服务器初始化完毕！");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	// 服务器启动方法:
    public void startServer(){
    	Socket socket;
    	List<Socket> list = new ArrayList<Socket>();
		try {
			while (true) {
				System.out.println("等待客户端连接...");
				socket = serverSocket.accept();
				InetAddress address = socket.getInetAddress();
				int port = socket.getPort();
				System.out.println("客户端"+address+":"+port+"已连接！");
				list.add(socket);
				
				//连接进一个客户端，就创建IO线程来完成与该客户端的交互
				for (Socket soc : list) {
					new Thread(new OutputHandle(soc)).start();
					new Thread(new InputHandle(soc)).start();
				}
				System.out.println("已连接的客户端总数："+list.size());
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
