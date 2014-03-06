public class SwitchBoardExercise {

	public static void main(String[] args) {
		CajaRegistros switchBoard = new CajaRegistros();
		
		Llamada c = new Llamada("12121343", "+34 1233434", 
				           20, Llamada.PROVINCIAL, (byte)2);
		switchBoard.registerCall(c);
		c = new Llamada("12121343", "+34 1233434", 
		           10, Llamada.PROVINCIAL, (byte)1);
		switchBoard.registerCall(c);
		c = new Llamada("15656343", "+34 1343434", 
		           20, Llamada.LOCAL, (byte)0);
		switchBoard.registerCall(c);
		c = new Llamada("12121343", "+30 1235534", 
		           40, Llamada.LOCAL, (byte)0);
		switchBoard.registerCall(c);
		c = new Llamada("121245643", "+25 1233434", 
		           35, Llamada.PROVINCIAL, (byte)2);
		switchBoard.registerCall(c);
		switchBoard.print();

	}

}
