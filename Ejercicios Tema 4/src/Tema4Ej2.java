/* Write a program that calculates the mode 
 * (the most frequent item) of an list of 20 chars 
 * (initialize the array of chars in the declaration 
 * of the array as a list of chars);
 */
import java.util.Scanner;
public class Tema4Ej2 {
	final static int NUM_ELEMENTS=10;
	public static void main(String[] argv) {
		int[] myArray = new int[NUM_ELEMENTS];
		int temp;
		Scanner inputValue = new Scanner(System.in);
		
		System.out.println("Enter "+NUM_ELEMENTS+ " integers");
		
		for (int i=0; i<NUM_ELEMENTS; i++) 
			myArray[i]=inputValue.nextInt();
		for (int i=0; i<NUM_ELEMENTS/2; i++) {
			temp = myArray[i];
			myArray[i]=myArray[NUM_ELEMENTS-1-i];
			myArray[NUM_ELEMENTS-1-i]=temp;
		}
		for (int i=0; i<NUM_ELEMENTS; i++) 
			System.out.println(myArray[i]);
	}
}
