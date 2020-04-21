import gsm.util.Myutil;

public class GSM10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = Myutil.hap(10,  20);
		float vv = Myutil.hap(10.5f, 25.6f);
		System.out.println(v);
		System.out.println(vv);
		
		//		Myutil my = new Myutil();
		//		int vvv =my.hap(32, 23);
		//		my.hap(23, 23);
		
		int a = 20;
		int b = 30;
		// a , b 수 중 최대값 을 구하여 출력하시오(단, Math 클래스의 max() 함수를이용  
		int max = Math.max(a, b);
		System.out.println(max);
	}

}
