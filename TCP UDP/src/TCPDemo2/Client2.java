package TCPDemo2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//�ͻ���Ӧ�ó���
public class Client2 {
	// Socket,�������ӷ���˵�ServerSocket
	private Socket socket;

	// �ͻ��˹��췽�������ڳ�ʼ���ͻ���
	public Client2() throws Exception {
		try {
			// ����Socket����ʱ���ͻ᳢�Ը��ݸ����ĵ�ַ��˿����ӷ���ˡ� ���ԣ����ö��󴴽��ɹ���˵������������������
			System.out.println("�������ӷ����...");
			socket = new Socket("localhost", 8088);
			System.out.println("�ɹ����ӷ����");
		} catch (Exception e) {
			throw e;
		}
	}

	// �ͻ�����������
	public void start() {
		try {
			//����ͨ��Socket��getOutputStream()������ȡһ��������� ���ڽ���Ϣ�����������
			OutputStream out = socket.getOutputStream();
			//ʹ���ַ���������ָ���ı��뼯���ַ���ת��Ϊ�ֽں���ͨ��out���������
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			//���ַ�����װΪ�����ַ������Ϳ��԰���Ϊ��λд���ַ���
			PrintWriter pw = new PrintWriter(osw, true);
			// ����Scanner�����ڽ����û����������
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
			System.out.println("�ͻ��˳�ʼ��ʧ��");
		}

	}

}
