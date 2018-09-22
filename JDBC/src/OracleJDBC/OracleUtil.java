package OracleJDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleUtil {

	private static String url;
	private static String user;
	private static String password;
	
	//静态块：读取配置文件，加载驱动
	static {
		try {
			Properties prop = new Properties();
			//读取配置文件 方法1：
			FileInputStream fis = new FileInputStream(new File("src\\OracleJDBC\\OracleConfig.properties"));
			//读取配置文件 方法2：
//			InputStream fis = OracleUtil.class.getClassLoader().getResourceAsStream("OracleJDBC\\OracleConfig.properties");
			
			prop.load(fis);
			fis.close();
			
			//获取配置文件信息
			String driver = prop.getProperty("driver").trim();
			url = prop.getProperty("url").trim();
			user = prop.getProperty("user").trim();
			password = prop.getProperty("password").trim();
			
			//注册驱动
			Class.forName(driver);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//获取连接
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	//关闭连接
	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}
