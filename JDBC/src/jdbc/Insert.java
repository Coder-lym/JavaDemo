package jdbc;

import java.sql.Connection;
import java.sql.Statement;

//ʹ��Statementִ�в������
public class Insert {

	public static void main(String[] args) {
		try {
			Connection conn=DBUtil.getConnection();
			
			Statement state=conn.createStatement();
			String sql="INSERT INTO emp (empno,ename,job,hiredate,salary) VALUES (1007,'������','��ָ��','2017-12-1',5000.00)";
			
			//ִ��DML����
			int flag=state.executeUpdate(sql);
			if (flag>0) {
				System.out.println("���ݲ���ɹ�");
			}else {
				System.out.println("���ݲ���ʧ��");
			}
			DBUtil.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
