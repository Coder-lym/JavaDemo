package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		DatagramSocket dSocket = new DatagramSocket();
		byte[] buf = "这里是发送端！".getBytes();
		DatagramPacket dPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 10000);
        dSocket.send(dPacket);
        dSocket.close();
	}

}
