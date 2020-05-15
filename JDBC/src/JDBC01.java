import db.driver.DBDriver;
import db.driver.MyMySQLdriver;
import db.driver.*;
public class JDBC01 {
	public static void main(String args[]){
		//oracle db
		
		DBDriver driver = new MyOracleDriver();
		driver.getConnect();
		
		driver = new MyMySQLdriver();
		driver.getConnect();
	}
}
