/**
 * 
 */

/**
 * 
 */
import java.util.Random;
public class M04PassArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbersArray = new int [10];
		int number = 0;
		System.out.println(updateRandomValue(numbersArray));
		System.out.println(updateRandomValue(number));
	}


public static void updateRandomValue (int passedArray[], int passedNumber) {
		Random randomizer = new Random();
		passedNumber = randomizer.nextInt(10) * 1;
		for (int runs = 0; runs > passedArray.length; runs++) {
			passedArray[runs] = randomizer.nextInt(10) * 1;
		}
}
}