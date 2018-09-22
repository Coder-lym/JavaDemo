package jdbc;

import java.sql.Connection;
import java.sql.Statement;

//使用Statement执行修改操作
public class Update {

	public static void main(String[] args) {
		try {
			Connection conn=DBUtil.getConnection();
			Statement state=conn.createStatement();
			
			String sql="UPDATE emp SET empno=1006 WHERE ename='李世民'";
			
			int flag=state.executeUpdate(sql);
			if (flag>0) {
				System.out.println("数据修改成功");
			}else {
				System.out.println("数据修改失败");
			}
			DBUtil.closeConnection();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
