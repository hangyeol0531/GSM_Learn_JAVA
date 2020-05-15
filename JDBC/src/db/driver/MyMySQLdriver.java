package db.driver;

public class MyMySQLdriver implements DBDriver{

	@Override
	public void getConnect() {
		System.out.println("mysql 데이터베이스에 접속합니다.");
	}
}
