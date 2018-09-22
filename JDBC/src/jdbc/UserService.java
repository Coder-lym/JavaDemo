package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserService {

	public static void main(String[] args) {
		System.out.println("--------欢迎来到学生信息管理系统--------");
		System.out.println("系统功能菜单：1.注册   2.查询   3.修改   4.删除");
		System.out.println("注：您可以输入菜单序号来执行相应操作");
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

	//注册
	public static void regUser() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("您已选择注册操作");
			
			System.out.println("请输入学号：");
			int Sno=scan.nextInt();
			scan.nextLine();
			
			System.out.println("请输入姓名：");
			String Sname=scan.nextLine().trim();
			
			System.out.println("请输入性别：");
			String Ssex=scan.nextLine().trim();
			
			System.out.println("请输入年龄：");
			int Sage=scan.nextInt();
			scan.nextLine();
			
			System.out.println("请输入专业：");
			String Sdept=scan.nextLine().trim();
			
			Connection conn=DBUtil.getConnection();
			Statement state=conn.createStatement();
			
			String sql="INSERT INTO student (Sno,Sname,Ssex,Sage,Sdept) VALUES "+
			           "("+Sno+",'"+Sname+"','"+Ssex+"',"+Sage+",'"+Sdept+"')";
			
			int flag=state.executeUpdate(sql);
			if (flag>0) {
				System.out.println("注册成功");
			}else {
				System.out.println("注册失败");
			}
			DBUtil.closeConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//查询
	public static void selUser() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("您已选择查询操作，查询方式：1.学号  2.姓名  3.专业");
			System.out.println("请输入序号选择查询的方式：");
			int option=scan.nextInt();
			scan.nextLine();
			Connection conn=DBUtil.getConnection();
			Statement state=conn.createStatement();
			
			switch (option) {
			case 1:
				System.out.println("请输入学号：");
				int Sno=scan.nextInt();
				String sql1="SELECT Sno,Sname,Ssex,Sage,Sdept FROM student WHERE Sno="+Sno;
				ResultSet rs1=state.executeQuery(sql1);
				while (rs1.next()) {
					System.out.println("学号："+rs1.getString("Sno"));
					System.out.println("姓名："+rs1.getString("Sname"));
					System.out.println("性别："+rs1.getString("Ssex"));
					System.out.println("年龄："+rs1.getString("Sage"));
					System.out.println("专业："+rs1.getString("Sdept"));
				}
				break;
			case 2:
				System.out.println("请输入姓名：");
				String Sname=scan.nextLine();
				String sql2="SELECT Sno,Sname,Ssex,Sage,Sdept FROM student WHERE Sname='"+Sname+"'";
				ResultSet rs2=state.executeQuery(sql2);
				while (rs2.next()) {
					System.out.println("学号："+rs2.getString("Sno"));
					System.out.println("姓名："+rs2.getString("Sname"));
					System.out.println("性别："+rs2.getString("Ssex"));
					System.out.println("年龄："+rs2.getString("Sage"));
					System.out.println("专业："+rs2.getString("Sdept"));
				}
				break;
			case 3:
				System.out.println("请输入专业：");
				String Sdept=scan.nextLine();
				String sql3="SELECT Sno,Sname,Ssex,Sage,Sdept FROM student WHERE Sdept='"+Sdept+"'";
				ResultSet rs3=state.executeQuery(sql3);
				while (rs3.next()) {
					System.out.println("学号："+rs3.getString("Sno"));
					System.out.println("姓名："+rs3.getString("Sname"));
					System.out.println("性别："+rs3.getString("Ssex"));
					System.out.println("年龄："+rs3.getString("Sage"));
					System.out.println("专业："+rs3.getString("Sdept"));
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
