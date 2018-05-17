/*
 * Programmer: Jeffrey Meng
 * Date: Jan 12, 2018
 * Purpose:
 */

package cardGame;

public class DisplayCards {
	
	public DisplayCards() {
		
	}
	
	public void showCard(boolean black) {
		String color = "BLACK";
		if (!black) color = " RED ";
		System.out.println("┌-------------┐");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|    " + color + "    |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("└-------------┘");
	}
	public void showCardArr(boolean[] black) {
		String[] color = new String[black.length];
		for (int i = 0; i < black.length; i ++) {
			if (black[i]) {
				color[i] = "BLACK";
			} else {
				color[i] = " RED ";
			}
		}
		
		System.out.println("┌-------------┐		┌-------------┐		┌-------------┐		┌-------------┐");
		System.out.println("|             |		|             |		|             |		|             |");
		System.out.println("|             |		|             |		|             |		|             |");
		System.out.println("|             |		|             |		|             |		|             |");
		System.out.println("|             |		|             |		|             |		|             |");
		System.out.println("|    " + color[0] + "    |		|    " + color[1] + "    |		|    " + color[2] + "    |		|    " + color[3] + "    |");
		System.out.println("|             |		|             |		|             |		|             |");
		System.out.println("|             |		|             |		|             |		|             |");
		System.out.println("|             |		|             |		|             |		|             |");
		System.out.println("|             |		|             |		|             |		|             |");
		System.out.println("└-------------┘		└-------------┘		└-------------┘		└-------------┘");
	}
}
