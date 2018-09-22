package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

//ʹ�������ļ������ú͹���JDBC�������ݿ�
public class DBUtil {
	
	private static String url;
	private static String user;
	private static String pwd;
    //���ڹ���ͬ�߳�����ȡ������
	private static ThreadLocal<Connection> tl=new ThreadLocal<Connection>();
	
	
    //��̬��
	static {
		try {
			//��ȡ�����ļ�
			Properties prop=new Properties();
			InputStream is=DBUtil.class.getClassLoader().getResourceAsStream("jdbc//config.properties");
			prop.load(is);
			is.close();
			
			String driver=prop.getProperty("driver").trim();
			url=prop.getProperty("url").trim();
			user=prop.getProperty("user").trim();
			pwd=prop.getProperty("pwd").trim();
			
			//ע������
			Class.forName(driver);
			
		} catch (Exception e) {
           e.printStackTrace();
		}	
	}
	
	//��ȡ����
	public static Connection getConnection() throws Exception{
		try {
			Connection conn=DriverManager.getConnection(url,user,pwd);
			/*
			 * ThreadLocal��set�����Ὣ��ǰ�߳���Ϊkey������������ֵ��Ϊvalue�����ڲ���map�б��档
			 */
			tl.set(conn);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	//�ر�����
	public static void closeConnection() {
		try {
			Connection conn=tl.get();
			if (conn!=null) {
				conn.close();
				tl.remove();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
