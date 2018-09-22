package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Employee;
import util.DBUtil;

public class EmployeeDAO {
	// 查询员工信息
	public List<Employee> findAll() throws Exception {
		List<Employee> employees = new ArrayList<Employee>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("SELECT * FROM employee");
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double salary = rs.getDouble("salary");
				int age = rs.getInt("age");

				Employee e = new Employee();
				e.setId(id);
				e.setName(name);
				e.setSalary(salary);
				e.setAge(age);
				// 将员工对象放进集合里面
				employees.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn);
		}
		return employees;
	}

	// 添加员工信息
	public void regEmp(Employee e) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("insert into employee (name,salary,age) values (?,?,?)");
			ps.setString(1, e.getName());
			ps.setDouble(2, e.getSalary());
			ps.setInt(3, e.getAge());
			ps.executeUpdate();
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}

	// 删除员工信息
	public void deleteEmp(int id) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("delete from employee where id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn);
		}
	}

	// 根据员工id查询员工信息
	public Employee selectEmp(int id) throws Exception {
		Employee e = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSalary(rs.getDouble("salary"));
				e.setAge(rs.getInt("age"));
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			throw e1;
		} finally {
			DBUtil.close(conn);
		}
		return e;
	}

	// 修改员工信息
	public void updateEmp(Employee e) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("update employee set name=?,salary=?,age=? where id=?");

			ps.setString(1, e.getName());
			ps.setDouble(2, e.getSalary());
			ps.setInt(3, e.getAge());
			ps.setInt(4, e.getId());

			ps.executeUpdate();
		} catch (Exception e1) {
			e1.printStackTrace();
			throw e1;
		} finally {
			DBUtil.close(conn);
		}
	}

}
