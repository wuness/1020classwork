/**
 * 
 */
package login;

import java.util.Scanner;

/**
 * 
 */
public class GEO3 {

	/**
	 * @param args
	 */
	public static int sum(int maxNumber) {
		
		maxNumber = 5;
		int loopCounter = 1;
		int result = 0;
		
	while (loopCounter <= maxNumber) {
		result = result + loopCounter;
		

	
		// TODO Auto-generated method stub
		
		

	}
	return result;
}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int number = input.nextInt();
		
		int totalSum = sum(number);
	}
}


