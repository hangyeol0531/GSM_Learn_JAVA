import gsm.poly.*;

public class gsm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c = new Cat();
		c.eat();
		c.move();
		
		((Cat)c).night();
		
		Animal d = new Dog();
		d.eat();
		d.move();
	}

}
