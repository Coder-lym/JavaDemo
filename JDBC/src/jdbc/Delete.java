package jdbc;

import java.sql.Connection;
import java.sql.Statement;

//ɾ������
public class Delete {

	public static void main(String[] args) {
		try {
			Connection conn=DBUtil.getConnection();
			Statement state=conn.createStatement();
			
			String sql="DELETE FROM emp WHERE empno=1006";
			int flag=state.executeUpdate(sql);
			if (flag>0) {
				System.out.println("ɾ�����ݳɹ�");
			} else {
                System.out.println("ɾ������ʧ��");
			}
			
			DBUtil.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
