//시작클래스가 1개 필요하다.
public class Start {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		
		//System.out.println("");
		// 프로그래밍 3대요소 : 1.변수 2.DataType(자료형) : int, float, char, boolean -> 기본자료
		//3.할당
		int a = 10;
		System.out.println("정한결 : " + a);
		System.out.println();
		
		int bb;
		bb = 10;
		System.out.println(bb);
		
		float b = (float)34.5;
		System.out.println(b);
		
		char c = 'A';
		System.out.println(c);
		// 아스키코드 A : 65 || a : 97
		int cc = 'A' + 1;
		System.out.println((char)cc);
		
		System.out.println((char)('A' + 32));
		
		System.out.println("1" + "1");
	
		int z = '1';
		int y = '1';
		int v = z + y - '0' * 2;
		System.out.println("3217 정한결 v : " + v);
		
		boolean s = true;
	}
}
