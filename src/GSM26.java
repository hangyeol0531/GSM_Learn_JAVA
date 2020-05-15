import gsm.poly.*;

public class GSM26 {

	public static void main(String[] args) {
		RemoCon tv_Remocon = new TV();
        RemoCon rd_Remocon = new Radio();
        
        tv_Remocon.volUP();
        tv_Remocon.volDOWN();
        tv_Remocon.internet();
        
        rd_Remocon.volUP();
        rd_Remocon.volDOWN();
        rd_Remocon.internet();
	}

}
