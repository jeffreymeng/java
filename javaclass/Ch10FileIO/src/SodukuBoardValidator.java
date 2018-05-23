/*
 * Programmer: Jeffrey Meng
 * Date: May 21, 2018
 * Purpose: Validate a text file containing a soduku board
 */

import java.util.Scanner;
import java.io.File;

class SodukuBoardValidator {
	
	int[][] board;


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the path of the file to read from: ");
		String path = in.nextLine();
		SodukuBoardValidator validator = new SodukuBoardValidator(path);
		SodukuBoardValidationResult result = validator.validate();
		if (result.isValid()) {
			System.out.println("Your board is valid!");
		} else {
			System.out.println("Your board is not valid!");
			System.out.println("Your error: " + result.getErrorMessage());
		}

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
				if (line[0] == null) {
					continue;
				}
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
	
	
	public SodukuBoardValidationResult validate() {

		boolean[] numList = new boolean[9];//boolean[] init to false - this numList is for rows, it can be reset after each iteration
		String error = "";//TODO: consider printing error
		
		for (int i = 0; i < board[0].length; i ++) {
			//check the rows - i is the row, col is the column
			numList = new boolean[9];//reset numList to all false
			for (int col = 0; col < board[0].length; col ++) {
				if (numList[board[i][col] - 1]) {
					
					return new SodukuBoardValidationResult(false, i + 1, col + 1, board[i][col], "row");
				}
				numList[board[i][col] - 1] = true;//set the number to used. (start counting array from 0, so subtract one)

			}
		}

		for (int i = 0; i < board.length; i ++) {	
			//check the columns - now i is the column
			numList = new boolean[9];
			for (int row = 0; row < board.length; row ++) {
				if (numList[board[row][i] - 1]) {
					
                                        return new SodukuBoardValidationResult(false, row + 1, i + 1, board[row][i], "column");
				} else {
					numList[board[row][i] - 1] = true;
				}
				

			}
	
		}
		
		boolean[][][]blockNumList = new boolean[3][3][9];//numList for each x, y block, where top left is 1, 1, and bottom right is 3, 3. Middle is 2, 2.
		for (int x = 0; x < 9; x ++) {
			for (int y = 0; y < 9; y ++) {
				//check each 3 by 3 'block'
				int blockx = (int) Math.ceil((double) (x + 1) / 3) - 1;//convert coordinates starting from 1 to coordinates starting from 0
				int blocky = (int) Math.ceil((double) (y + 1) / 3) - 1;				
				if (blockNumList[blockx][blocky][board[y][x] - 1]) {// In a 2d array, x,y is inverted because it is row first, then column.	
					
					return new SodukuBoardValidationResult(false, x + 1, y + 1, board[y][x], "block");
				} else {

					blockNumList[blockx][blocky][board[y][x] - 1] = true;
				}		
			}
		}
		return new SodukuBoardValidationResult(true);
	}	


}
