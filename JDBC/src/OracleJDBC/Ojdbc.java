package OracleJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Ojdbc {

	public static void main(String[] args) throws Exception {
//		1.加载驱动1
		Class.forName("oracle.jdbc.OracleDriver");
//		2.加载驱动2
//		OracleDriver driver = new OracleDriver();
//		DriverManager.registerDriver(driver);
		
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "briup", "briup");
		Properties properties = new Properties();
		properties.setProperty("user", "briup");
		properties.setProperty("password", "briup");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", properties);
		
		PreparedStatement ps = conn.prepareStatement("select * from s_emp");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "," + rs.getString("last_name") + "," + rs.getString("title"));
		}
		rs.close();
		ps.close();
		conn.close();
	}
}
