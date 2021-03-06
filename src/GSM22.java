import gsm.poly.*;
public class GSM22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A();
//		a.ptr();
		// A클래스의 객체를 upcasting으로 생성해서 ptr()으로 동작
		
		Object obj = new A();
		((A)obj).ptr(); //X --> 수정 
		
		obj = new B();
		((B)obj).ptr(); //X --> 수정 
		
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
	}
	
	public static void display(Object obj) { //중요 
		if(obj instanceof A) {
			((A)obj).ptr();
		}else if(obj instanceof B){
			((B)obj).ptr();
		}
	}

}
