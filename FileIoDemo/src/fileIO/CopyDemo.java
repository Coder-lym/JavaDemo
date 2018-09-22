package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src.jpg");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\copy.jpg");
		
		byte[] b = new byte[1024];
		int len;
		while ((len = fis.read(b))!=-1) {
			fos.write(b,0,len);
		}
        System.out.println("¸´ÖÆÍê±Ï");
        fis.close();
        fos.close();
	}

}
