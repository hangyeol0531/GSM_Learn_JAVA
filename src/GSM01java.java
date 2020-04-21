public class GSM01java {

	public static void main(String[] args) {
		int a= 10;
		int b = 20;
		int c= 30;
		
		int[] arr= new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		hap(arr);
	}
	
	public static void hap(int[] arr) {
		//배열의 총합을구합
		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
		for(int i : arr) {
			sum += i;
		}
		System.out.println("3217정한결 ");
		System.out.println(sum);
	}

}
