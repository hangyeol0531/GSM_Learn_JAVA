import gsm.util.IntArray;
import gsm.util.FloatArray;
import java.util.ArrayList;
import gsm.util.Myutil;

public class GSM12 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList(7);
		a1.add(32.17f);
		a1.add(1.1f);
		a1.add(2.2f);
		a1.add(3.3f);
		a1.add(4.4f);
		a1.add(5.5f);
		a1.add(6.6f);
		
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	}

}