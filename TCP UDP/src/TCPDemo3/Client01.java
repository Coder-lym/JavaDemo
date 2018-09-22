package TCPDemo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	private Socket socket;
	
	public Client01() throws Exception {
		try {
			System.out.println("正在连接服务端...");
			socket=new Socket("localhost", 8088);
			System.out.println("成功连接服务端");
		} catch (Exception e) {
			throw e;
		}
	}
	
	//创建线程体，循环读取服务端发送的信息
	public class Serverhandler implements Runnable{

		public void run() {
			try {
			InputStream in=socket.getInputStream();
    		InputStreamReader isr=new InputStreamReader(in,"UTF-8");
    		BufferedReader br=new BufferedReader(isr);
    		
    		while (true) {
				System.out.println("服务端："+br.readLine());
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//客户端启动方法
	public void start() {
		try {
			//将接收服务端信息的线程启动
			Serverhandler handler=new Serverhandler();
			Thread t=new Thread(handler);
//			t.setDaemon(true);
			t.start();
			
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out, "UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			
			//创建Scanner，用于接收用户输入的内容
			Scanner scanner=new Scanner(System.in);
			while (true) {
				String str=scanner.nextLine();
				pw.println(str);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (socket!=null) {
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
			Client01 client=new Client01();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			 System.out.println("客户端初始化失败");
		}

	}

}
