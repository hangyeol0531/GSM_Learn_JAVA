import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC04 {

	public static void main(String[] args) {
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
			// 전체 레코드를 가지고오기 
			//id를 기준으로 내림 차순 정렬 해서 출력하시오 
			String SQL = "select * from mygsm order by id desc";
			
			//2.SQL문장 전송 객체(statement)
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL);
			System.out.println("3217 _ 정한결 ");
			System.out.println("아이디 \t 패스워드 \t 나이 ");
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				int age = rs.getInt("age");
				System.out.println(id + "/t" + pwd + "/t" + age);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
