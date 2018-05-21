/*
 * Programmer: Jeffrey Meng
 * Date: May 21, 2018
 * Purpose: Validate a text file containing a soduku board
 */

class SodukuBoardValidator.java {
	
	int[][] board;


	public static void main(Strign[] args) {



	}


	public SodukuBoardValidator(int[][] board) {
		this.board = board;
	}

	public SodukuBoardValidator(String path) {
		setBoard(path);

	}

	public void setBoard(int[][] board) {

		this.board = board;

	}

	public void setBoard(String path) {
		this.board = new int[9][9];
		Scanner reader;
                File file;
                int length = 0;
                try {
                        file = new File(path);

                        reader = new Scanner(file);
                        String[] line = new String[9];
			
			
                        for (int i = 0; reader.hasNextLine(); i ++) {
                                line = reader.nextLine().split(",");
				for (int j = 0; j < board[i].length; j ++) {
					board[i][j] = Integer.parseInt(line[j]);

				}
                        }

                        reader.close();

                        
                } catch (Exception ex) {
                        ex.printStackTrace();
                }

	}
	
	public int[][] getBoard() {
		return board;
	}

	public boolean validate() {

		boolean[] numList = new boolean[9];//boolean[] init to false - this numList is for rows, it can be reset after each iteration
		boolean[][] colNumList = new boolean[9][9];//this numList is for each column, the x is the column, y is numbers for each column. - we need a 2d array because column
		//is not self contained; it's data cannot reset between iterations.
		String error = "";//TODO: consider printing error

		for (int i = 0; i < board[0].length; i ++) {
			//check the rows - i is the row, col is the column
			numList = new boolean[9];//reset numList to all false
			for (int col = 0; col < board[0].length; col ++) {
				if (numList[board[i][col] - 1]) {
					error = "Duplicate number '" + board[i][col] + "' in row at location " + (i + 1) + "," + (col + 1) + ".";
					return false;
				}
				numList[board[i][col] - 1] = true;//set the number to used. (start counting array from 0, so subtract one)

			}
			
			//check the columns - now i is the column
			numList = new boolean[9];//reset numList to all false
			for (int row = 0; row < board.length; row ++) {
				if (colNumList[i][board[row][i]]) {
					error = "Duplicate number '" + board[row][i] + "' in column at location " + (row + 1) + "," + (i + 1) + ".";
                                        return false;
				}
				

			}

			
		
		}

	}	


}
