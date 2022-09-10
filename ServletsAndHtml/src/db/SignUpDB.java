package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpDB {
	public void signUp(String email, String password)  { 
		try {
			Connection con = DBConnection.initializeDatabase();
			String sql = "insert into user (email,password) values (?,?)";
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, email);
			 ps.setString(2, password);
			 ps.execute();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
