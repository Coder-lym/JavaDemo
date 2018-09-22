package file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FilenameFilterDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\�ļ�");
		String[] fileNames=file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File arg0, String name) {
				
				return name.contains("������");
			}
		});
		
		for (String string : fileNames) {
			System.out.println(string);
		}
	}

}
