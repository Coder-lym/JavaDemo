package XML;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Dom4jTest {

	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document doc = saxReader.read(new File("src\\student.xml"));
		// 获取根节点
		Element root = doc.getRootElement();
		// 获取当前元素的元素名
		String string = root.getName();
		System.out.println(string);
		// 获取当前标签下所有子标签
		List<Element> elements = root.elements();
		
		for (Element element : elements) {
			Attribute att = element.attribute("id");
			System.out.print(att.getName() + "=");
			System.out.println(att.getValue());
		}
		
		// XPath精准查找某节点
//		List<Node> node = doc.selectNodes("/students/student[@id='2']");
//		System.out.println(node.size());
		
		
		
		
		
		
		
		
		
		
		

	}

}
