/**
 * Creamos un mapa de string(nombres)y codigos de cada persona. Leyendo el archivo de lectura de LastNameFrequencies.csv
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
public class HashMapMetod {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> m = new  LinkedHashMap<String, Integer>(100000);
		

		try {
			in = new BufferedReader(new FileReader("LastNameFrequencies.csv"));
			String a = null;
			String lastname;
			
			
			
			do {
				System.out.println("Escribe el nombre:");
				lastname = scan.nextLine().toUpperCase();
				System.out.println("Frecuencia para "+lastname+" = "+m.get(lastname));
			} while (!lastname.equals(""));
			       System.out.println("Escribe el nombre:");
			  
			       while((a = in.readLine() !=null)) {
				    lastname = scan.nextLine();
			       }
			
			if(lastname==null) {
				in.close();
			}
			
		
		
		
			
	} finally {
		if(in! = null) {
			in.close();
	    }
			
		
		
	

		
		
	 

	


