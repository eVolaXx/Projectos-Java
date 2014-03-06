public class Matrix {

	public static void main(String[] args) {
		int [] [] matrix = new int [10][10];
		int w = -1;
		int contador1 = 1;
		int contador2 = 1;
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				contador1 = contador1 + 1;
				if (contador1>10){
					System.out.println(matrix[i][j] + " ");
					contador1 = 1;}
				else
				System.out.print(matrix[i][j] + " ");
			}
		}	
		matrix[0][4] = 1;
		matrix[2][6] = 1;
		matrix[3][1] = 1;
		matrix[8][6] = 1;
		
		System.out.println(" ");
		boolean allzero;
		for (int i=0; i<10; i++) {
			allzero = true;
			for (int j=0; j<10; j++) {
				contador1 = contador1 + 1;
				if (contador1>10){
					System.out.println(matrix[i][j] + " ");
					contador1 = 1;}
				else
				System.out.print(matrix[i][j] + " ");
			}
		}	
		contador1 = 0;
		contador2 = 0;
		allzero = true;
		
		for (int x=0; x<10; x++){
			allzero = true;
			for(int y=0; y<10; y++){
				if (matrix[y][x]!= 0){
					allzero = false;
					break;
				}	
			}
			if (allzero)
				contador1++;
		}	
		System.out.println("Number of columns all zeros:" +contador1);
		contador1 = 0;
		contador2 = 0;
		allzero = true;
		for (int x=0; x<10; x++){
			allzero = true;
			for(int y=0; y<10; y++){
				if (matrix[x][y]!= 0){
					allzero = false;
					break;
				}	
			}
			if (allzero)
				contador1++;
		}	
			
		System.out.println("Number of rows all zeros:" +contador1);
	}
}

