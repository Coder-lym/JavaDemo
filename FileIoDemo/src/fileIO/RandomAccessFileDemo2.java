package fileIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rdf=new RandomAccessFile("demo.dat", "r");
		
		//¶ÁÈ¡Êý¾Ý
		int i=rdf.read();
		System.out.println(i);
		rdf.close();

	}

}
