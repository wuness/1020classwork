import java.util.Scanner; 

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		//constants
		final int BMI_US_FACTOR = 703; //factor formula in pounds
		// Variables
		double weight = 0; // The user's weight
		double height = 0; // The user's height
		double bmi = 0; // The user's BMI

		// Create a Scanner object for scanning  input from keyboard 
		// ADD CODE name object variable input 

		// Tell the user what the program will do.
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate your " + "body mass index, or BMI.");
		 
		// Get the user's weight.
		System.out.println("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
	    weight = input.nextDouble();
		// Get the user's height.
		System.out.println("Enter your height, in inches: ");
		// ADD CODE input next double for height
		height = input.nextDouble();
		// Calculate the user's body mass index.
		bmi = weight * BMI_US_FACTOR / (height * height);

		// Display the user's BMI.
		System.out.printf("Your body mass index (BMI) is %f", bmi);

		if (bmi <= 18.4)
			System.out.println(", You are underweight.");
		else if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println(", You are a normal weight.");
		else if (bmi >= 25.0 && bmi <= 39.9)
			System.out.println(", You are overweight.");
		else 
			System.out.println(", You are obese.");

	}
}