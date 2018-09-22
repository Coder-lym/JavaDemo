package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//ͨ��DBUtil��ȡ����
public class jdbcDemo2 {

	public static void main(String[] args) {
		try {
			Connection conn=DBUtil.getConnection();
			if (conn!=null) {
				System.out.println("���ݿ����ӳɹ���");
			}
			
			Statement state=conn.createStatement();
			
			String sql="SELECT * FROM emp";
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
			DBUtil.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
