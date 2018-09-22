package DOM;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomXML {

	public static void main(String[] args) throws Exception {
		// ��ȡ��������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// ��ȡ������
		DocumentBuilder builder = factory.newDocumentBuilder();
		// ����xml�ļ�����ȡ�ĵ�����
		Document doc = builder.parse("src/student.xml");
		// ��ȡ���ڵ�
		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());

		NodeList childNodes = root.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node item = childNodes.item(i);
			switch (item.getNodeType()) {
			case Node.ELEMENT_NODE: {
				Element e = (Element) item;
				System.out.println(e.getTagName());
				System.out.println("��ȡԪ�����ƣ�" + item.getNodeName());
				System.out.println("��ȡԪ�����ݣ�" + item.getNodeValue());
				break;
			}
			case Node.COMMENT_NODE: {
				System.out.println("��ȡע������: " + item.getNodeName());
				System.out.println("��ȡע�����ݣ�" + item.getNodeValue());
				break;
			}
			case Node.CDATA_SECTION_NODE: {
				System.out.println("��ȡCDATA���ƣ�" + item.getNodeName());
				System.out.println("��ȡCDATA���ݣ�" + item.getNodeValue());
				break;
			}
			case Node.TEXT_NODE: {
				System.out.println("��ȡ�ı��ڵ����ƣ�" + item.getNodeName());
				System.out.println("��ȡ�ı��ڵ����ݣ�" + item.getNodeValue());
				break;
			}
			}
		}

	}

}
