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
		// ��ȡ���ڵ�
		Element root = doc.getRootElement();
		// ��ȡ��ǰԪ�ص�Ԫ����
		String string = root.getName();
		System.out.println(string);
		// ��ȡ��ǰ��ǩ�������ӱ�ǩ
		List<Element> elements = root.elements();
		
		for (Element element : elements) {
			Attribute att = element.attribute("id");
			System.out.print(att.getName() + "=");
			System.out.println(att.getValue());
		}
		
		// XPath��׼����ĳ�ڵ�
//		List<Node> node = doc.selectNodes("/students/student[@id='2']");
//		System.out.println(node.size());
		
		
		
		
		
		
		
		
		
		
		

	}

}
