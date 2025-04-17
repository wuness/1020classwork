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
		
	System.out.println("Enter weight for athlete " + (runs + 1) + " (in lbs)");
	double weight = positiveDouble();
	
	System.out.println("Enter height for athlete " + (runs + 1) + "(in inches)");
	double height = positiveDouble();
	
	System.out.println("Enter age for athlete " + (runs + 1) + "");
	int age = positiveInt();
	
	System.out.println("Enter calories for athlete " + (runs + 1) + "");
	int calories = positiveInt();
	
	athlete[runs] = new Athlete (weight, height, age);
	}
	
	for (int athl = 0; athl < athletes.length; athl++) {
	athlete[athl].athleteSummary(athl);
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
	public static int getMaxHeart (int age) {
		int heartRate = 220-age;
		System.out.println("The max heart rate is: " + heartRate);
		return heartRate;
		
	}
		public static double getBMI (double height, double weight){
		
		double BMI = 730*(weight/Math.pow(height, 2));
		double roundBMI = Math.round(BMI*Math.pow(10,2))/Math.pow(10,2);
		if (roundBMI < 18.5) {
			System.out.println("Athlete is underweight with a BMI of " + roundBMI);
		}
		else if (roundBMI < 25) {
			System.out.println("Athlete is a normal weight with a BMI of " + roundBMI);
		}
		else if (roundBMI < 30) {
		System.out.println("Athlete is overweight with a BMI of " + roundBMI);
		} else {
			System.out.println("Athlete is obese with a BMI of " + roundBMI);
		}
		
	return BMI;
}


public static class Athlete {
	
private double weight;
private double height;
private int age;
private double[] calories;

public Athlete(double weight, double height, int age) {
	
this.weight = weight;
this.height = height;
this.age = age;
double[] calories = new double [7];
}

public void athleteSummary(int athlete) {
System.out.println("Summary of Athlete " + athlete);
double BMI = getBMI(height, weight);
int maxHeart = getMaxHeart(age);
}


}
}





	


	
	

	