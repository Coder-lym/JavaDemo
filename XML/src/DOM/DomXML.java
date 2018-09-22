package DOM;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomXML {

	public static void main(String[] args) throws Exception {
		// 获取解析器工厂对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// 获取解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		// 解析xml文件，获取文档对象
		Document doc = builder.parse("src/student.xml");
		// 获取根节点
		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());

		NodeList childNodes = root.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node item = childNodes.item(i);
			switch (item.getNodeType()) {
			case Node.ELEMENT_NODE: {
				Element e = (Element) item;
				System.out.println(e.getTagName());
				System.out.println("获取元素名称：" + item.getNodeName());
				System.out.println("获取元素内容：" + item.getNodeValue());
				break;
			}
			case Node.COMMENT_NODE: {
				System.out.println("获取注释名称: " + item.getNodeName());
				System.out.println("获取注释内容：" + item.getNodeValue());
				break;
			}
			case Node.CDATA_SECTION_NODE: {
				System.out.println("获取CDATA名称：" + item.getNodeName());
				System.out.println("获取CDATA内容：" + item.getNodeValue());
				break;
			}
			case Node.TEXT_NODE: {
				System.out.println("获取文本节点名称：" + item.getNodeName());
				System.out.println("获取文本节点内容：" + item.getNodeValue());
				break;
			}
			}
		}

	}

}
