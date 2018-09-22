package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) {
		try {
			//1.��������
			Class.forName("com.mysql.jdbc.Driver");
			//2.ͨ��DriverManager��ȡ���ݿ����ӣ�����İ�����java.sql.*
			Connection conn=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test",   //url
					"root",  //user
					"03120429");  //pw
			if (conn!=null) {
				System.out.println("���ݿ����ӳɹ���");
			}
			//3.ͨ��Connection����Statement,����ִ��SQL���
			Statement state=conn.createStatement();
			
			//4.ʹ��executeQuery��ִ��SQL��䣬���õ���ѯ�����
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
			//5.�ر�����
			conn.close();
             
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
