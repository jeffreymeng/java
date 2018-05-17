/*
 * Programmers: Jeffrey Meng and Dylan Yang
 * Date: Mar 27, 2018
 * Purpose: This class manages a column format level.
 */

package level;

import util.Utils;

public class ColumnLevel extends Level {
	private Digit[][] digitGrid = new Digit[3][1];// { {/* first number */}, {/*
													// second number */}, {/*
													// sum/difference/product/quotient
													// */} }
	private Digit[][] alignedDigitGrid; // same as numGrid except all numbers
									   // are right-aligned, empty spaces are
									   // space digits
	//private int numVariables;
	// TODO: set null allignedDigitGrid elements to space digits
	private int[][] hiddenDigits; // effectively an array of 3-tuples in format
								 // {row, column, answer}
	// stores answers and their locations in digitGrid
	private char operation; // should be one of the final static variables below
	private int maxNumLength;

	public final static char ADDITION = '+';
	public final static char SUBTRACTION = '-';
	public final static char MULTIPLICATION = '*';
	public final static char DIVISION = '/';

	/**
	 * Constructs a new ColumnLevel. The operation is addition by default.
	 */
	public ColumnLevel() {
		this.operation = ADDITION;
		num1 = Utils.randInt(1, 1000);
		num2 = Utils.randInt(1, 1000);

		checkNums();

		fillDigitGrid(num1, num2);

		numVariables = 2;

		// number of 3-tuples matches number of variables
		hiddenDigits = new int[numVariables][3];
		
		addVariables();
	}

	/**
	 * Constructs a new ColumnLevel with a specified operation.
	 * 
	 * @param operation
	 *            the operation for this level
	 */
	public ColumnLevel(char operation) {
		this.operation = operation;
		num1 = Utils.randInt(1, 1000);
		num2 = Utils.randInt(1, 1000);

		checkNums();

		fillDigitGrid(num1, num2);

		numVariables = 2;

		// number of 3-tuples matches number of variables
		hiddenDigits = new int[numVariables][3];
		
		addVariables();
	}

	/**
	 * Constructs a new ColumnLevel with a specified operation and number of
	 * variables
	 * 
	 * @param operation
	 *            the operation for this level
	 * @param numVariables
	 *            the number of variables for this level
	 */
	public ColumnLevel(char operation, int numVariables) {
		this.operation = operation;
		this.numVariables = numVariables;
		num1 = Utils.randInt(1, 1000);
		num2 = Utils.randInt(1, 1000);

		checkNums();

		fillDigitGrid(num1, num2);

		// number of 3-tuples matches number of variables
		hiddenDigits = new int[this.numVariables][3];
		
		addVariables();
	}

	/**
	 * Constructs a new ColumnLevel with a specified operation, num1, and num2.
	 * 
	 * @param operation
	 *            the operation for this level
	 * @param num1
	 *            the first addend or factor, the minuend, or the dividend
	 * @param num2
	 *            the second addend or factor, the subtrahend, or the divisor
	 */
	public ColumnLevel(char operation, int num1, int num2) {
		this.operation = operation;
		this.num1 = num1;
		this.num2 = num2;

		checkNums();

		fillDigitGrid(num1, num2);

		numVariables = 2;

		// number of 3-tuples matches number of variables
		hiddenDigits = new int[numVariables][3];
		
		addVariables();
	}

	/**
	 * Constructs a new ColumnLevel with a specified operation and range for
	 * generating num1 and num2.
	 * 
	 * @param operation
	 *            the operation for this level
	 * @param min1
	 *            the minimum value for the first number (inclusive)
	 * @param max1
	 *            the maximum value for the first number (exclusive)
	 * @param min2
	 *            the minimum value for the second number (inclusive)
	 * @param max2
	 *            the maximum value for the second number (exclusive)
	 */
	public ColumnLevel(char operation, int min1, int max1, int min2, int max2) {
		this.operation = operation;
		num1 = Utils.randInt(min1, max1);
		num2 = Utils.randInt(min2, max2);

		checkNums();

		fillDigitGrid(num1, num2);

		numVariables = 2;

		// number of 3-tuples matches number of variables
		hiddenDigits = new int[numVariables][3];
		
		addVariables();
	}

	/**
	 * Checks if num1 and num2 need to be swapped, and swaps them if necessary.
	 * if: operation is subtraction and num2 > num1 or: operation is addition
	 * and num2 has more digits than num1 then: switch num1 and num2
	 */
	private void checkNums() {
		if (operation == SUBTRACTION && num2 > num1 || operation == ADDITION
				&& Utils.getDigits(num2) > Utils.getDigits(num1))
			swapDigits();
	}

	/**
	 * Switches num1 and num2.
	 */
	private void swapDigits() {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}

	/**
	 * Fills digitGrid with the individual digits of each number.
	 * 
	 * @param num1
	 *            the first number
	 * @param num2
	 *            the second number
	 */
	private void fillDigitGrid(int num1, int num2) {
		/*
		 * For each digit of num1:
		 * - find the value of that digit by converting num1 to a string and using the charAt and
		 *   getNumericValue methods
		 * - construct a new Digit using that value with visibility set to true
		 * - store that Digit in the next empty space in the first row of digitGrid
		 */
		String num1String = String.valueOf(num1); // converts num1 to string
		digitGrid[0] = new Digit[num1String.length()]; // set the first row of
														// the digitGrid to the
														// length of num1

		// converts each character in num1String into an integer
		// constructs Digits using that integer value
		// stores the Digits in digitGrid
		for (int i = 0; i < num1String.length(); i++) {
			digitGrid[0][i] = new Digit(Character.getNumericValue(num1String
					.charAt(i)), true);
		}
		/*
		 * For each digit of num2: - find the value of that digit by converting
		 * num2 to a string and using the charAt and getNumericValue methods -
		 * construct a new Digit using that value with visibility set to true -
		 * store that Digit in the next empty space in the second row of
		 * digitGrid
		 * 
		 * Process used is identical to that used for num1.
		 */
		String num2String = String.valueOf(num2);
		digitGrid[1] = new Digit[num2String.length()];
		for (int i = 0; i < num2String.length(); i++) {
			digitGrid[1][i] = new Digit(Character.getNumericValue(num2String
					.charAt(i)), true);
		}

		String resultString; // the sum, difference, product, or quotient as a
								// String
		switch (operation) {
		case ADDITION:
			resultString = String.valueOf(num1 + num2);
			break;
		case SUBTRACTION:
			resultString = String.valueOf(num1 - num2);
			break;
		case MULTIPLICATION:
			resultString = String.valueOf(num1 * num2);
			break;
		case DIVISION:
			resultString = String.valueOf(num1 / num2);
			break;
		default:
			resultString = "";
			break;
		}

		// converts each character in resultString into an integer
		// constructs Digits using that integer value
		// stores the Digits in the third row of digitGrid
		digitGrid[2] = new Digit[resultString.length()];
		for (int i = 0; i < resultString.length(); i++) {
			digitGrid[2][i] = new Digit(Character.getNumericValue(resultString
					.charAt(i)), true);
		}

		maxNumLength = 0; // the number of digits in the longest number
		// loops through each number; set its length equal to maxNumLength if it
		// is the longest yet checked
		for (int i = 0; i < digitGrid.length; i++) {
			if (digitGrid[i].length > maxNumLength) {
				maxNumLength = digitGrid[i].length;
			}
		}

		// fills alignedDigitGrid
		alignedDigitGrid = new Digit[digitGrid.length][maxNumLength];
		// loops through each Digit in digitGrid
		// maxNumLength - digitGrid[i].length is equal to amount of whitespace
		// needed at beginning of line
		for (int i = 0; i < digitGrid.length; i++) {
			for (int j = 0; j < digitGrid[i].length; j++) {
				alignedDigitGrid[i][j + (maxNumLength - digitGrid[i].length)] = digitGrid[i][j];
			}
		}

		for (int i = 0; i < alignedDigitGrid.length; i++) {
			for (int j = 0; j < alignedDigitGrid[i].length; j++) {
				//cleanup
				if (alignedDigitGrid[i][j] == null) {
					alignedDigitGrid[i][j] = new Digit(true, true);//(is visible, is space)
				}
			}
		}
	}

	/**
	 * Returns the operation for this level.
	 * 
	 * @return
	 */
	public char getOperation() {
		return operation;
	}

	/**
	 * Sets the operation for this level.
	 * 
	 * @param operation
	 *            the new operation for this level
	 */
	public void setOperation(char operation) {
		this.operation = operation;

		checkNums(); // whether num1 and num2 need to be switched depends on
						// operation
	}

	/**
	 * Returns the digitGrid of this level.
	 * 
	 * @return a Digit matrix containing all objects in digitGrid
	 */
	public Digit[][] getDigitGrid() {
		return digitGrid;
	}

	/**
	 * Returns the alignedDigitGrid of this level.
	 * 
	 * @return a Digit matrix containing all objects in alignedDigitGrid
	 */
	public Digit[][] getAlignedDigitGrid() {
		return alignedDigitGrid;
	}

	/**
	 * Returns the length of digitGrid.
	 * 
	 * @return the number of objects in digitGrid
	 */
	public int getDigitGridLength() {
		int sum = 0;
		// for each row in digitGrid
		for (int i = 0; i < digitGrid.length; i++)
			sum += digitGrid[i].length;
		return sum;
	}

	/**
	 * Returns the number of digits in the longest number, including the sum,
	 * difference, product, or quotient, if applicable.
	 * 
	 * @return the length of the longest number.
	 */
	public int getMaxNumLength() {
		return maxNumLength;
	}

	/**
	 * Adds variables in random locations and stores them in hiddenDigits.
	 */
	public void addVariables() {
		int randRowIndex;
		int randColIndex;

		// loops n times where n equals numVariables
		for (int i = 0; i < numVariables; i++) {
			// generate random row and column
			randRowIndex = Utils.randInt(0, digitGrid.length);
			randColIndex = Utils.randInt(0, digitGrid[1].length);

			// store the random row and column in hiddenDigits
			hiddenDigits[i][0] = randRowIndex;
			hiddenDigits[i][1] = randColIndex;

			// store the correct value (answer) in hiddenDigits
			hiddenDigits[i][2] = digitGrid[randRowIndex][randColIndex]
					.getValue();

			// hide the Digit object in digitGrid
			digitGrid[randRowIndex][randColIndex].setVisible(false);
		}

		// ascending exchange sort, first by row and then by column; ignores
		// answer
		// effectively treats each tuple as a two-digit number
		// the first digit is the row and the second digit is the column
		// e.g. [2, 1, 9], [0, 1, 7], [0, 2, 8] sorts into [0, 1, 7], [0, 2, 8],
		// [2, 1, 9]
		int[] temp;
		for (int i = 0; i < hiddenDigits.length - 1; i++) {
			for (int j = i + 1; j < hiddenDigits.length; j++) {
				if (hiddenDigits[i][0] > hiddenDigits[j][0]) {
					temp = hiddenDigits[i];
					hiddenDigits[i] = hiddenDigits[j];
					hiddenDigits[j] = temp;
				} else if (hiddenDigits[i][0] == hiddenDigits[j][0]
						&& hiddenDigits[i][1] > hiddenDigits[j][1]) {
					temp = hiddenDigits[i];
					hiddenDigits[i] = hiddenDigits[j];
					hiddenDigits[j] = temp;
				}
			}
		}
	}

	/**
	 * Attempts to fill an empty slot with a number.
	 * 
	 * @param index
	 *            the index of the empty slot to fill
	 * @param number
	 *            the number to input
	 * 
	 * @return whether the number is correct, as a boolean
	 */
	public boolean fill(int index, int number) {
		// if: the answer value stored in hiddenDigits at the given index is
		// equal to the input
		// then: make the Digit at the correct location in digitGrid visible
		// return true since the number was correct
		if (hiddenDigits[index][2] == number) {
			int numRow = hiddenDigits[index][0];
			int numCol = hiddenDigits[index][1];
			digitGrid[numRow][numCol].setVisible(true);
			return true;
		} else
			// if the input is not equal to the correct answer
			return false; // return false since the number was not correct

	}

	/**
	 * Returns the correct answers.
	 * 
	 * @return an int array of answers
	 */
	public int[] getAnswers() {
		int[] answers = new int[hiddenDigits.length]; // create empty integer
														// array
		// for each answer stored in hiddenDigits:
		// - set the next empty slot in the answers array equal to that answer
		for (int i = 0; i < hiddenDigits.length; i++)
			answers[i] = hiddenDigits[i][2];
		return answers;
	}

	/**
	 * Returns the digit at the specified location on the digitGrid.
	 * 
	 * @param row
	 *            the row of the digit
	 * @param col
	 *            the column of the digit
	 * @return the Digit object at the specified row and column
	 */
	public Digit getDigit(int row, int col) {
		return digitGrid[row][col];
	}

	/**
	 * Returns the Digits in a specified row of digitGrid.
	 * 
	 * @param index
	 *            the index of the row
	 * @return a Digit array containing each Digit in the specified row
	 */
	public Digit[] getRow(int index) {
		return digitGrid[index];
	}

	/**
	 * Returns the Digits in a specified column of alignedDigitGrid.
	 * 
	 * @param index
	 *            the index of the column
	 * @return a Digit array containing each Digit in the specified column
	 */
	public Digit[] getCol(int index) {
		Digit[] column = new Digit[alignedDigitGrid.length]; // create empty
																// integer array
		// for each digit at the specified column index of alignedDigitGrid:
		// - set the next empty slot in the column array equal to that answer
		for (int i = 0; i < alignedDigitGrid.length; i++)
			column[i] = alignedDigitGrid[i][index];
		return column;
	}

	// debug
	public void printDigitGrid() {
		System.out.println("digitGrid");
		String text = "";
		for (Digit[] row : digitGrid) {

			for (Digit col : row) {

				text += (int) col.getValue() + " ";
			}
			text += "\n";
		}
		System.out.print(text);
		System.out.println("Length: " + getDigitGridLength());
	}

	public void setNumVariables(int numVariables) {
		super.setNumVariables(numVariables);
		clearVariables(); // remove current variables
		addVariables(); // re-add variables using new value of numVariables
	}
	
	// remove all variables (sets the isVisible property of all Digits to true)
	public void clearVariables() {
		for (int i = 0; i < digitGrid.length; i++)
			for (int j = 0; j < digitGrid[i].length; j++)
				digitGrid[i][j].setVisible(true);
	}
}
