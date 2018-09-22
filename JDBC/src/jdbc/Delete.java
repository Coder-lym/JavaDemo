package jdbc;

import java.sql.Connection;
import java.sql.Statement;

//删除数据
public class Delete {

	public static void main(String[] args) {
		try {
			Connection conn=DBUtil.getConnection();
			Statement state=conn.createStatement();
			
			String sql="DELETE FROM emp WHERE empno=1006";
			int flag=state.executeUpdate(sql);
			if (flag>0) {
				System.out.println("删除数据成功");
			} else {
                System.out.println("删除数据失败");
			}
			
			DBUtil.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
