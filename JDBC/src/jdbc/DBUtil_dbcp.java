package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

//ʹ�����ӳؼ����������ݿ�����
public class DBUtil_dbcp {
  //���ݿ����ӳ�
  private static BasicDataSource ds;
  //Ϊ��ͬ�̹߳�������
  private static ThreadLocal<Connection> tl;
  
  static {
	  try {
		Properties prop=new Properties();
		InputStream is=DBUtil_dbcp.class.getClassLoader().getResourceAsStream("jdbc//config.properties");
		prop.load(is);
		is.close();
		
		//��ʼ�����ӳ�
		ds=new BasicDataSource();
		//��������(Class.forName())
		ds.setDriverClassName(prop.getProperty("driver"));
		//����url
		ds.setUrl(prop.getProperty("url"));
		//�������ݿ��û���
		ds.setUsername(prop.getProperty("user"));
		//�������ݿ�����
		ds.setPassword(prop.getProperty("pwd"));
		
		//��ʼ��������
	    ds.setInitialSize(Integer.parseInt(prop.getProperty("InitialSize")));
	    //���������
	    ds.setMaxTotal(Integer.parseInt(prop.getProperty("MaxTotal")));
		//���ȴ�ʱ��
	    ds.setMaxWaitMillis(Integer.parseInt(prop.getProperty("MaxWaitMillis")));
	    //�������߳���
	    ds.setMaxIdle(Integer.parseInt(prop.getProperty("MaxIdle")));
	    //��С�����߳���
	    ds.setMinIdle(Integer.parseInt(prop.getProperty("MinIdle")));
	
	    
	    
	    
	    
	    
	    //��ʼ���̱߳���
	    tl=new ThreadLocal<Connection>();
	  
	  } catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  
  public static Connection getConnection() throws SQLException {
	  //ͨ�����ӳػ�ȡ��������
	  Connection conn=ds.getConnection();
	  tl.set(conn);
	  return conn;
  }
  public static void closeConnection() {
	  try {
		Connection conn=tl.get();
		if (conn!=null) {
			/*
			 * ͨ�����ӳػ�ȡ��Connection��close()����ʵ���ϲ�û�н����ӹرգ����ǽ����ӹ黹��
			 */
			conn.close();
			tl.remove();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
