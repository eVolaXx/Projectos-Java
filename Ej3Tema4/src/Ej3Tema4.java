import java.util.Scanner;
// Programa que nos pide nuestro DNI y nos calcula nuestra letra.Hay que ponerlo sin la letra, ya que es lo que calcula

public class Ej3Tema4 {

	public static void main(String[] args) {
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X'
				        'B','N','J','Z','S','Q','V','H','L','C','K','E' };
		Scanner inputValue = new Scanner(System.in);  //Siempre que aparezca inputValue o Scanner son valores que el usuario introduce
		int dni;
		   System.out.println("Enter a DNI");
		dni = inputValue.nextInt();
		   System.out.println("The letter is: "+letra[dni%23]);
		
		}
		
		

	}

