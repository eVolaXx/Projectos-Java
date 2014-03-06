/* Write a program that reads 10 numbers 
 * and then displays them reverts the order 
 * swapping elements, and writes the result 
 * starting from the first element of the 
 * new ordered array. */
public class Tema4Ej6 {
	public static void main(String[] argv) {
		char[] arrayChar={'t','h','i','s','i','s','a','t','e','s','t',
				's','e','n','t','e','n','c','e','.'};
		char candidateChar = arrayChar[0];
		int candidateFrequency = 1;
		int cont;
		for (int iCheck=0; iCheck<arrayChar.length;iCheck++) {
			cont=0;
			for (int i=0; i<arrayChar.length; i++) {
				if (arrayChar[iCheck]==arrayChar[i]) {
					cont++;
				}
			}
			if (cont>candidateFrequency) {
				candidateChar=arrayChar[iCheck];
				candidateFrequency=cont;
			}
		}
		System.out.println("Mode char: "+candidateChar+". Frequency:"+
							candidateFrequency);
	}
}