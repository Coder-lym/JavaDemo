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
		 * ����XML�ļ��Ļ������̣�
		 * 1.����SAXReader��������ȡXML�ļ�
		 * 2.ָ��XML�ļ���ʹ��SAXReader��ȡ���������ĵ�����Document
		 * 3.��ȡ��Ԫ��
		 * 4.��ȡÿһ��Ԫ�أ��Ӷ��ﵽ������Ŀ��
		 */
		SAXReader reader=new SAXReader();
		/*
		 * ���õĶ�ȡ����
		 * 1.Document read(InputStream in)
		 * 2.Document read(Reader read)
		 * 3.Document read(File file)
		 */
		File xmlFile=new File("Emp.xml");
		
		//��ȡ������XML�ļ������������ת��Ϊһ��Document����
		Document doc=reader.read(xmlFile);
		//��ȡ��Ԫ��
		Element root =doc.getRootElement();
		
		/*
		 * Element element(String name)��ȡ��ǰ��ǩ�µĵ�һ����Ϊ�������ֵı�ǩ
		 * List elements(String name)��ȡ��ǰ��ǩ�����и������ֵı�ǩ
		 * List elements()��ȡ��ǰ��ǩ�������ӱ�ǩ 
		 */
		List<Element> elements=root.elements();
		
		/*
		 * ����һ�����ϣ����ڱ���XML�е�ÿһ���û���Ϣ
		 * �Ƚ��û���Ϣȡ����Ȼ�󴴽�һ��Empʵ��������Ϣ���õ���ʵ������Ӧ�����ϡ�
		 * ���ս�����Emp�������ü���
		 */
		List<Emp> emps=new ArrayList<Emp>();
		
		//����ÿһ����ǩ
		for(Element element:elements) {
			int id=Integer.parseInt(element.attribute("id").getValue());
			String name=element.elementText("name");
			int age=Integer.parseInt(element.elementText("age"));
			String gender=element.elementText("gender");
			double salary=Double.parseDouble(element.elementText("salary"));
			
			Emp emp=new Emp(id, name, age, gender, salary);
			emps.add(emp);
		}
		
		System.out.println("�������");
		System.out.println(emps);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
