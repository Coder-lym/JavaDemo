package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.dat");
		
//		String str="我爱中国共产党";
//		byte[] buf=str.getBytes("UTF-8");
//		fos.write(buf);
		
		fos.write(97);
		
		
		
		fos.close();

	}

}
