package gsm.util;

public class FloatArray {
	
	private float[] arr;
	private int cnt;
	
	public int size() {
		return cnt;
	}
	public FloatArray() {
		this(10);
	}

	
	public FloatArray(int inital) {
		arr = new float[inital];
	}
	
	//배열에데이터를 저장하는 동작
	public void add(float data) {
		arr[cnt++] = data;
	}
	
	// 원하는 index의 데이터를 가져오는 동작(get)	
	public float get(int index) {
		return arr[index];
	}
}
