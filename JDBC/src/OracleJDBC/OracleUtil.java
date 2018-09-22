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
	
	//��̬�飺��ȡ�����ļ�����������
	static {
		try {
			Properties prop = new Properties();
			//��ȡ�����ļ� ����1��
			FileInputStream fis = new FileInputStream(new File("src\\OracleJDBC\\OracleConfig.properties"));
			//��ȡ�����ļ� ����2��
//			InputStream fis = OracleUtil.class.getClassLoader().getResourceAsStream("OracleJDBC\\OracleConfig.properties");
			
			prop.load(fis);
			fis.close();
			
			//��ȡ�����ļ���Ϣ
			String driver = prop.getProperty("driver").trim();
			url = prop.getProperty("url").trim();
			user = prop.getProperty("user").trim();
			password = prop.getProperty("password").trim();
			
			//ע������
			Class.forName(driver);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//��ȡ����
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	//�ر�����
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
