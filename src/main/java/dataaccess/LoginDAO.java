package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public static boolean hasAccount(String id, String password) {
		String SELECT_SQL = "SELECT * FROM account WHERE id = ?";

		// fix No suitable driver found for jdbc error.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Connecting to the mysql to check login authentication.
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dialy", "hoge", "password")) {
			con.setAutoCommit(false);
			System.out.println("login");
			try (PreparedStatement ps = con.prepareStatement(SELECT_SQL)) {
				ps.setString(1, id);
				try (ResultSet rs = ps.executeQuery()) {
					while (rs.next()) {
						if (rs.getString("password").equals(password)) {
							System.out.printf("id=%s, password=%s%n", id, password);
							return true;
						}
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
