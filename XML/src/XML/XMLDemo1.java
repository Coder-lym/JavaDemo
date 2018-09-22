package XML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLDemo1 {
public static void main(String[] args) {
	try {
		/*
		 * 解析XML文件的基本流程：
		 * 1.创建SAXReader，用来读取XML文件
		 * 2.指定XML文件，使得SAXReader读取，并解析文档对象Document
		 * 3.获取根元素
		 * 4.获取每一个元素，从而达到解析的目的
		 */
		SAXReader reader=new SAXReader();
		/*
		 * 常用的读取方法
		 * 1.Document read(InputStream in)
		 * 2.Document read(Reader read)
		 * 3.Document read(File file)
		 */
		File xmlFile=new File("Emp.xml");
		
		//读取给定的XML文件，并将其解析转换为一个Document对象
		Document doc=reader.read(xmlFile);
		//获取根元素
		Element root =doc.getRootElement();
		
		/*
		 * Element element(String name)获取当前标签下的第一个名为给定名字的标签
		 * List elements(String name)获取当前标签下所有给定名字的标签
		 * List elements()获取当前标签下所有子标签 
		 */
		List<Element> elements=root.elements();
		
		/*
		 * 创建一个集合，用于保存XML中的每一个用户信息
		 * 先将用户信息取出，然后创建一个Emp实例，将信息设置到该实例的相应属性上。
		 * 最终将所有Emp对象存入该集合
		 */
		List<Emp> emps=new ArrayList<Emp>();
		
		//遍历每一个标签
		for(Element element:elements) {
			int id=Integer.parseInt(element.attribute("id").getValue());
			String name=element.elementText("name");
			int age=Integer.parseInt(element.elementText("age"));
			String gender=element.elementText("gender");
			double salary=Double.parseDouble(element.elementText("salary"));
			
			Emp emp=new Emp(id, name, age, gender, salary);
			emps.add(emp);
		}
		
		System.out.println("解析完毕");
		System.out.println(emps);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
