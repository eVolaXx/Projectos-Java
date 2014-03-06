package adivina;

import java.util.Random;
import java.util.Scanner;

public class adivina {

	public static void main(String[] args) throws java.io.IOException {
		Random generador = new Random();
		Scanner scanner = new Scanner(System.in);
		  int numero_ordenador = generador.nextInt(100) + 1;
		  int numero_humano;
		  int intentos = 0;
		    System.out.println("Adivina el numero del 1 al 100");
		     do {
		    	 numero_humano = scanner.nextInt();
		    	 // Lee el numero introducido por teclado
		    	 //Da una pista de si el numero es mayor o menor del introducido
		    	 if (numero_ordenador < numero_humano) {
		    		 System.out.println("Menos");
		    	 }
		    	 if (numero_ordenador > numero_humano) { 
		    		 System.out.println("Mayor");
		    		
		    	 }
		    	 //Repite mientas el humano no acierte
		    	 intentos++;
		     } while (numero_ordenador != numero_humano && intentos < 3);
		         if ( numero_ordenador == numero_humano) {
		        	 System.out.println("Correctos has acertado CAMPEON jajja");
		         } else { 
		        	 System.out.println("No has fracasado CAPUYO");
		         }
	              
		     
		     
		 
// El siguiente programa es un sencillo juego en el que el ordenador nos reta a adivinar un número entre el 1 y el 100 en tres intentos. Cuando nos equivocamos nos da una pista diciendo si nos hemos pasado por arriba o por abajo, y nos brinda una nueva oportunidad de acertar, hasta que o bien demos con el número, o bien agotemos los tres intentos.


	}

}
