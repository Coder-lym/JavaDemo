package fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("test.txt", "rw");
		
		String str="�Ұ������찲��";
	//String��getBytes()���� ����ǰ�ַ������յ�ǰϵͳĬ�ϵ��ַ���ת��Ϊ��Ӧ���ֽ�
		byte[] buf=str.getBytes();
		
		raf.write(buf);
        raf.close();
	}

}
