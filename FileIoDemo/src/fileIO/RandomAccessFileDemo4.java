package fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo4 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("test.txt", "r");
		
		//��ȡ
		byte[] buf=new byte[50];
		
		raf.read(buf);
		
		//���ֽ�����ת��Ϊ��Ӧ���ַ���
		String str=new String(buf);
		System.out.println(str.trim());
		
		raf.close();

	}

}