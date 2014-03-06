import java.util.Scanner;

//Programa que lea 10 numeros y muestre en pantalla el orden reverso
public class Ej1Tema4 {
		final static int NUM_ELEMENTS=10;
		public static void main(String[] args) {
			int[] myArray = new int [NUM_ELEMENTS];
			Scanner inputValue = new Scanner(System.in);
			System.out.println("Enter "+NUM_ELEMENTS+ " integers");
			
			 for (int i=0; i<NUM_ELEMENTS; i++)
				 myArray[i]=inputValue.nextInt();
			 
			 for( int i=NUM_ELEMENTS-1; i>=0; i--)
				 System.out.println(myArray[i]);
			 
		}
		// TODO Auto-generated method stub

}


