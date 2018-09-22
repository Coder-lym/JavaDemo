package fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		File resourse = new File("music.mp3");
		File copy = new File("C:\\Users\\Administrator\\Desktop\\copy.mp3");
		FileInputStream fis = new FileInputStream(resourse);
		FileOutputStream fos = new FileOutputStream(copy);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] b = new byte[1024];
		int len;
		while ((len = bis.read(b)) != -1) {
			bos.write(b, 0, len);
		}
		System.out.println("¸´ÖÆÍê±Ï");
		bos.flush();
		bis.close();
		bos.close();

	}

}
