
public class GSM03 {
	public static void main(String[] args) {
		int b_num = 1001;
		int b_ban = 3;
		float kor = 67.8f;
		float eng = 89.6f;
		
		int a;
		
		scores sj;
		sj = new scores();
		sj.b_num = b_num;
		sj.b_ban = b_ban;
		sj.kor = kor;
		sj.eng = eng;
		System.out.println(sj.b_num);
		System.out.println(sj.b_ban);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
	}
}
