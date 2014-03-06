import java.util.Scanner;
public class MainClassDni2 {
	public static void main(String[] argv) {
		Scanner inputValue = new Scanner(System.in);
		Dni d;
		String s;
		do {
			System.out.println("Please enter your DNI:");
			s = inputValue.next();
			d=new Dni(s);
			if (!d.isDniCorrect())
				System.out.println("DNI incorrect. Please enter it again");
		} while (!d.isDniCorrect());
		System.out.println("GOOD. DNI correct.");
		System.out.println(d.toFormattedString());
	}
}
