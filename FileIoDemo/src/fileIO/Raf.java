package fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Raf {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rFile = new RandomAccessFile("demo.dat", "rw");
		long p = rFile.getFilePointer();
		System.out.println(p);
		
		rFile.write(97);
		System.out.println(rFile.getFilePointer());

		
		rFile.close();
	}

}
