package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
	//File.separator表示不同系统的目录层级分隔符，为了忽略平台差异性
     File file=new File("."+File.separator+"demo.txt");
     if (!file.exists()) {
 		file.createNewFile();
 		System.out.println("创建文件成功！");
 	}
     System.out.println(file);
     String fileName=file.getName();
     System.out.println(fileName);
     
     //boolean exists()判断当前file表示的文件或目录是否真实存在
     boolean exists=file.exists();
     System.out.println("是否存在："+exists);
     
     long length=file.length();
     System.out.println("大小："+length+"字节");
	}

}
