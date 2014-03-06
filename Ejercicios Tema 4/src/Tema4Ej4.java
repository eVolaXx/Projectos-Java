public class Tema4Ej4 {
	
	final static int SIZE=10;
	
	public static void main(String[] argv) {
		int[][] matrix = new int[SIZE][SIZE];
		for (int i=0; i<SIZE;i++) 
			for (int j=0; j<SIZE; j++) 
				matrix[i][j]=0;
		
		matrix[0][4]=1;
		matrix[2][6]=1;
		matrix[3][1]=1;
		matrix[8][6]=1;
		
		for (int i=0; i<SIZE;i++) {
			for (int j=0; j<SIZE; j++) 
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		int cont=0;
		for (int i=0; i<SIZE; i++) {
			boolean todoCeros=true;
			for (int j=0; j<SIZE; j++) {
				if (matrix[i][j]!=0) {
					todoCeros=false;
					break;
				}
			}
			if (todoCeros)
				cont++;
		}
		System.out.println("Number of rows with all 0: "+cont);
		
		cont = 0;
		for (int i=0; i<SIZE; i++) {
			boolean todoCeros=true;
			for (int j=0; j<SIZE; j++) {
				if (matrix[j][i]!=0) {
					todoCeros=false;
					break;
				}
			}
			if (todoCeros)
				cont++;
		}
		System.out.println("Number of columns with all 0: "+cont);
	}
}
