import java.sql.*;

public class JDBC02 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 시험 
			String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hr";
			String password = "hr";
			// 연결객체생성 
			Connection conn = DriverManager.getConnection(URL, user, password);
			
			if(conn!= null) {
				System.out.println("접속 성공 ");
			}else {
				System.out.println("접속  실패 ");
			}
			// SQL -> CRUD
			String SQL = "insert into mygsm values('JHG', '1004', 19)";
			// SQL문장을 전송하는 객체생성 (Statement)
			Statement st = conn.createStatement();
			st.executeUpdate(SQL);
			System.out.println("입력성공 ");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
