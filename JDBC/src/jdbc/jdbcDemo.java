package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) {
		try {
			//1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.通过DriverManager获取数据库连接，导入的包都在java.sql.*
			Connection conn=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test",   //url
					"root",  //user
					"03120429");  //pw
			if (conn!=null) {
				System.out.println("数据库连接成功！");
			}
			//3.通过Connection创建Statement,用于执行SQL语句
			Statement state=conn.createStatement();
			
			//4.使用executeQuery来执行SQL语句，并得到查询结果集
			String sql="SELECT * from emp";
			ResultSet rs=state.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println(rs.getString("empno")+","+
			                       rs.getString("ename")+","+
						           rs.getString("job")+","+
			                       rs.getString("hiredate")+","+
						           rs.getString("salary")
			                       );
			}
			
			rs.close();
			state.close();
			//5.关闭连接
			conn.close();
             
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
