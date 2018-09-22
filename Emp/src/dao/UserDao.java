package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.User;
import util.DBUtil;

public class UserDao {
    public User findByName(String name) {
		User user=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn=DBUtil.getConnection();
			ps=conn.prepareStatement("SELECT * FROM user WHERE name=?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			if (rs.next()) {
				user=new User();
				user.setName(name);
				user.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return user;
    }
//    public static void main(String[] args) {
//    	UserDao dao = new UserDao();
//    	User user=dao.findByName("¡∫”Ò√Ò"); 
//       System.out.println(user);
//    }
}
