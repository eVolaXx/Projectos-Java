import java.util.Scanner;
class ex21 }
	public static void main(String[] args) {
		int positives, i, num;
		
        //Reading the value
        Scanner inputValue;
        inputValue=new Scanner(System.in);
        
        i=0;
        positives=0;
        while (i<10) {
             num = inputValue.nextInt();
             if (num>=0) {
                 positives = positives + 1;
             }
        i = i + 1;
        }
	}
}
        System.out.println(positives + " positives");
        
        
 

		// TODO Auto-generated method stub

	


