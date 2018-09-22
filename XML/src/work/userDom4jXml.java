package work;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class userDom4jXml {

	public static void main(String[] args) throws DocumentException, IOException {
		List<user> list = userDom4j(new File("user.xml"));
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("records");
		for (user user : list) {
			Element record = root.addElement("record");
			record.addElement("name").addText(user.getName());
			record.addElement("price").addText(user.getPrice()+"");
		}
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		XMLWriter xmlWriter = new XMLWriter(new FileWriter("userBuilder.xml"), format);
		xmlWriter.write(doc);
		xmlWriter.close();
		System.out.println("写出XML文件成功！");
	}

	public static List<user> userDom4j(File file) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document doc = saxReader.read(file);
		Element root = doc.getRootElement();
		List<Element> elements = root.elements();

		List<user> uList = new ArrayList<user>();
		for (Element e : elements) {
			String name = e.attribute("name").getValue();
			double price = Double.parseDouble(e.getText());
			user user = new user(name, price);
			uList.add(user);

		}
		return uList;
	}

}

class user {
	private String name;
	private double price;

	public user(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "user[name=" + name + ",price=" + price + "]";
	}
}