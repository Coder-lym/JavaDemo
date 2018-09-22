package fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("test.txt", "rw");
		
		String str="我爱北京天安门";
	//String的getBytes()方法 将当前字符串按照当前系统默认的字符集转换为对应的字节
		byte[] buf=str.getBytes();
		
		raf.write(buf);
        raf.close();
	}

}
