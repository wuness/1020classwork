import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;


public class Athlete2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner valuein = new Scanner(System.in);
	System.out.println("Enter number of athletes:");
	int athleteQuant = positiveInput(valuein.nextInt());
	
	// Initializing input for users to input information
	
	Athlete[] athletes = new Athlete [athleteQuant];
	Gym gym = new Gym("Elite Fitness", athleteQuant);
	
	// Initializing gym object and athlete array
	
	for (int runs = 0; runs < athletes.length; runs++) {
		System.out.println("Enter information for athlete " + (runs + 1));
		
		
		System.out.println("Enter athlete first name ");
		String firstName = valuein.next();
		
		System.out.println("Enter athlete last name ");
		String lastName = valuein.next();
		
		// Input first and last name

		System.out.println("Enter weight for athlete " + (runs + 1) + " (in lbs)");
		double weight = positiveInput(valuein.nextDouble());

		System.out.println("Enter height for athlete " + (runs + 1) + "(in inches)");
		double height = positiveInput(valuein.nextDouble());

		System.out.println("Enter age for athlete " + (runs + 1) + "");
		int age = positiveInput(valuein.nextInt());
		
		// Enter age, height, and weight
		
	
		
		athletes[runs] = new Athlete( firstName, lastName, weight, height, age);
		athletes[runs].setAge();

		System.out.println("Enter calories burned for everyday of the week");
		for (int day = 0; day < 7; day++) {
			double calBurn = positiveInput(valuein.nextDouble());
			athletes[runs].inCal(day, calBurn);

		}
		gym.addAthletes(athletes[runs]);
	}
	
	// Storing data for athletes then adding them to gym
	
	gym.displayAthleteSummaries();
	File writefile = new File ("C:\\Users\\skhei\\Downloads\\github\\1020classwork\\Module02\\fym\\gym2");
	PrintWriter write = new PrintWriter (writefile);
	gym.saveReportToFile(write); 
	System.out.println("Printing summaries: C:\\Users\\skhei\\Downloads\\github\\1020classwork\\Module02\\fym\\gym2");
	write.close();
	}
	
	// Displaying both athlete summmaries to console, and saving the report to file
	


	
	public static int positiveInput (int validinput) {
		
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
	
	// Verifies positive int
	
	public static double positiveInput (double validinput) {
		
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
	
	// Verifies positive double

}

class Athlete {
private double weight;
private double height;
private int age;
private double[] calories;
private String firstName;
private String lastName;

// Constructing athlete class

	public Athlete(String firstName, String lastName, double weight, double height, int age) {
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
	
	public int getAge (int age) {
		return age;
	}
	
// Method to store get age
	
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
	
	public void setAge () {
	if (age > 0)
		this.age = age;
		else {
			System.out.println("Invalid age value");
		}
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
	 
	 public void saveReportToFile(PrintWriter output) {
		 for (int runs = 0; runs < numAthletes; runs++) {
			 athletes[runs].athleteSummary(runs);
		   output.println("Summary of Athlete " + (runs + 1));
		   output.println("Name: " + athletes[runs].getFirstName() + " " + athletes[runs].getLastName());
		   output.println("BMI: " + athletes[runs].getBMI());
		   output.println("Max Heart Rate: " + athletes[runs].getMaxHeart((athletes[runs]).getAge(age)));
		   output.println("Average Calories: " + athletes[runs].avgCal());
		    }
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
			 
			 if (athletes[runs].getBMI() < 18.5) {
				 System.out.println("Athletes underweight: " + "Athlete " + (runs + 1));
			 }
		 }
	 }
			 
	public void fileIn (String fileRead) {
		
	
		File inputFile = new File ("C:/Users//skhei/Downloads/github/1020classwork/Module02/fym/gym.txt");
		Scanner file = new Scanner(inputFile);
		while (file.hasNextLine()) {
		 String firstName = file.next();
		 String lastName = file.next();
		 double weight = file.nextDouble();
		 double height = file.nextDouble();
		 int age = file.nextInt();
		 int [] calories = new int [7];
		 for (int runs = 0; runs < calories.length; runs++) {
			 calories[runs] = file.nextInt();
			Gym.addAthletes(new Athlete(firstName, lastName, weight, height, age));
		 }
	 }
		file.close();
	 }
	}



