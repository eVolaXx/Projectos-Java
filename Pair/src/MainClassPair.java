
public class MainClassPair { 
		  public static void main(String[] args) {
			  Pair<String, Integer> p1 = new OrdenedPair<String, Integer>("Even", 8);
			  Pair<String, String> p2 = new OrdenedPair<String, String>("Hola", "mundo");

		  System.out.format("value 1: %d",p1.getValue());
		  System.out.format("value 2: %S",p2.getValue());
		  }
		  OrdenedPair<Integer, String> p1 = new Pair<>(1, "apple");
		  OrdenedPair<Integer, String> p2 = new Pair<>(2, "pear");
		  boolean same =Util.<Integer, String>compare(p1, p2);

}


/// 
// 