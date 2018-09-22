package XML;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class XMLstudent2 {

	// 解析XML文件原生方法
	public static void pasre() throws UnsupportedEncodingException {
		InputStream is = XMLstudent2.class.getClassLoader().getResourceAsStream("student.xml");
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
	
		String str = null;
		List<Student> students = new ArrayList<Student>();
		int id = 0;
		String name = "";
		int age = 0;
		try {
			while ((str = br.readLine()) != null) {
				if (!str.contains("</student>")) {
					if (str.trim().contains("<student ")) {
						String idString = str.trim().split("=")[1];
						id = Integer.parseInt(idString.substring(1, idString.lastIndexOf("\"")));
					}
					if (str.trim().contains("<name>")) {
						name = str.trim().substring(6, str.trim().lastIndexOf("</name>"));
					}
					if (str.trim().contains("<age>")) {
						age = Integer.parseInt(str.trim().substring(5, str.trim().lastIndexOf("</age>")));
					}
				} else {
					Student stu = new Student(id, name, age);
					students.add(stu);
				}
			}
			for (Student student : students) {
				System.out.println(student);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		XMLstudent2.pasre();
	}

}
