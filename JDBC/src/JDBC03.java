import java.sql.*;
public class JDBC03 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hr";
			String password = "hr";
			//1. 연결 객체 생성  
			Connection conn = DriverManager.getConnection(URL, user, password);
			if(conn!= null) {
				System.out.println("접속 성공 ");
			}else {
				System.out.println("접속  실패 ");
			}
			//수정 SQL = id가 gsm인 회원의 비밀번호 = 1004, 나이 15로 수정하시오.
			String SQL = "UPDATE mygsm set age = '15' where pwd = '1004'";
			
			//2.SQL문장 전송 객체(statement)
			Statement st = conn.createStatement();
			st.executeUpdate(SQL);
			//성공 -> 수정 성공 
			System.out.println("수정 성공 _ 3217 _ 정한결 ");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
