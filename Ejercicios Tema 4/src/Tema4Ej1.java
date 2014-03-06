/* Write a program that reads 10 numbers 
 * and then displays them in reverse order. */
import java.util.Scanner;
public class Tema4Ej1 {
	final static int NUM_ELEMENTS=10;
	public static void main(String[] argv) {
		int[] myArray = new int[NUM_ELEMENTS];
		Scanner inputValue = new Scanner(System.in);
		
		System.out.println("Enter "+NUM_ELEMENTS+ " integers");
		
		for (int i=0; i<NUM_ELEMENTS; i++) 
			myArray[i]=inputValue.nextInt();
		for (int i=NUM_ELEMENTS-1; i>=0; i--) 
			System.out.println(myArray[i]);
	}
}
