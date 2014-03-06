
public class MainClass {

	public static void main(String[] args) {
		Box<Integer> integerBox;
		integerBox = new Box<Integer>();
	    integerBox.set(1000);
	    System.out.println((integerBox.get));

	}

}
