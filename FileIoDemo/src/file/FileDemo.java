package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
	//File.separator��ʾ��ͬϵͳ��Ŀ¼�㼶�ָ�����Ϊ�˺���ƽ̨������
     File file=new File("."+File.separator+"demo.txt");
     if (!file.exists()) {
 		file.createNewFile();
 		System.out.println("�����ļ��ɹ���");
 	}
     System.out.println(file);
     String fileName=file.getName();
     System.out.println(fileName);
     
     //boolean exists()�жϵ�ǰfile��ʾ���ļ���Ŀ¼�Ƿ���ʵ����
     boolean exists=file.exists();
     System.out.println("�Ƿ���ڣ�"+exists);
     
     long length=file.length();
     System.out.println("��С��"+length+"�ֽ�");
	}

}
