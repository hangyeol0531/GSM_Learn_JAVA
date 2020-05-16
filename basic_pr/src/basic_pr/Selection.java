package basic_pr;

public class Selection {
	
	public void sort(int[] data) {
		int size = data.length;
		int min;
		int temp;
		
		for(int i = 0; i < size - 1;  i++) {
			min = i;
			for(int j = i+1; j < size; j++) {
				if(data[min] > data[j]) {
					min = j;
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		Selection selection = new Selection();
		
		int data[] = {66, 10, 1, 99, 5};
		selection.sort(data);
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
