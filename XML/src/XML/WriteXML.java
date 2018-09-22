package XML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class WriteXML {

	public static void main(String[] args) throws Exception {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "������", 22));
		students.add(new Student(2, "������", 22));
		students.add(new Student(3, "������", 20));
		students.add(new Student(4, "��˼��", 21));
//		System.out.println(students);
		/*
		 * ����һ��XML�Ļ������裺
         * 1�������ĵ�����Document 
         * 2��ΪDocument��Ӹ��ڵ� 
         * 3��Ϊ���ڵ��齨��״�ṹ 
         * 4������XMLWriter
		 * 5��ΪXMLWriterָ��д��Ŀ��·�� 
		 * 6��д��XML
		 */
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("students");
		
		for (Student student : students) {
			Element ele = root.addElement("student");
			ele.addAttribute("id", student.getId()+"");
			ele.addElement("name").addText(student.getName()+"");
			ele.addElement("age").addText(student.getAge()+"");
		}

//		XMLproducer(doc);
		XMLproducer2(doc);

	}

	public static void XMLproducer(Document doc) throws Exception {
		XMLWriter xWriter = new XMLWriter();
		FileOutputStream fos = new FileOutputStream(new File("builder.xml"));
		xWriter.setOutputStream(fos);
		xWriter.write(doc);
		xWriter.close();
	}
	public static void XMLproducer2(Document doc) throws Exception {
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		XMLWriter xmlWriter = new XMLWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\student.xml"), format);
		xmlWriter.write(doc);
		xmlWriter.close();
	}

}
