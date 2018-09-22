package XML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLstudent {

	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document doc = saxReader.read(new File("student.xml"));
		Element root = doc.getRootElement();
		List<Element> elements = root.elements();
		
		List<Student> students = new ArrayList<Student>();
		for (Element element : elements) {
			int id = Integer.parseInt(element.attribute("id").getValue());
			String name = element.elementText("name");
			int age = Integer.parseInt(element.elementText("age"));
			
			Student student = new Student(id, name, age);
			students.add(student);
		}
		System.out.println(students.toString());

	}

}
