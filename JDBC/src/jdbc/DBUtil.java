package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

//使用配置文件来配置和管理JDBC连接数据库
public class DBUtil {
	
	private static String url;
	private static String user;
	private static String pwd;
    //用于管理不同线程所获取的连接
	private static ThreadLocal<Connection> tl=new ThreadLocal<Connection>();
	
	
    //静态块
	static {
		try {
			//读取配置文件
			Properties prop=new Properties();
			InputStream is=DBUtil.class.getClassLoader().getResourceAsStream("jdbc//config.properties");
			prop.load(is);
			is.close();
			
			String driver=prop.getProperty("driver").trim();
			url=prop.getProperty("url").trim();
			user=prop.getProperty("user").trim();
			pwd=prop.getProperty("pwd").trim();
			
			//注册驱动
			Class.forName(driver);
			
		} catch (Exception e) {
           e.printStackTrace();
		}	
	}
	
	//获取连接
	public static Connection getConnection() throws Exception{
		try {
			Connection conn=DriverManager.getConnection(url,user,pwd);
			/*
			 * ThreadLocal的set方法会将当前线程作为key，并将给定的值作为value存入内部的map中保存。
			 */
			tl.set(conn);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	//关闭连接
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
