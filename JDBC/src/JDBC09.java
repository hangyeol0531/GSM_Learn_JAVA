import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "java";
		String pwd = "java3217";
		int age = 21;
		//tableme table에서 id가 java인 회원의 pwd를 java3217로 age를 21로 수정  
		String SQL = "update tablem set pwd =?, age=? Where id=?";
		//--------------------------------------------------------
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hr";
			String password = "hr";
			Connection conn = DriverManager.getConnection(URL, user, password);
			if(conn!= null) {
				System.out.println("접속 성공 ");
			}else {
				System.out.println("접속  실패 ");
			}
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, pwd);
			ps.setInt(2, age);
			ps.setString(3, id);
			int cnt = ps.executeUpdate();
			if(cnt > 0) {
				System.out.println("입력 성공");
			}else {
				System.out.println("입력 실패 ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
