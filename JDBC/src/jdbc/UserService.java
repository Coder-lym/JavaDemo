package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserService {

	public static void main(String[] args) {
		System.out.println("--------��ӭ����ѧ����Ϣ����ϵͳ--------");
		System.out.println("ϵͳ���ܲ˵���1.ע��   2.��ѯ   3.�޸�   4.ɾ��");
		System.out.println("ע������������˵������ִ����Ӧ����");
        Scanner scan=new Scanner(System.in);
        int option=scan.nextInt();
        switch (option) {
		case 1:
			regUser();
			break;
        case 2:
			selUser();
			break;
        case 3:
			
			break;
        case 4:
			
			break;
		}
	}

	//ע��
	public static void regUser() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("����ѡ��ע�����");
			
			System.out.println("������ѧ�ţ�");
			int Sno=scan.nextInt();
			scan.nextLine();
			
			System.out.println("������������");
			String Sname=scan.nextLine().trim();
			
			System.out.println("�������Ա�");
			String Ssex=scan.nextLine().trim();
			
			System.out.println("���������䣺");
			int Sage=scan.nextInt();
			scan.nextLine();
			
			System.out.println("������רҵ��");
			String Sdept=scan.nextLine().trim();
			
			Connection conn=DBUtil.getConnection();
			Statement state=conn.createStatement();
			
			String sql="INSERT INTO student (Sno,Sname,Ssex,Sage,Sdept) VALUES "+
			           "("+Sno+",'"+Sname+"','"+Ssex+"',"+Sage+",'"+Sdept+"')";
			
			int flag=state.executeUpdate(sql);
			if (flag>0) {
				System.out.println("ע��ɹ�");
			}else {
				System.out.println("ע��ʧ��");
			}
			DBUtil.closeConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//��ѯ
	public static void selUser() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("����ѡ���ѯ��������ѯ��ʽ��1.ѧ��  2.����  3.רҵ");
			System.out.println("���������ѡ���ѯ�ķ�ʽ��");
			int option=scan.nextInt();
			scan.nextLine();
			Connection conn=DBUtil.getConnection();
			Statement state=conn.createStatement();
			
			switch (option) {
			case 1:
				System.out.println("������ѧ�ţ�");
				int Sno=scan.nextInt();
				String sql1="SELECT Sno,Sname,Ssex,Sage,Sdept FROM student WHERE Sno="+Sno;
				ResultSet rs1=state.executeQuery(sql1);
				while (rs1.next()) {
					System.out.println("ѧ�ţ�"+rs1.getString("Sno"));
					System.out.println("������"+rs1.getString("Sname"));
					System.out.println("�Ա�"+rs1.getString("Ssex"));
					System.out.println("���䣺"+rs1.getString("Sage"));
					System.out.println("רҵ��"+rs1.getString("Sdept"));
				}
				break;
			case 2:
				System.out.println("������������");
				String Sname=scan.nextLine();
				String sql2="SELECT Sno,Sname,Ssex,Sage,Sdept FROM student WHERE Sname='"+Sname+"'";
				ResultSet rs2=state.executeQuery(sql2);
				while (rs2.next()) {
					System.out.println("ѧ�ţ�"+rs2.getString("Sno"));
					System.out.println("������"+rs2.getString("Sname"));
					System.out.println("�Ա�"+rs2.getString("Ssex"));
					System.out.println("���䣺"+rs2.getString("Sage"));
					System.out.println("רҵ��"+rs2.getString("Sdept"));
				}
				break;
			case 3:
				System.out.println("������רҵ��");
				String Sdept=scan.nextLine();
				String sql3="SELECT Sno,Sname,Ssex,Sage,Sdept FROM student WHERE Sdept='"+Sdept+"'";
				ResultSet rs3=state.executeQuery(sql3);
				while (rs3.next()) {
					System.out.println("ѧ�ţ�"+rs3.getString("Sno"));
					System.out.println("������"+rs3.getString("Sname"));
					System.out.println("�Ա�"+rs3.getString("Ssex"));
					System.out.println("���䣺"+rs3.getString("Sage"));
					System.out.println("רҵ��"+rs3.getString("Sdept"));
					System.out.println();
				}
				break;
			}
			DBUtil.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
