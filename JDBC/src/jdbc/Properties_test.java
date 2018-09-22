package jdbc;

import java.io.FileInputStream;
import java.util.Properties;

/*
 * 测试配置文件的读取
 * config.properties
 */
public class Properties_test {

	public static void main(String[] args) {
		try {
			/*
			 * properties类（java.util.Properties）用于读取properties文件
			 * 使用该类可以以类似于Map的形式读取配置文件中的内容
			 * 格式：user=root
			 * 等号左边就是key，等号右边就是value
			 */
			Properties prop=new Properties();
			
			//使用properties去读取配置文件
			FileInputStream fis=new FileInputStream("src/jdbc/config.properties");
			prop.load(fis);
			fis.close();
			System.out.println("已成功加载配置文件");
			
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
