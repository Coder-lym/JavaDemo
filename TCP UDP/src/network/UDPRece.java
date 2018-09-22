package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPRece {

	public static void main(String[] args) throws Exception {
		DatagramSocket dSocket = new DatagramSocket(10000);
		byte[] buf = new byte[1024];
		DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
		dSocket.receive(dPacket);
		String data = new String(dPacket.getData(), 0, dPacket.getLength());
		System.out.println(data);
		dSocket.close();

	}

}
