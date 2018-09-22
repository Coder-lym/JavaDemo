package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws Exception {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(
	        "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8",
	        "root",
	        "03120429");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
    	return conn;
    }
	public static void close(Connection conn) {
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
