/*Write a program that reads a DNI (without the letter) and then 
 * calculates the letter, knowing that the letter is calculated 
 * this way:
 * take the DNI as a number and calculate the remainder of the 
 * division by 23, and assign the letter depending on the remainder 
 * using the following table:
 * remainder 
 * 0	1	2	3	4	5	6	7	8	9	10	
 * T	R	W	A	G	M	Y	F	P	D	X
 * 11	12	13	14	15	16	17	18	19	20	21	22
 * B	N	J	Z	S	Q	V	H	L	C	K	E
 * 
 */
import java.util.Scanner;
public class Tema4Ej3 {
	public static void main(String[] argv) {
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X',
				'B','N','J','Z','S','Q','V','H','L','C','K','E' };
		Scanner inputValue= new Scanner(System.in);
		int dni;
		System.out.println("Enter a DNI:");
		dni = inputValue.nextInt();
		System.out.println("The letter is: "+letra[dni%23]);
	}	
}
