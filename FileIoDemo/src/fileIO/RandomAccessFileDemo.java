package fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
	RandomAccessFile raf=new RandomAccessFile("demo.dat","rw");
	//д��intֵ��    �Ͱ�λ������λ����������
    int num=97;
    raf.write(num);
    raf.close();
	}

}
