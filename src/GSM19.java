import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM19 {

	public static void main(String[] args) {
		Animal d = new Dog();
		d.eat();
		d.move();
		
		Animal c = new Cat();
		c.eat();
		c.move();
		
		((Cat)c).night();
	}

}
