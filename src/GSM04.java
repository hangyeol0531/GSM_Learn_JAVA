
public class GSM04 {

	public static void main(String[] args) {
		// 자기 번호 32xx 반 = x kor = x eng = x
		//자신의 성적을 저장하고 출력하요 
		int my_num = 3217;
		int class_num = 2;
		float kor = 100;
		float eng = 99.9f;
		
		grade gr = new grade();
		gr.my_num = my_num;
		gr.class_num = class_num;
		gr.kor = kor;
		gr.eng = eng;
		System.out.println(gr.my_num);
		System.out.println(gr.class_num);
		System.out.println(gr.kor);
		System.out.println(gr.eng);
	}

}
