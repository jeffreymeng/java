/*
 * Programmer: Jeffrey Meng
 * Date: May 23, 2018
 * Purpose: A class
 */

class SodukuBoardValidationResult {

	private int x, y;//the x and y coordinates of the error, where (0, 0) is the top left.
	private int incorrectNumber;//the number that was used incorrectly
	private boolean valid;
	private String errorMessage, type;
	
	public SodukuBoardValidationResult(boolean valid) {
		this.valid = valid;


	}

	public SodukuBoardValidationResult(boolean valid, int x, int y, int incorrectNumber, String type) {
		//type can be column, row, or block.
		this.valid = valid;
		this.x = x;
		this.y = y;
		this.incorrectNumber = incorrectNumber;
		this.type = type;
		this.errorMessage = "Duplicate number '" + incorrectNumber + "' in " + type + " " + x + " at (" + x + ", " + y + ").";

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String getType() {
		return type;
	}
	
	public int getIncorrectNumber() {
		return incorrectNumber;
	}

	public boolean isValid() {
		return valid;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
