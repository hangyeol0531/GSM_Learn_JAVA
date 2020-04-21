import gsm.util.Myutil;
import java.lang.System;
import java.lang.String;

public class GSM09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = Myutil.hap(10, 20);
		java.lang.System.out.println(v);
		
		Myutil my = new Myutil();
		float f = my.hap(45.6f, 67.8f);
		System.out.println(f);
		
		java.lang.String su = "100";
		int s = Integer.parseInt(su);
		System.out.println(s);
		String a = "100";
		String b=  "200";
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
					
	}
}
