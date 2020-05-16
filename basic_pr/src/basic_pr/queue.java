package basic_pr;

public class queue {
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queueArray;
	
	public void ArrayQueue(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.queueArray = new Object[maxSize];
	}	
	
	public boolean empty() {
		return front == rear+1;
	}
	
	public boolean full() {
		return (rear == maxSize -1);
	}
	
	public void insert(Object item) {
		if(full()) ;
		queueArray[++rear] = item;
	}
	
	public Object peek() {
		if(empty());
		return queueArray[front];
	}
	
	public Object remove() {
		Object item = peek();
		front++;
		return item;
	}
}










