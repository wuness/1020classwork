import java.util.Scanner;

public class methodAthlete {

public static void main (String[] args) {
System.out.println("Enter number of athletes: ");
int athleteQuant = positiveInt();
int [] athlete = new int [athleteQuant];

// Declaring array of athletes and prompting user to enter quantity

int age = 0;
double weight = 0;
double height = 0;
double highestAthlete = 0;
int highestAthletePlace = -1;

// Variables of data to include in each athlete


for (int runs = 0; runs < athlete.length; runs++) {

System.out.println("Enter age of athlete: ");
age = positiveInt();

System.out.println("Enter weight of athlete: ");
weight = positiveDouble();

System.out.println("Enter height of athlete");
height = positiveDouble();

// Entering height, weight, and age for each athlete

double [] calories = new double [7];

// array for calories - size of 7 days for a week

System.out.println("Enter calories burned for each day of the week");

for (int days = 0; days < calories.length; days++) {
System.out.println("Enter calories burned on day " + (days + 1) + ":");
calories[days] = positiveDouble();

}

// Prompt to input calories for each day

if (avgCalories(calories) > highestAthlete)
highestAthlete = avgCalories(calories);
highestAthletePlace = runs;

printSummary(height, weight, age, calories);

}

System.out.println("The athlete with the highest avg calories burned is: " + highestAthletePlace);

}

// print out summary of each athlete and the top athlete



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

// Method prompting the user to enter a positive integer value

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

// Method prompting the user to enter a valid positive double value

public static int getMaxHeart (int age) {
	int heartRate = 220-age;
	return heartRate;
	
}

// method to get the max heart rate of each athlete

public static int avgCalories (double calories[]) {
int avg = 0;
int sum = 0;

for (int days = 0; days < calories.length; days++) {
sum += calories[days];
	
}
avg = sum/calories.length;
return avg;
}

// method to add up all burned calories within array and avg the total

public static double getBMI (double height, double weight){
	
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

// get the BMI value and the according weight category for each athlete

public static void printSummary (double height, double weight, int age, double[] calories) {
	System.out.println("Athlete summary: ");
	getBMI(height, weight);
	System.out.println("The max heart rate of athlete is: " + getMaxHeart(age));
	System.out.println("The average weekly calories burned by athlete is: " + avgCalories(calories));;
}

// Method to print out the BMI, avg calories burned, and the max heart rate in main



}