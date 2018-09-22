package fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo4 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("test.txt", "r");
		
		//读取
		byte[] buf=new byte[50];
		
		raf.read(buf);
		
		//从字节数组转化为对应的字符串
		String str=new String(buf);
		System.out.println(str.trim());
		
		raf.close();

	}

}
