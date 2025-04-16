import java.util.Scanner;
public class TopAthlete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Scanner valuein = new Scanner(System.in);
	
	System.out.println("Enter number of athletes:");
	int athleteQuant = positiveInt();
	int[] athletes = new int [athleteQuant];
	Athlete[] athlete = new Athlete[athleteQuant];
	
	for (int runs = 0; runs < athletes.length; runs ++) {
		
	System.out.println("Enter weight for athlete " + runs);
	double weight = positiveDouble();
	
	System.out.println("Enter height for athlete " + runs);
	double height = positiveDouble();
	
	System.out.println("Enter age for athlete " + runs);
	int age = positiveInt();
	
	System.out.println("Enter calories for athlete " + runs);
	int calories = positiveInt();
	
	athlete[runs] = new Athlete (weight, height, age, calories);
	
	}
	}


	public static int positiveInt () {
	
	Scanner valuein = new Scanner(System.in);
	int value = 0;
	
	do {
	
	if (!valuein.hasNextInt()) {
	System.out.println("Invalid entry, enter a whole number");
	valuein.nextInt(); }
	value = valuein.nextInt();
		if (value < 0) {
			System.out.println("Invalid entry, enter a positive number"); }
	}
	while (value < 0); 
	System.out.println("Entry accepted");
	
	return value;
	
	}
	
	public static double positiveDouble () {
		
		Scanner valuein = new Scanner(System.in);
		double value = 0;
		
		do {
		
		if (!valuein.hasNextDouble()) {
		System.out.println("Invalid entry, enter a whole number");
		valuein.nextDouble(); }
		value = valuein.nextDouble();
			if (value < 0) {
				System.out.println("Invalid entry, enter a positive number"); }
		}
		while (value < 0); 
		System.out.println("Entry accepted");
		
		return value;
		
		}
	public static int getMaxHeart (int athletes) {
		for (int runs = 0; runs < athletes.length; runs++);
		
	}
	
}

class Athlete {
public Athlete(double weight, double height, int age, double calories) {
	
weight = 0;
height = 0;
age = 0;
calories = 0;

}

}



	


	
	

	