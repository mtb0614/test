package dbManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DbManager {
	final String url = "jdbc:mysql://localhost:3306/test";
	final String user = "root";
	final String pw = "mitsutani";
	Connection conn = null;
	PreparedStatement pstmt = null;

	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pw);
		}catch(Exception e){
			System.out.println("error");
		}
		return conn;
	}

	public PreparedStatement getPstmt(String sql){
		try {
			pstmt = conn.prepareStatement(sql);
		}catch(Exception e){
			System.out.println("error");
		}
		return pstmt;
	}

	public void colse(){
		try {
			pstmt.close();
			conn.close();
		}catch(Exception e){
			System.out.println("error");
		}
	}


}

