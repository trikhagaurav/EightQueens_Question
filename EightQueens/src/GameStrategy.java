public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		
		return cellId%8;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
		WRITE YOUR LOGIC HERE...............................

	    */
		
		System.out.println(row+", "+col);
		
		if(numQueens == 0) {
			placedQueens[row][col] = true;
			numQueens++;
		}
		else {
			for(int i=0;i<8;i++) {
				if(placedQueens[row][i] == true) {
					return false;
				}
				if(placedQueens[i][col] == true) {
					return false;
				}
				if(i<row) {
					if((col+row-i)<8 && placedQueens[i][col+row-i] ==true)
						return false;
					if((col-row+i)>0 && placedQueens[i][col-row+i] ==true)
						return false;
				}
				else if(i>row) {
					if((col+row-i)>0 && placedQueens[i][col+row-i] ==true)
						return false;
					if((col-row+i)<8 && placedQueens[i][col-row+i] ==true)
						return false;
				}
					
			}
			placedQueens[row][col] = true;
			numQueens++;
			
			
		}
		
		
		return isValid;
	}
}














