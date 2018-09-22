package fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
	RandomAccessFile raf=new RandomAccessFile("demo.dat","rw");
	//写入int值的    低八位（最后八位二进制数）
    int num=97;
    raf.write(num);
    raf.close();
	}

}
