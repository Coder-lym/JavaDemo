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
		students.add(new Student(1, "梁玉民", 22));
		students.add(new Student(2, "齐玳萱", 22));
		students.add(new Student(3, "罗明智", 20));
		students.add(new Student(4, "成思潮", 21));
//		System.out.println(students);
		/*
		 * 生成一个XML的基本步骤：
         * 1、创建文档对象Document 
         * 2、为Document添加根节点 
         * 3、为根节点组建树状结构 
         * 4、创建XMLWriter
		 * 5、为XMLWriter指定写出目标路径 
		 * 6、写出XML
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
