/* 
 * Programmer:Jeffrey Meng
 * Date: 8/31/17
 * Purpose: Get from the user their daily commute distance, and how much gas they purchase every workweek.
 * 		
 */
package inputAndVariable;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter how many miles you drive one way to work each day:");
		int miles = in.nextInt();
		System.out.println("Enter how many gallons of gas you buy each five day week:");
		float gas = in.nextFloat();
		
		System.out.println("Your mileage is " + miles * 10 / gas + " miles per gallon.");
		
		in.close();
	}

}
