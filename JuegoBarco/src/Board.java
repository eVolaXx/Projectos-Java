
public class Board {
		char[][] boardCells=new char[8][8];
		boolean[][] shipPlaces=new boolean[8][8];
		int sunkShips=0;
		
		Board() {
			for (int i=0;i<8;i++)
				for (int j=0; j<8; j++)
					boardCells[i][j]=' ';
		}
		
		int getSunkShips() {
			return sunkShips;
		}
		
		public void createShips(int numShips) {
			int r1, r2;
			int cont = 0;
			while (cont<numShips) {
				r1 = (int) (Math.random()*8); 
				r2 = (int) (Math.random()*8);
				if (!shipPlaces[r1][r2]) {
					shipPlaces[r1][r2]=true;
					cont++;
				}
			}
		}

		public boolean shotAt(char row, int column) {
			int rowNumber = row - 'a';
			if ((rowNumber<0) ||( rowNumber>7) ||
				(column<1) || (column>8)) 
				return false;
			if (boardCells[rowNumber][column-1]!=' ')
				return false;
			if (shipPlaces[rowNumber][column-1]) {
				boardCells[rowNumber][column-1]='X';
				sunkShips++;
			} else {
				boardCells[rowNumber][column-1]='O';
			}
			return true;
		}
		
		public void print() {
			char letter='a';
			System.out.println("  1 2 3 4 5 6 7 8");
			for (int i=0; i<8; i++) {
				System.out.print(letter+" ");
				letter++;
				for (int j=0; j<8; j++) {
					System.out.print(boardCells[i][j]+" ");
				}
				System.out.println();
			}
		}
	}


