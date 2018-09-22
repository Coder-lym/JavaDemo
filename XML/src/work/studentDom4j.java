package work;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class studentDom4j {

	public static void main(String[] args) throws DocumentException {
		List<student> dom4j = Dom4j(new File("student.xml"));
		System.out.println(dom4j.toString());

	}

	public static List<student> Dom4j(File file) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document doc = saxReader.read(file);
		Element root = doc.getRootElement();
		List<Element> elements = root.elements();

		List<student> students = new ArrayList<student>();
		for (Element student : elements) {
			int id = Integer.parseInt(student.attribute("id").getValue());
			String name = student.elementText("name");
			int age = Integer.parseInt(student.elementText("age"));
			String address = student.element("address").elementText("city");

			student stu = new student(id, name, age, address);
			students.add(stu);
		}
		return students;
	}

}

class student {
	private int id;
	private String name;
	private int age;
	private String address;

	public student(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student[id=" + id + ",name=" + name + ",age=" + age + ",address=" + address + "]";
	}
}