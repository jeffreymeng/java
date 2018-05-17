/*
 * Programmer: Jeffrey Meng
 * Date: Jan 12, 2018
 * Purpose:
 */

package cardGame;

public class Flip {
	public Flip() {

	}
	//returns whether the card is black or not. (True if black, false if red).
	//should probably be static but requirements require instantiated.
	public boolean turnOverCard() {
		return ((1 + (int)(Math.random() * ((2 - 1) + 1))) == 1);

	};
}
