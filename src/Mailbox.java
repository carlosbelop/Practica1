import java.util.ArrayList;

public class Mailbox {

	private Strategy ordenacion;
	private ArrayList<email> emails;
	
	public void setStrategy(Strategy x) {
		ordenacion=x;
	}
	
	public void show() {}
	
	private void sort() {
	 //Aquí se usa el before(email m1, email m2);
	}
	
	private Boolean before (email m1, email m2) {
		
		return ordenacion.before(m1, m2);
	}
}

