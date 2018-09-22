package file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
public static void main(String[] args) throws IOException {
	File file=new File("test.txt");
	if (!file.exists()) {
		file.createNewFile();
		System.out.println("创建文件成功！");
	}
}
}
