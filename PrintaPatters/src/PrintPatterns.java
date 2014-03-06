
public class PrintPatterns {

	public static void main(String[] args) {
		System.out.println("Exercise A");
		printPatternA(8);
		System.out.println("Exercise B");
		printPatternB(8);
		System.out.println("Exercise C");
		printPatternC(8);
		System.out.println("Exercise D");
		printPatternD(8);
		System.out.println("Exercise E");
		printPatternE(8);
		System.out.println("Exercise F");
		printPatternF(7);
		System.out.println("Exercise G");
		printPatternG(7);
		System.out.println("Exercise H");
		printPatternH(7);
		System.out.println("Exercise I");
		printPatternI(7);
		System.out.println("Exercise J");
		printPatternJ(11);
		System.out.println("Exercise K");
		printPatternK(11);
		System.out.println("Exercise L");
		printPatternL(11);
		System.out.println("Exercise M");
		printPatternM(8);
		System.out.println("Exercise N");
		printPatternN(8);
		System.out.println("Exercise O");
		printPatternO(8);
		System.out.println("Exercise P");
		printPatternP(8);
		System.out.println("Exercise Q");
		printPatternQ(15);
		System.out.println("Exercise R");
		printPatternR(15);
		
	}
	
	public static void printPatternA(int size) {
		for(int i=1; i<=size; i++){
			for(int j=1 ; j<=i; j++){
				System.out.print("# ");
			}
		System.out.println("");
		}
	}
	
	public static void printPatternB(int size) {
		for(int i=1; i<=size; i++){
			for(int j=i ; j<=size; j++){
				System.out.print("# ");
			}
		System.out.println("");
		}
	}
	
	public static void printPatternC(int size) {
		for(int i=1; i<=size; i++){
			
			for (int x=2; x<=i; x++){
				System.out.print("  ");
			}
			for(int j=i ; j<=size; j++){
				System.out.print("# ");
			}
			
		System.out.println("");
		}
	}
	
	public static void printPatternD(int size) {
		int cont = 1;
		
		for(int i=1; i<=size; i++){
			for (int x=1; x<=size-i; x++){
				System.out.print("  ");
			}
			cont++;
			for(int j=1 ; j<cont; j++){
				System.out.print("# ");
			}
		System.out.println("");
		}
	}
	
	public static void printPatternE(int size) {
		
		for(int i=1; i<=size; i++){
			System.out.print("# ");
		}
		System.out.println("");
		
		for (int x=1; x<=size-2; x++){
			System.out.print("#   ");
			for (int j=1; j<=size+2; j++){
				System.out.print(" ");
			}
			System.out.print("# ");
			System.out.println("");
		}
		for(int i=1; i<=size; i++){
			System.out.print("# ");
		}
		
		System.out.println();
	}
	public static void printPatternF(int size) {
		for(int i=1; i<=size; i++){
			System.out.print("# ");
		}
		System.out.println();
		for(int x=1; x<=5; x++){
			for (int j=1; j<=x; j++){
				System.out.print("  ");
			}
		System.out.println("#");
		}
		for(int i=1; i<=size; i++){
			System.out.print("# ");
		}
		System.out.println();
	}
	public static void printPatternG(int size) {
		for(int i=1; i<=size; i++){
			System.out.print("# ");
		}
		System.out.println();
		
		for(int x=1; x<=5; x++){
			for (int j=1; j<=size-x-1; j++){
				System.out.print("  ");
			}
		System.out.println("#");
		}
		
		
		for(int i=1; i<=size; i++){
			System.out.print("# ");
		}
		System.out.println();
	}
	
	public static void printPatternH(int size) {
		int cont=-2;
		for(int i=1; i<=size; i++){
			System.out.print("# ");
		}
		System.out.println();
		/////////////////////////
		for(int x=1; x<=5; x++){
			for (int j=1; j<=size-x-1; j++){
				System.out.print("  ");
			}
			
		System.out.println("#");
		}
		//////////////////////////
		for(int i=1; i<=size; i++){
			System.out.print("# ");
		}
		System.out.println();
		
	}

	public static void printPatternI(int size) {
		for (int x=0; x<=size; x++){
			System.out.print("# ");
		}
		System.out.println();
	}
	
	public static void printPatternJ(int size) {
		int contador = 1;
		for (int x=1; x<=size; x++){
			System.out.print("# ");
		}
		System.out.println();
		
		for(int j=1; j<=6; j++){
			if (contador>=j){
				for(int l=1; l<=contador; l++){
					System.out.print("  ");
				}
				contador++;
			}
			for (int w=0; w<=size-contador-j; w++){
				System.out.print("# ");
			}
			System.out.println("");
		}
			
	}
	public static void printPatternK(int size) {
		int contador = 1;

		for(int j=1; j<=6; j++){
			if (contador>=j){
				for(int l=0; l<=size/2-j; l++){
					System.out.print("  ");
				}
				contador++;
			}
			for (int w=2; w<=contador+j-1; w++){
				System.out.print("# ");
			}
			System.out.println("");
		}
		
		System.out.println();
	}
	
	public static void printPatternL(int size) {
		int contador = 1;
		int contador2 = 1;
		for(int j=1; j<=6; j++){
			if (contador>=j){
				for(int l=0; l<=size/2-j; l++){
					System.out.print("  ");
				}
				contador++;
			}
			for (int w=2; w<=contador+j-1; w++){
				System.out.print("# ");
			}
			System.out.println("");
		}
		
		for(int j=1; j<=6; j++){
			if (contador2>=j){
				for(int l=1; l<=contador2; l++){
					System.out.print("  ");
				}
				contador2++;
			}
			for (int w=0; w<=size-contador2-j; w++){
				System.out.print("# ");
			}
			System.out.println("");
		}
		
		System.out.println();
	}
	public static void printPatternM(int size) {
		int num=1;
		for(int i=1; i<=size; i++){
			for(int j=0 ; j<=i-1; j++){
				System.out.print(num + j + " ");
			}
		System.out.println("");
		}
	}
	public static void printPatternN(int size) {
		int num =1;
			for(int i=1; i<=size; i++){
				for (int x=2; x<=i; x++){
					System.out.print("  ");
				}
				for(int j=i ; j<=size; j++){
					System.out.print(num  + " ");
					num = num + 1;
				}
				num = 1;
				System.out.println("");
			}
	}
	public static void printPatternO(int size) {
		int num=1;
		int cont = 1;
		
		for(int i=1; i<=size; i++){
			for (int x=1; x<=size-i; x++){
				System.out.print("  ");
			}
			cont++;
			for(int j=1 ; j<cont; j++){
				System.out.print(num + i - j + " ");
			}
		System.out.println("");
		}
	}
	public static void printPatternP(int size) {
		int num = 9;
		for(int i=1; i<=size; i++){
			for(int j=i ; j<=size; j++){
				System.out.print(num - j + " ");
			}
		System.out.println("");
		}
	}
	public static void printPatternQ(int size) {
		int contador = 1;
		int num = 1;

		for(int j=1; j<=8; j++){
			if (contador>=j){
				for(int l=0; l<=size/2-j; l++){
					System.out.print("  ");
				}
				contador++;
			}
			for (int w=2; w<=contador+j-1; w++){
				if (!(j == w-1) && (!(num==0))){
					System.out.print(num  + " ");
					num = num + 1;
				}else{
					while(num>=1){
					System.out.print(num  + " ");
					num = num - 1;
					}
				}
			}
			num = 1;
			
			System.out.println("");
		}
		
		System.out.println();
	}
	
	public static void printPatternR(int size) {
		int contador = 0;
		int num = 0;
		
		for(int j=0; j<=8; j++){
			if (contador>=j){
				for(int l=1; l<=contador; l++){
					System.out.print("  ");
				}
				contador++;
			}
			for (int w=0; w<=size-contador-j; w++){
				if(){
					num = num + 1;
					System.out.print(num + " ");
				}else{
					num = num - 1;
					System.out.print(num + " ");
				}
			}
			System.out.println("");
		}
		
		
	}
	
	
	
}
