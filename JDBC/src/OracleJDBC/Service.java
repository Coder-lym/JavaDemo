package OracleJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Service {

	private static Connection conn;
	private static PreparedStatement ps;

	public static void main(String[] args) {
		System.out.println("--------欢迎来到学生信息管理系统--------");
		System.out.println("系统功能菜单：1.注册   2.查询   3.修改   4.删除");
		System.out.println("请输入菜单序号来执行相应操作：");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		switch (option) {
		case 1:
			regStu();
			break;
		case 2:
			selStu();
			break;
		case 3:
			updStu();
			break;
		case 4:
			delStu();
			break;
		default:
			System.out.println("输入有误，请重新输入：");
			main(null);
			break;
		}
	}

	// 注册
	public static void regStu() {
		try {
			System.out.println("您已选择注册操作");
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入学号：");
			int id = scan.nextInt();

			System.out.println("请输入姓名：");
			String name = scan.next();

			System.out.println("请输入性别：");
			String sex = scan.next();

			System.out.println("请输入年龄：");
			int age = scan.nextInt();

			System.out.println("请输入专业：");
			String dept = scan.next();

			String sql = "insert into student values(?,?,?,?,?)";

			conn = OracleUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, sex);
			ps.setInt(4, age);
			ps.setString(5, dept);

			int flag = ps.executeUpdate();
			if (flag > 0) {
				System.out.println("注册成功！");
			} else {
				System.out.println("注册失败！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 查询
	public static void selStu() {
		try {
			System.out.println("您已选择查询操作，查询方式：1.学号  2.姓名  3.专业");
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入序号来执行查询操作：");
			int option = scan.nextInt();

			conn = OracleUtil.getConnection();

			switch (option) {
			case 1:
				System.out.println("请输入学号：");
				int id = scan.nextInt();
				String sql1 = "select * from student where id = " + id;
				ps = conn.prepareStatement(sql1);
				ResultSet rs1 = ps.executeQuery();
				while (rs1.next()) {
					System.out.println("学号：" + rs1.getString("id"));
					System.out.println("姓名：" + rs1.getString("name"));
					System.out.println("性别：" + rs1.getString("sex"));
					System.out.println("年龄：" + rs1.getString("age"));
					System.out.println("专业：" + rs1.getString("dept"));
				}
				break;
			case 2:
				System.out.println("请输入姓名：");
				String name = scan.next();
				String sql2 = "select * from student where name = '" + name + "'";
				ps = conn.prepareStatement(sql2);
				ResultSet rs2 = ps.executeQuery();
				while (rs2.next()) {
					System.out.println("学号：" + rs2.getString("id"));
					System.out.println("姓名：" + rs2.getString("name"));
					System.out.println("性别：" + rs2.getString("sex"));
					System.out.println("年龄：" + rs2.getString("age"));
					System.out.println("专业：" + rs2.getString("dept"));
				}
				break;
			case 3:
				System.out.println("请输入专业：");
				String dept = scan.next();
				String sql3 = "select * from student where dept = '" + dept + "'";
				ps = conn.prepareStatement(sql3);
				ResultSet rs3 = ps.executeQuery();
				while (rs3.next()) {
					System.out.println("学号：" + rs3.getString("id"));
					System.out.println("姓名：" + rs3.getString("name"));
					System.out.println("性别：" + rs3.getString("sex"));
					System.out.println("年龄：" + rs3.getString("age"));
					System.out.println("专业：" + rs3.getString("dept"));
					System.out.println();
				}
				break;
			default:
				System.out.println("输入有误，请重新输入：");
				selStu();
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 修改
	public static void updStu() {
		

	}

	// 删除
	public static void delStu() {
		try {
			System.out.println("您已选择删除操作，请输入序号选择删除方式：1.学号  2.姓名  3.性别  4.专业");
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入序号来执行删除操作：");
			int option = scan.nextInt();

			conn = OracleUtil.getConnection();
			switch (option) {
			case 1:
				System.out.println("请输入学号：");
				int id = scan.nextInt();
				String sql1 = "delete from student where id = " + id;
				ps = conn.prepareStatement(sql1);

				System.out.println("确认要删除学号为" + id + "的记录吗？");
				System.out.println("是：Y / 否：N");
				String is1 = scan.next();
				switch (is1) {
				case "Y":
					int flag = ps.executeUpdate();
					if (flag > 0) {
						System.out.println("删除成功！");
					} else {
						System.out.println("删除失败！");
					}
					break;
				case "N":
					System.out.println("已取消删除操作。");
					break;
				default:
					System.out.println("输入有误，删除失败！");
					break;
				}
				break;
			case 2:
				System.out.println("请输入姓名：");
				String name = scan.next();
				String sql2 = "delete from student where name = '" + name + "'";
				ps = conn.prepareStatement(sql2);

				System.out.println("确认要删除姓名为" + name + "的记录吗？");
				System.out.println("是：Y / 否：N");
				String is2 = scan.next();
				switch (is2) {
				case "Y":
					int flag = ps.executeUpdate();
					if (flag > 0) {
						System.out.println("删除成功！");
					} else {
						System.out.println("删除失败！");
					}
					break;
				case "N":
					System.out.println("已取消删除操作。");
					break;
				default:
					System.out.println("输入有误，删除失败！");
					break;
				}
				break;
			case 3:
				System.out.println("请输入性别：");
				String sex = scan.next();
				String sql3 = "delete from student where sex = '" + sex + "'";
				ps = conn.prepareStatement(sql3);

				System.out.println("确认要删除性别为" + sex + "的全部记录吗？");
				System.out.println("是：Y / 否：N");
				String is3 = scan.next();
				switch (is3) {
				case "Y":
					int flag = ps.executeUpdate();
					if (flag > 0) {
						System.out.println("删除成功！");
					} else {
						System.out.println("删除失败！");
					}
					break;
				case "N":
					System.out.println("已取消删除操作。");
					break;
				default:
					System.out.println("输入有误，删除失败！");
					break;
				}
				break;
			case 4:
				System.out.println("请输入专业：");
				String dept = scan.next();
				String sql4 = "delete from student where dept = '" + dept + "'";
				ps = conn.prepareStatement(sql4);

				System.out.println("确认要删除专业为" + dept + "的全部记录吗？");
				System.out.println("是：Y / 否：N");
				String is4 = scan.next();
				switch (is4) {
				case "Y":
					int flag = ps.executeUpdate();
					if (flag > 0) {
						System.out.println("删除成功！");
					} else {
						System.out.println("删除失败！");
					}
					break;
				case "N":
					System.out.println("已取消删除操作。");
					break;
				default:
					System.out.println("输入有误，删除失败！");
					break;
				}
				break;
			default:
				System.out.println("输入有误，请重新输入：");
				delStu();
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
