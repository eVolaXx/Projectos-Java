import java.util.Scanner;
class BreakDemo {
	public static void main(String[] args) {
		boolean prime = true;
		int n;
		
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		n = inputValue.nextInt();
		
		for (int i=2; i<n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime)
		    System.out.println("Prime");
		else 
		     System.out.println("not prime");
		    
	}
}
		     