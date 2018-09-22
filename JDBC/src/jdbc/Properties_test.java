package jdbc;

import java.io.FileInputStream;
import java.util.Properties;

/*
 * ���������ļ��Ķ�ȡ
 * config.properties
 */
public class Properties_test {

	public static void main(String[] args) {
		try {
			/*
			 * properties�ࣨjava.util.Properties�����ڶ�ȡproperties�ļ�
			 * ʹ�ø��������������Map����ʽ��ȡ�����ļ��е�����
			 * ��ʽ��user=root
			 * �Ⱥ���߾���key���Ⱥ��ұ߾���value
			 */
			Properties prop=new Properties();
			
			//ʹ��propertiesȥ��ȡ�����ļ�
			FileInputStream fis=new FileInputStream("src/jdbc/config.properties");
			prop.load(fis);
			fis.close();
			System.out.println("�ѳɹ����������ļ�");
			
			String driver=prop.getProperty("driver").trim();
			String url=prop.getProperty("url").trim();
			String user=prop.getProperty("user").trim();
			String pwd=prop.getProperty("pwd").trim();
            System.out.println("driver:"+driver);
            System.out.println("url:"+url);
            System.out.println("user:"+user);
            System.out.println("pwd:"+pwd);
            
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
