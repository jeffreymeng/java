/*
 * Programmer: Jeffrey Meng
 * Date: Jan 22, 2018
 * Purpose:
 */

package utils;

//https://docs.oracle.com/javase/tutorial/java/generics/types.html
public class ValueChangeConfirmation<Type> {
	private boolean success;
	private Type currentValue, requestedValue;
	private Type oldValue;
	private String errorCode, errorMessage, type;
	private int errorId;

	public ValueChangeConfirmation() {
		this.success = true;
		this.errorCode = "[SUCCESS]";
		this.errorMessage = "[SUCCESS]";
		this.type = "[UNKNOWN]";
		this.errorId = -1;
	}
	
	public ValueChangeConfirmation(boolean success, Type oldValue, Type requestedValue, Type currentValue, String errorCode, String errorMessage, String type, int errorId) {
		this.success = success;
		this.oldValue = oldValue;
	//TODO
		this.errorCode = "[SUCCESS]";
		this.errorMessage = "[SUCCESS]";
		this.type = "[UNKNOWN]";
		this.errorId = -1;
	}

	public boolean success() {
		return success;
	}

	public String errorCode() {

		return errorCode;

	}

	public Type currentValue() {
		return currentValue;
	}

	public Type requestedValue() {
		return requestedValue;
	}

	public Type oldValue() {
		return oldValue;
	}

	public String errorMessage() {
		if (success) {
			return "SUCCESS";
		} else {
			return errorMessage;
		}
	}

	public String type() {
		return type;
	}

	public int errorId() {

		return errorId;

	}

}
