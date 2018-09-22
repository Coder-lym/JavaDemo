package WeChat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * ��������
 * @author Administrator 
 */
public class Server {
	// ��������ʼ��
	private ServerSocket serverSocket;
	public Server() throws IOException {
		System.out.println("���ڳ�ʼ��������...");
		try {
			serverSocket = new ServerSocket(8088);
			System.out.println("��������ʼ����ϣ�");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	// ��������������:
    public void startServer(){
    	Socket socket;
    	List<Socket> list = new ArrayList<Socket>();
		try {
			while (true) {
				System.out.println("�ȴ��ͻ�������...");
				socket = serverSocket.accept();
				InetAddress address = socket.getInetAddress();
				int port = socket.getPort();
				System.out.println("�ͻ���"+address+":"+port+"�����ӣ�");
				list.add(socket);
				
				//���ӽ�һ���ͻ��ˣ��ʹ���IO�߳��������ÿͻ��˵Ľ���
				for (Socket soc : list) {
					new Thread(new OutputHandle(soc)).start();
					new Thread(new InputHandle(soc)).start();
				}
				System.out.println("�����ӵĿͻ���������"+list.size());
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
