package jdbc;

import java.sql.Connection;
import java.sql.Statement;

//ʹ��Statementִ���޸Ĳ���
public class Update {

	public static void main(String[] args) {
		try {
			Connection conn=DBUtil.getConnection();
			Statement state=conn.createStatement();
			
			String sql="UPDATE emp SET empno=1006 WHERE ename='������'";
			
			int flag=state.executeUpdate(sql);
			if (flag>0) {
				System.out.println("�����޸ĳɹ�");
			}else {
				System.out.println("�����޸�ʧ��");
			}
			DBUtil.closeConnection();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
