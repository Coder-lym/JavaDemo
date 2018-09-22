package file;

import java.io.File;

public class ListFile {

	public static void main(String[] args) {
		File file = new File("E:\\ǰ�˿�����Ƶ�ϼ�");
        list(file);
	}
	
	public static void list(File file) {
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f);
			if (f.isDirectory()) {
				list(f);
			}
		}
	}

}
