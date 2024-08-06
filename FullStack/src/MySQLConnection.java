import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
public static void main(String[] args) {
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/student";
	String username = "root";
	String password = "";
			try {
	conn = DriverManager.getConnection(url,username,password);
			}
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	if(conn != null) {
		System.out.println("conn established");
	}
	else {
		System.out.println("conn failed");
	}
	return conn;
	
}
}