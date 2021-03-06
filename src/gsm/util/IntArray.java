package gsm.util;

public class IntArray {
	
	private int[] arr;
	private int cnt;
	
	public int size() {
		return cnt;
	}
	public IntArray() {
		this(10);
	}

	
	public IntArray(int inital) {
		arr = new int[inital];
	}
	
	//배열에데이터를 저장하는 동작
	public void add(int data) {
		arr[cnt++] = data;
	}
	
	// 원하는 index의 데이터를 가져오는 동작(get)	
	public int get(int index) {
		return arr[index];
	}
}
