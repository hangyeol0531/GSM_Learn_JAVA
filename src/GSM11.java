import gsm.util.IntArray;
import gsm.util.Myutil;

public class GSM11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	float v = Myutil.hap(34.5f, 67.8f);
		//배열을 동하는 클래스 -> IntArray
		
		int [] arr = new int [5];
		// 정수 10개를 저장할 수 있는 int array 객체 생성 
		IntArray a1 = new IntArray();
		IntArray a2 = new IntArray(10);
		
		// 2. 배열에 데이터 저장하 동작 
		
		a1.add(10);
		a2.add(20);
		a1.add(30);
		
		// 3 index가 2인 데이터를 가져오는 동작
		int data = a1.get(2);
		System.out.println(data);
		
		int length = a1.size();
		System.out.println(length);
		// 3
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	}

}
