package gsm.poly;

public class Cat extends Animal {	

	public void night() {
		System.out.println("밤에 눈에 불이 나온");
	}
	
	@Override
	public void eat() {
		System.out.println("고양이 처럼 먹다. ");
		
	}

	@Override
	public void move() {
		System.out.println("고양이들이 무리를 지어서 이동한다.");
		
	}
}
