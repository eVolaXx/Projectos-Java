import java.util.Scanner;
public class MainClassDni {
	public static void main(String[] argv) {
		Scanner inputValue = new Scanner(System.in);
		Dni d;
		int num;
		char letter;
		do {
			System.out.println("Please enter your DNI number:");
			num = inputValue.nextInt();
			System.out.println("Please enter the letter of your DNI:");
			letter = inputValue.next().charAt(0);
			d=new Dni(num,letter);
			if (!d.isDniCorrect())
				System.out.println("DNI incorrect. Please enter it again");
		} while (!d.isDniCorrect());
		System.out.println("GOOD. DNI correct.");
	}
}
