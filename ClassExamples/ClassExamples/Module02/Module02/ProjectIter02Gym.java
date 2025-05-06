import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Main class
public class ProjectIter02Gym
{
	public static void main(String[] args)
	{
		int MAX_GYM_MEMBERS = 3;
		
		Gym gym1 = new Gym("Elite Fitness", MAX_GYM_MEMBERS);

		try
		{
			readGymAthletesInfoFromFile("gym1.txt", gym1);
			gym1.displayAthleteSummaries();
			gym1.saveReportToFile();
			
		} catch (FileNotFoundException e)
		{
			System.out.println("Error: File not found.");
		}
		
		Gym gym2 = new Gym("Work in Progress", MAX_GYM_MEMBERS);

		try
		{
			readGymAthletesInfoFromFile("gym2.txt", gym2);
			gym2.displayAthleteSummaries();
			gym2.saveReportToFile();
			
		} catch (FileNotFoundException e)
		{
			System.out.println("Error: File not found.");
		}

	}

	/**
	 * 
	 */
	public static void readGymAthletesInfoFromFile(String filename, Gym currentGym) throws FileNotFoundException
	{
		
		
		Scanner fileScanner = null;
		try
		{

			fileScanner = new Scanner(new File(filename));

			//Add code to read from file


		} finally
		{
			if (fileScanner != null)
			{
				fileScanner.close();
			}
		}
	}// end add athletes

}



// Athlete class

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

	public void inCal(int day, double calBurn) {
		if (day >= 0 && day <= 7) {
			calories[day] = calBurn;
		}
	}

// Method to store calories burned per day within athlete object

	public int getAge(int age) {
		return age;
	}

// Method to store get age

	public double avgCal() {
		double sum = 0;
		double avg = 0;
		for (int runs = 0; runs < calories.length; runs++) {
			sum += calories[runs];
		}
		avg = sum / calories.length;
		double avground = Math.round(avg * Math.pow(10, 2)) / Math.pow(10, 2);
		System.out.println("Athlete's average calories burned: " + avground);
		return avground;
	}

// Method to sum the calories for the week, then average them

	public double getBMI() {

		double BMI = 730 * (weight / Math.pow(height, 2));
		double roundBMI = Math.round(BMI * Math.pow(10, 1)) / Math.pow(10, 1);
		if (roundBMI < 18.5) {
			System.out.println("Athlete is underweight with a BMI of " + roundBMI);
		} else if (roundBMI < 25) {
			System.out.println("Athlete is a normal weight with a BMI of " + roundBMI);
		} else if (roundBMI < 30) {
			System.out.println("Athlete is overweight with a BMI of " + roundBMI);
		} else {
			System.out.println("Athlete is obese with a BMI of " + roundBMI);
		}

		return BMI;
	}

// Method to calculate BMI

	public static int getMaxHeart(int age) {
		int heartRate = 220 - age;
		System.out.println("The max heart rate is: " + heartRate);
		return heartRate;
	}

// Method to calculate max heart rate

	public String getLastName() {
		System.out.println("Last name: " + lastName);
		return lastName;
	}

// Method to get last name

	public String getFirstName() {
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

// Gym Class
	
	class Gym {
		
		private String name;
		private int athleteQuant;
		private Athlete[] athletes;
		 
			 public Gym (String name, int athletes) {
				 this.name = name;
				 this.athleteQuant = 0;
				 this.athletes = new Athlete[athletes];
			 }
			 
			 // Initializing instance variables and constructing gym
			 
			 public void addAthletes(Athlete athlete) {

					if (athleteQuant < this.athletes.length) {
						this.athletes[athleteQuant] = athlete;
						athleteQuant++;
					}
					else {
					System.out.println("Gym is full. Can't add " + athlete.getFirstName() + "" + athlete.getLastName());
					}
				}
			 
			 // Adding athlete members to gym
			
				
			 public void displayAthleteSummaries() {
				 for (int runs = 0; runs < athleteQuant; runs++) {
					 athletes[runs].athleteSummary(runs);
				 }
				 findTopAthlete();
				 displayUnderweight();
			 }
			 
			 // Displaying athlete summaries to console
			 
			 public void saveReportToFile(PrintWriter output) {
				 for (int runs = 0; runs < athleteQuant; runs++) {
					 athletes[runs].athleteSummary(runs);
				   output.println("Summary of Athlete " + (runs + 1));
				   output.println("Name: " + athletes[runs].getFirstName() + " " + athletes[runs].getLastName());
				   output.println("BMI: " + athletes[runs].getBMI());
				   output.println("Max Heart Rate: " + athletes[runs].getMaxHeart(athletes[runs].getAge());
				   output.println("Average Calories: " + athletes[runs].avgCal());
				    }
				 }
			 
			 // Writing athlete summaries to a file
			 
			 private int findTopAthlete() {
				int index = 0;
				double highest = 0;
				for (int runs = 0; runs < athleteQuant; runs++) {
				double avg = athletes[runs].avgCal();	
				if (avg > highest) {
					highest = avg;
					index = runs;
				}
				}
				System.out.println("Athlete " + (index + 1) + "is the athlete with the highest calories burned.");
				return index;
			 }
			 
			 // Finding athlete with the highest calories burned
			 
			 private void displayUnderweight () {
				 for (int runs = 0; runs < athleteQuant; runs++) {
					 
					 if (athletes[runs].getBMI() < 18.5) {
						 System.out.println("Athletes underweight: " + "Athlete " + (runs + 1));
					 }
				 }
			 }
			 
			 // Display all underweight athletes
					 
			public void readGymAthletesInfoFromFile (String fileRead) {
				
			
				File inputFile = new File ("C:/Users//skhei/Downloads/github/1020classwork/Module02/fym/gym.txt");
				Scanner file = new Scanner(inputFile);
				int quant = 0;
				while (file.hasNextLine()) {
				 String firstName = file.next();
				 String lastName = file.next();
				 double weight = file.nextDouble();
				 double height = file.nextDouble();
				 int age = file.nextInt();
				 int [] calories = new int [7];
				 for (int runs = 0; runs < calories.length; runs++) {
					 calories[runs] = file.nextInt();
				quant++;
				if (quant < MAX_GYM_MEMBERS) {
					new Athlete(firstName, lastName, weight, height, age));
				 }
				else {
					System.out.println("Unable to add athle, gym is at capacity.");
				}
			 }
				file.close();
			 }
			}
	
			// Read data from a file
