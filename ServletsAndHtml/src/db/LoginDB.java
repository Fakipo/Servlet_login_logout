package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDB {
	
	public Long loginDB(String email, String password) {
		
		try {
			Connection con = DBConnection.initializeDatabase();
			String sql = "select id from user where email= ? and password = ?";
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, email);
			 ps.setString(2, password);
			 ResultSet rs = ps.executeQuery();
			 if(rs.next()) {
				 return (rs.getLong("id"));
			 }
			 else {
				 return null;
			 }
			 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		return null;
	}

}
