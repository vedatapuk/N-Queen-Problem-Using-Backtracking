public class NQueenProblem {
	
	final int N = 8;

	public void printBoard(int board[][]) {
		for (int i = 0; i < N; i++) { 
			for (int j = 0; j < N; j++) {
				System.out.print(" " + board[i][j] + " "); 
			}
			System.out.println(); 
		}
	}

	public boolean checkQueen(int board[][], int row, int columns) { 
		int i, j; 

		// Checking this row on left side
		for(i=0; i<columns; i++){
			if(board[row][i] == 1){
				return false;
			}
		}

		// Checking upper diagonal on left side
		for(i=row, j=columns; i>=0 && j>=0; i--, j--){
			if(board[i][j] == 1){
				return false;
			}
		}

		// Checking lower diagonal on left side
		for(i=row, j=columns; j>=0 && i<N; i++, j--){
			if(board[i][j] == 1){
				return false;
			}
		}

		return true;

	} 

	// A recursive function to solve N Queen problem 
	public boolean solveRecursion(int board[][], int column) { 

		// If all queens all placed, then return true
		if (column >= N){
			return true;
		} 
			 
		//Place this queen in all rows one by one 
		for (int i = 0; i < N; i++) { 

			if (checkQueen(board, i, column)) 
			{ 
				// Place this queen in board[i][column] =
				board[i][column] = 1; 

				// Recur to place rest of the queens
				if (solveRecursion(board, column + 1) == true) {
					return true; 
				}

				/* Remove this queen from board[i][col], 
				if it can't be placed anywhere on board,
				in that case try to place it by using solveBacktrack() */
				board[i][column] = 0;
			} 
		}
		return false;
	}

	/* This function solves the N Queen problem using 
	Backtracking. It mainly uses solves with recursion
	by using solveRecursion(). It returns false if queens 
	cannot be placed, otherwise, return true and 
	prints placement of queens in the form of 1s. 
	Please note that there may be more than one 
	solutions, this function prints one of the 
	feasible solutions.*/
	public boolean solveBacktrack() { 
		/* Modify dimensions of this array, if you 
		want to change a number of queens(in this 
		case are 8 queens*/
		int board[][] = {
			{0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0} 
		}; 

		if (solveRecursion(board, 0) == false) { 
			System.out.print("Solution does not exist"); 
			return false; 
		} 

		printBoard(board); 
		return true; 
	} 

	public static void main(String[] args) {
		NQueenProblem queen = new NQueenProblem(); 
		queen.solveBacktrack();
	}

}