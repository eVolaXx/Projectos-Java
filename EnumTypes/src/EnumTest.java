// TEXT DE LOS DIAS LUNES, VIERNES Y SABADO DOMINGO, CON COMENTARIO DE ELLOS Y LLAMANDO AL METODO DESDE MAIN
public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day= day;
	}
	 public void tellItLikeItIs() {
		 switch (day) {
		   case Monday:
		    System.out.println("Mondays are bad.");
		    break;
		   case Friday:
			   System.out.println ("Fridays are better.");
		    break;
		   case Saturday:case Sunday:
		         System.out.println ("Weekends are best.");
		   break;
		 default:
		 System.out.println("Midweek days are so-so.");
		 break;
		 }
	 }	
	 
	 public static void main(String[] args) {
		 EnumTest firstDay = new EnumTest(Day.Monday);
		 firstDay.tellItLikeItIs();  // Aqui llamamos al metodo de arriba "telllItLikeItIs" para que nos muestre en pantalla el mensaje
		 EnumTest thirdDay = new EnumTest(Day.Wednesday);
		 thirdDay.tellItLikeItIs();
		 EnumTest fifthDay = new EnumTest(Day.Friday);
		 fifthDay.tellItLikeItIs();
		 EnumTest sixthDay = new EnumTest(Day.Saturday);
		 sixthDay.tellItLikeItIs();
		 EnumTest seventhDay = new EnumTest(Day.Sunday);
		 seventhDay.tellItLikeItIs();
	 }
		

}
