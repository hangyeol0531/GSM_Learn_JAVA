package kr.gsm;

public class MemberVO {
	private String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	private String getPwd() {
		return pwd;
	}
	private void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	private String id;
	private String pwd;
	private int age;
	public MemberVO(String id, String pwd, int age) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
}
