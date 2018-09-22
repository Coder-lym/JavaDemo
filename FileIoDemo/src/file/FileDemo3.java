package file;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
    File file=new File("test.txt");
    if (file.exists()) {
		file.delete();
		System.out.println("删除文件成功！");
	}
	}

}
