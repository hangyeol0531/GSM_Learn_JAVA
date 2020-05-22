import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Statement;

import oracle.net.aso.s;

public class JDBC06 {
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
			Statement st = conn.createStatement();
			String SQL = "insert into tablem values('"+id+"', '"+pwd+"', "+age+")";
			int cnt = st.executeUpdate(SQL);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
