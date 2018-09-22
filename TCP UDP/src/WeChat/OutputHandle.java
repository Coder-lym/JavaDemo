package WeChat;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 * 发送消息线程
 * @author Administrator
 */
public class OutputHandle implements Runnable {
	private Socket socket;

	public OutputHandle() {
		super();
	}

	public OutputHandle(Socket socket) {
		super();
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			PrintWriter pw = new PrintWriter(osw, true);
			Scanner scanner = new Scanner(System.in);
			while (true) {
				String str = scanner.nextLine();
				pw.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
