import java.util.Scanner;
public class PrincipalBarco {
	final static int NUM_SHIPS=10;
	public static void main(String[] args) {
		Scanner inputValue = new Scanner(System.in);
			Board board = new Board();
			char row;
			int column;
			board.createShips(NUM_SHIPS);
			int shots = 0;
			int sunkShips = 0;
			while (sunkShips<NUM_SHIPS){
				System.out.println("----------------------------------");
				System.out.println("SHOTS: "+shots);
				System.out.println("SUNK SHIPS "+board.getSunkShips());
				board.print();
				do {
					System.out.println("Enter row (letter):");
					row=inputValue.next().charAt(0);
					System.out.println("Enter a column (number):");
					column=inputValue.nextInt();
				} while (!board.shotAt(row,column));
				shots++;
			}

	}

}
