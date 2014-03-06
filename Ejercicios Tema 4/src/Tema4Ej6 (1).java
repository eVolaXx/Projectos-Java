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
		int maxIndex=arrayChar.length-1;
		int iChecked=0;
		int i;
		while (iChecked<=maxIndex) {
			cont=1;
			i=iChecked+1;
			while (i<=maxIndex) {
				if (arrayChar[iChecked]==arrayChar[i]) {
					cont++;
					arrayChar[i]=arrayChar[maxIndex];
					maxIndex--;
				}
				i++;
			}
			if (cont>candidateFrequency) {
				candidateFrequency=cont;
				candidateChar=arrayChar[iChecked];
			}
			iChecked++;
		}
		System.out.println("Mode char: "+candidateChar+". Frequency:"+
							candidateFrequency);
	}
}

