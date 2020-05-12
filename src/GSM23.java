import gsm.poly.A;
import gsm.poly.B;
public class GSM23 {

	public static void main(String[] args) {
		
		
		Object[] obj=new Object[2]; 
		obj[0] = new A();
		obj[1] = new B();

		display(obj[0]);
		
		B b = new B();
		display(obj[1]);
	}
	
	public static void display(Object obj) { //중요 
		if(obj instanceof A) {
			((A)obj).ptr();
		}else if(obj instanceof B){
			((B)obj).ptr();
		}
	}

}
