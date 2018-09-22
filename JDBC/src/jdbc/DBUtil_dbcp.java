package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

//使用连接池技术管理数据库连接
public class DBUtil_dbcp {
  //数据库连接池
  private static BasicDataSource ds;
  //为不同线程管理连接
  private static ThreadLocal<Connection> tl;
  
  static {
	  try {
		Properties prop=new Properties();
		InputStream is=DBUtil_dbcp.class.getClassLoader().getResourceAsStream("jdbc//config.properties");
		prop.load(is);
		is.close();
		
		//初始化连接池
		ds=new BasicDataSource();
		//设置驱动(Class.forName())
		ds.setDriverClassName(prop.getProperty("driver"));
		//设置url
		ds.setUrl(prop.getProperty("url"));
		//设置数据库用户名
		ds.setUsername(prop.getProperty("user"));
		//设置数据库密码
		ds.setPassword(prop.getProperty("pwd"));
		
		//初始连接数量
	    ds.setInitialSize(Integer.parseInt(prop.getProperty("InitialSize")));
	    //最大连接数
	    ds.setMaxTotal(Integer.parseInt(prop.getProperty("MaxTotal")));
		//最大等待时间
	    ds.setMaxWaitMillis(Integer.parseInt(prop.getProperty("MaxWaitMillis")));
	    //最大空闲线程数
	    ds.setMaxIdle(Integer.parseInt(prop.getProperty("MaxIdle")));
	    //最小空闲线程数
	    ds.setMinIdle(Integer.parseInt(prop.getProperty("MinIdle")));
	
	    
	    
	    
	    
	    
	    //初始化线程本地
	    tl=new ThreadLocal<Connection>();
	  
	  } catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  
  public static Connection getConnection() throws SQLException {
	  //通过连接池获取空闲连接
	  Connection conn=ds.getConnection();
	  tl.set(conn);
	  return conn;
  }
  public static void closeConnection() {
	  try {
		Connection conn=tl.get();
		if (conn!=null) {
			/*
			 * 通过连接池获取的Connection的close()方法实际上并没有将连接关闭，而是将连接归还。
			 */
			conn.close();
			tl.remove();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
