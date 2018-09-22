package WeChat;
/**
 * 客户端类
 * @author Administrator
 */

import java.net.Socket;

public class Client {
    // 客户端初始化
	private Socket socket;
	public Client() throws Exception {
		System.out.println("正在连接服务器...");
		try {
			socket = new Socket("localhost", 8088);
			System.out.println("已成功连接服务器！");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	// 客户端启动方法
	public void startClient() {
		Thread t1 = new Thread(new InputHandle(socket));
		t1.setDaemon(true);
		t1.start();
		new Thread(new OutputHandle(socket)).start();
	}
	
}
