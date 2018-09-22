package jdbc;

import java.sql.Connection;
import java.sql.Statement;

//使用Statement执行插入操作
public class Insert {

	public static void main(String[] args) {
		try {
			Connection conn=DBUtil.getConnection();
			
			Statement state=conn.createStatement();
			String sql="INSERT INTO emp (empno,ename,job,hiredate,salary) VALUES (1007,'李世民','总指挥','2017-12-1',5000.00)";
			
			//执行DML操作
			int flag=state.executeUpdate(sql);
			if (flag>0) {
				System.out.println("数据插入成功");
			}else {
				System.out.println("数据插入失败");
			}
			DBUtil.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
