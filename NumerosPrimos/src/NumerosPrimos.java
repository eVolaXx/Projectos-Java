import java.util.Scanner;
class NumerosPrimos {
	public static void main(String[] args) {
		int contador_primos;
		double i,j,numero_primo, otro_contador = 0;
		double primos[] = new double[500];
		primos[0] = 3;
		
		for (i = 7, numero_primo = 30;/* 2*3*5*/, contador_primos = 3; j = 1;i<=700;i+=2) {
			if (otro_contador==4 ) {
				i+=2;
				otro_contador=0;
			}
			otro_contador++;
			for(int b=0;;b++) {
				if(i%primos[b]==0) break;
				if(i%primos[b] !=0 && primos[b]>(i/3) {
					contador_primos++;
					primos[(int) j] = i;
					j++;
					numero_primo*=i;
					break;
				}
			}
		}
		numero_primo +=1;
		System.out.println("El numero primo obtenido es: "+numero_primo+ " y se ha utilizado un total de "+contador_primos+" sin contar el 1");
	}
}