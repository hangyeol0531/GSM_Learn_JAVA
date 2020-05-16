package basic_pr;

public class Circular_queue {
	int rear = 0;
	int front = 0;
	int maxsize = 0;
	int[] circulear_Queue;
	
	public Circular_queue(int maxsize) {
		this.maxsize = maxsize;
		circulear_Queue = new int[this.maxsize];
	}
	
	public boolean isempty() {
		if(rear == front) {
			return true;
		}
		return false;
	}
	
	public boolean isfull() {
		if((rear+1) % maxsize == front) {
			return true;
		}
		return false;
	}
	
	public void EnQueue(int num) {
		if(isfull()) {
			System.out.println("큐가 가득 찼습니다.");
		}else {
			rear = (rear + 1) % maxsize;
			circulear_Queue[rear] = num;
		}
	}
	
	public int DeQueue() {
		if(isempty()) {
			return - 1;
		}else {
			front = (front + 1) % maxsize;
			return circulear_Queue[front];
		}
	}
}







