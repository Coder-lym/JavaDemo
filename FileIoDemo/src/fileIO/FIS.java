package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FIS {

	public static void main(String[] args) throws IOException {
		// 1.ʹ��File���ҵ����ߴ���Դ���ļ���
		File file = new File("fos.dat");
		// 2.ʵ�����ֽ������ַ���������
		FileInputStream fis = new FileInputStream(file);
		// 3.���ж�д����
//		byte[] b = new byte[3];
//		int len;
//		while ((len=fis.read(b))!=-1) {
//			String str = new String(b, 0, len, "UTF-8");
//			System.out.print(str);
//		}

		byte[] b = new byte[1024];
		int len;
		StringBuffer sBuffer = new StringBuffer();
		while ((len=fis.read(b))!=-1) {
			sBuffer.append(new String(b, 0, len, "UTF-8"));
		}
		System.out.println(sBuffer.toString());
		
		// 4.�ر���
		fis.close();
		
		
	}
}