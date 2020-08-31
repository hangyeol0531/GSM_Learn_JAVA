import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.PreparedStatement;
import oracle.net.aso.s;


public class JDBC07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID: ");
		String id = scan.next();
		
		System.out.println("PWD: ");
		String pwd = scan.next();
		
		System.out.println("AGE: ");
		int age = Integer.parseInt(scan.next());
		
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
			// "+변수+"
			//Statement st = conn.createStatement();
			String SQL = "insert into tablem values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, id);
			ps.setString(2, pwd);
			ps.setInt(3, age);
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
