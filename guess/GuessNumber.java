/**
 * This program takes user input to see if they can guess the 
 * random number generated
 */

import java.util.Scanner; 

public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Main method
	    int number = (int)(Math.random() * ((Math.pow(10, 2)+1)));

	    Scanner input = new Scanner(System.in);
	    System.out.println("Guess a magic number between 0 and 100");

	    int guess = -1;
	    while (guess != number) {
	      
	      System.out.print("\nEnter your guess: ");
	      guess = input.nextInt();
	      
	      if (guess < 0 && guess > 100);
	        System.out.println("Your guess is out of the boundary 0-100");

	      if (guess == number)
	        System.out.println("Yes, the number is " + number);
	      else if (guess > number)
	        System.out.println("Your guess is too high");
	      else
	        System.out.println("Your guess is too low");
	      
	      
	      input.close();
	    } 
		
	}

}
