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
		System.out.println("--------��ӭ����ѧ����Ϣ����ϵͳ--------");
		System.out.println("ϵͳ���ܲ˵���1.ע��   2.��ѯ   3.�޸�   4.ɾ��");
		System.out.println("������˵������ִ����Ӧ������");
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
			System.out.println("�����������������룺");
			main(null);
			break;
		}
	}

	// ע��
	public static void regStu() {
		try {
			System.out.println("����ѡ��ע�����");
			Scanner scan = new Scanner(System.in);
			System.out.println("������ѧ�ţ�");
			int id = scan.nextInt();

			System.out.println("������������");
			String name = scan.next();

			System.out.println("�������Ա�");
			String sex = scan.next();

			System.out.println("���������䣺");
			int age = scan.nextInt();

			System.out.println("������רҵ��");
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
				System.out.println("ע��ɹ���");
			} else {
				System.out.println("ע��ʧ�ܣ�");
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

	// ��ѯ
	public static void selStu() {
		try {
			System.out.println("����ѡ���ѯ��������ѯ��ʽ��1.ѧ��  2.����  3.רҵ");
			Scanner scan = new Scanner(System.in);
			System.out.println("�����������ִ�в�ѯ������");
			int option = scan.nextInt();

			conn = OracleUtil.getConnection();

			switch (option) {
			case 1:
				System.out.println("������ѧ�ţ�");
				int id = scan.nextInt();
				String sql1 = "select * from student where id = " + id;
				ps = conn.prepareStatement(sql1);
				ResultSet rs1 = ps.executeQuery();
				while (rs1.next()) {
					System.out.println("ѧ�ţ�" + rs1.getString("id"));
					System.out.println("������" + rs1.getString("name"));
					System.out.println("�Ա�" + rs1.getString("sex"));
					System.out.println("���䣺" + rs1.getString("age"));
					System.out.println("רҵ��" + rs1.getString("dept"));
				}
				break;
			case 2:
				System.out.println("������������");
				String name = scan.next();
				String sql2 = "select * from student where name = '" + name + "'";
				ps = conn.prepareStatement(sql2);
				ResultSet rs2 = ps.executeQuery();
				while (rs2.next()) {
					System.out.println("ѧ�ţ�" + rs2.getString("id"));
					System.out.println("������" + rs2.getString("name"));
					System.out.println("�Ա�" + rs2.getString("sex"));
					System.out.println("���䣺" + rs2.getString("age"));
					System.out.println("רҵ��" + rs2.getString("dept"));
				}
				break;
			case 3:
				System.out.println("������רҵ��");
				String dept = scan.next();
				String sql3 = "select * from student where dept = '" + dept + "'";
				ps = conn.prepareStatement(sql3);
				ResultSet rs3 = ps.executeQuery();
				while (rs3.next()) {
					System.out.println("ѧ�ţ�" + rs3.getString("id"));
					System.out.println("������" + rs3.getString("name"));
					System.out.println("�Ա�" + rs3.getString("sex"));
					System.out.println("���䣺" + rs3.getString("age"));
					System.out.println("רҵ��" + rs3.getString("dept"));
					System.out.println();
				}
				break;
			default:
				System.out.println("�����������������룺");
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

	// �޸�
	public static void updStu() {
		

	}

	// ɾ��
	public static void delStu() {
		try {
			System.out.println("����ѡ��ɾ�����������������ѡ��ɾ����ʽ��1.ѧ��  2.����  3.�Ա�  4.רҵ");
			Scanner scan = new Scanner(System.in);
			System.out.println("�����������ִ��ɾ��������");
			int option = scan.nextInt();

			conn = OracleUtil.getConnection();
			switch (option) {
			case 1:
				System.out.println("������ѧ�ţ�");
				int id = scan.nextInt();
				String sql1 = "delete from student where id = " + id;
				ps = conn.prepareStatement(sql1);

				System.out.println("ȷ��Ҫɾ��ѧ��Ϊ" + id + "�ļ�¼��");
				System.out.println("�ǣ�Y / ��N");
				String is1 = scan.next();
				switch (is1) {
				case "Y":
					int flag = ps.executeUpdate();
					if (flag > 0) {
						System.out.println("ɾ���ɹ���");
					} else {
						System.out.println("ɾ��ʧ�ܣ�");
					}
					break;
				case "N":
					System.out.println("��ȡ��ɾ��������");
					break;
				default:
					System.out.println("��������ɾ��ʧ�ܣ�");
					break;
				}
				break;
			case 2:
				System.out.println("������������");
				String name = scan.next();
				String sql2 = "delete from student where name = '" + name + "'";
				ps = conn.prepareStatement(sql2);

				System.out.println("ȷ��Ҫɾ������Ϊ" + name + "�ļ�¼��");
				System.out.println("�ǣ�Y / ��N");
				String is2 = scan.next();
				switch (is2) {
				case "Y":
					int flag = ps.executeUpdate();
					if (flag > 0) {
						System.out.println("ɾ���ɹ���");
					} else {
						System.out.println("ɾ��ʧ�ܣ�");
					}
					break;
				case "N":
					System.out.println("��ȡ��ɾ��������");
					break;
				default:
					System.out.println("��������ɾ��ʧ�ܣ�");
					break;
				}
				break;
			case 3:
				System.out.println("�������Ա�");
				String sex = scan.next();
				String sql3 = "delete from student where sex = '" + sex + "'";
				ps = conn.prepareStatement(sql3);

				System.out.println("ȷ��Ҫɾ���Ա�Ϊ" + sex + "��ȫ����¼��");
				System.out.println("�ǣ�Y / ��N");
				String is3 = scan.next();
				switch (is3) {
				case "Y":
					int flag = ps.executeUpdate();
					if (flag > 0) {
						System.out.println("ɾ���ɹ���");
					} else {
						System.out.println("ɾ��ʧ�ܣ�");
					}
					break;
				case "N":
					System.out.println("��ȡ��ɾ��������");
					break;
				default:
					System.out.println("��������ɾ��ʧ�ܣ�");
					break;
				}
				break;
			case 4:
				System.out.println("������רҵ��");
				String dept = scan.next();
				String sql4 = "delete from student where dept = '" + dept + "'";
				ps = conn.prepareStatement(sql4);

				System.out.println("ȷ��Ҫɾ��רҵΪ" + dept + "��ȫ����¼��");
				System.out.println("�ǣ�Y / ��N");
				String is4 = scan.next();
				switch (is4) {
				case "Y":
					int flag = ps.executeUpdate();
					if (flag > 0) {
						System.out.println("ɾ���ɹ���");
					} else {
						System.out.println("ɾ��ʧ�ܣ�");
					}
					break;
				case "N":
					System.out.println("��ȡ��ɾ��������");
					break;
				default:
					System.out.println("��������ɾ��ʧ�ܣ�");
					break;
				}
				break;
			default:
				System.out.println("�����������������룺");
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
