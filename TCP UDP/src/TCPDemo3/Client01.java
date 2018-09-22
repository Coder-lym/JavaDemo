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
			System.out.println("�������ӷ����...");
			socket=new Socket("localhost", 8088);
			System.out.println("�ɹ����ӷ����");
		} catch (Exception e) {
			throw e;
		}
	}
	
	//�����߳��壬ѭ����ȡ����˷��͵���Ϣ
	public class Serverhandler implements Runnable{

		public void run() {
			try {
			InputStream in=socket.getInputStream();
    		InputStreamReader isr=new InputStreamReader(in,"UTF-8");
    		BufferedReader br=new BufferedReader(isr);
    		
    		while (true) {
				System.out.println("����ˣ�"+br.readLine());
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//�ͻ�����������
	public void start() {
		try {
			//�����շ������Ϣ���߳�����
			Serverhandler handler=new Serverhandler();
			Thread t=new Thread(handler);
//			t.setDaemon(true);
			t.start();
			
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out, "UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			
			//����Scanner�����ڽ����û����������
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
			 System.out.println("�ͻ��˳�ʼ��ʧ��");
		}

	}

}
