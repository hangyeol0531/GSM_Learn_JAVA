package basic_pr;

public class Stack {
	
	private int MAX = 5;
	private int top;
	private int[] item;
	
	public Stack() {
		top = 0;
		item = new int[MAX];
	}
	
	public void push(int num) {
		if(top >= item.length) {
			System.out.println("stack is fulled");
			return ;
		}else {
			item[top] = num;
			top = top + 1;
			System.out.println(top);
		}
	}
	
	public void pop() {
		if(top == 0) {
			System.out.println("stack is empty");
		}else {
			top = top - 1;
			int num;
			num = item[top];
			item[top] = 0;
			
			System.out.println(num);
		}
	}
}
