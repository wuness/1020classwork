import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;


public class Athlete2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner valuein = new Scanner(System.in);
	System.out.println("Enter number of athletes:");
	int athleteQuant = positiveInt();
	Athlete[] athletes = new Athlete [athleteQuant];
	Gym gym = new Gym("Elite Fitness", athleteQuant);
	for (int runs = 0; runs < athletes.length; runs++) {
		System.out.println("Enter information for athlete " + (runs + 1));
		
		
		System.out.println("Enter athlete first name ");
		String firstName = valuein.next();
		
		System.out.println("Enter athlete last name ");
		String lastName = valuein.next();
		
		// Input first and last name

		System.out.println("Enter weight for athlete " + (runs + 1) + " (in lbs)");
		double weight = positiveDouble();

		System.out.println("Enter height for athlete " + (runs + 1) + "(in inches)");
		double height = positiveDouble();

		System.out.println("Enter age for athlete " + (runs + 1) + "");
		int age = positiveInt();
		
		// Enter age, height, and weight
		
		athletes[runs] = new Athlete(weight, height, age, firstName, lastName);

		System.out.println("Enter calories burned for everyday of the week");
		for (int day = 0; day < 7; day++) {
			double calBurn = positiveDouble();
			athletes[runs].inCal(day, calBurn);

		}
		gym.addAthletes(athletes[runs]);
	}
	
	gym.displayAthleteSummaries();
	PrintWriter output = new PrintWriter ("C:\\Users\\skhei\\Downloads\\github\\1020classwork\\Module02\\gymtest.txt");
	output.close();
	System.out.println("Printing summaries to: C:\\Users\\skhei\\Downloads\\github\\1020classwork\\Module02");
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
	

}

class Athlete {
private double weight;
private double height;
private int age;
private double[] calories;
private String firstName;
private String lastName;

	public Athlete(double weight, double height, int age, String firstName, String lastName) {
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.calories = new double[7];
		this.firstName = firstName;
		this.lastName = lastName;
	}

// Method to store inputted data within an athlete object

	public void inCal (int day, double calBurn) {
		if (day >= 0 && day <=7) {
			calories[day]=calBurn;
		}
	}
	
// Method to store calories burned per day within athlete object
	
	public double avgCal () {
		double sum = 0;
		double avg = 0;
		for (int runs = 0; runs < calories.length; runs++) {
		sum += calories[runs];
		}
		avg = sum/calories.length;
		double avground = Math.round(avg*Math.pow(10,2))/Math.pow(10,2);
		System.out.println("Athlete's average calories burned: " + avground);
		return avground;	
	}

// Method to sum the calories for the week, then average them
	
	public double getBMI () {
		
		double BMI = 730*(weight/Math.pow(height, 2));
		double roundBMI = Math.round(BMI*Math.pow(10,1))/Math.pow(10,1);
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

// Method to calculate BMI

	public static int getMaxHeart (int age) {
		int heartRate = 220-age;
		System.out.println("The max heart rate is: " + heartRate);
		return heartRate;
	}
	
// Method to calculate max heart rate
	
	public String getLastName() {
		System.out.println("Last name: " + lastName);
		return lastName;
	}
	
// Method to get last name
	
	public String getFirstName () {
		System.out.println("First name: " + firstName);
		return firstName;
	}
	
// Method to get first name
	
	public void athleteSummary(int athlete) {
		System.out.println("Summary of Athlete " + (athlete + 1));
		String firstName = getFirstName();
		String lastName = getLastName();
		double BMI = getBMI();
		int maxHeart = getMaxHeart(age);
		double avgCalories = avgCal();
	}
	
	public double getHeight (double height) {
		return height;
	}
	
	public double getWeight (double weight) {
		return weight;
	}
	
// Method to print the summary of athlete

}

class Gym {
	
private String name;
private int numAthletes;
private Athlete[] athletes;
 
	 public Gym (String name, int maxAthletes) {
		 this.name = name;
		 this.numAthletes = 0;
		 this.athletes = new Athlete[maxAthletes];
	 }
	 
	 public void addAthletes(Athlete athlete) {

			if (numAthletes < this.athletes.length) {
				this.athletes[numAthletes] = athlete;
				numAthletes++;
			}
			else {
			System.out.println("Gym is full. Can't add " + athlete.getFirstName() + "" + athlete.getLastName());
			}
		}
	 
	 
	 public void displayAthleteSummaries() {
		 for (int runs = 0; runs < numAthletes; runs++) {
			 athletes[runs].athleteSummary(runs);
		 }
		 findTopAthlete();
		 displayUnderweight();
	 }
	 
	 private int findTopAthlete() {
		int index = 0;
		double highest = 0;
		for (int runs = 0; runs < numAthletes; runs++) {
		double avg = athletes[runs].avgCal();	
		if (avg > highest) {
			highest = avg;
			index = runs;
		}
		}
		System.out.println("Athlete " + (index + 1) + "is the athlete with the highest calories burned.");
		return index;
	 }
	 
	 private void displayUnderweight () {
		 for (int runs = 0; runs < numAthletes; runs++) {
			 
			 if (athletes[runs].getBMI() < 18.5)
				 System.out.println("Athletes underweight: " + "Athlete " + (runs + 1));
		 }
	 }
	 }


