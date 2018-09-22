package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
		InetAddress iAddress = socket.getInetAddress();
		int port = socket.getPort();
		System.out.println("�ͻ���" + iAddress + ":" + port + "������!");
		serverSocket.close();
	}

}
