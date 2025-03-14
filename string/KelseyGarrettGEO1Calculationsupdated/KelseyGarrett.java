package KelseyGarrettGEO1Calculationsupdated;

import java.util.Scanner;
// where to pull from
/**
 * 
 */
public class KelseyGarrett {
public static double  participation  = .10;
public static double guided = .20;
public static double quiz = .25;
public static double iteration = .25;
public static double ftest = .20;

// grade weight constants
	
	public static void main(String[] args) 	
	{
		
		System.out.println("- CS 1050 Grade Calculator -\n"
				+ "Grade Weights:\n"
				+ "Class Participation: " + participation + "\n"
				+ "Guided Explorations: " + guided + "\n"// line 1
				+ "Quizes: " + quiz +"\n"
				+ "Project Iteration: " + iteration + "\n"
				+ "Final Exam: " + ftest + "\n");
		// introductory paragraphs
		
		
		String rerun;
		
		Scanner input1 = new Scanner(System.in);
		
		// Imported scanner and rerun string
		
		
		do {
		System.out.println("Enter Participation Grade: \n");
		double participation1 = validGrade((input1.nextDouble()*participation));
		System.out.println("Enter Quiz Grade: \n");
		double quiz1 = validGrade((input1.nextDouble()*quiz));
		System.out.println("Enter Guided Grade: \n");
		double guided1 = validGrade((input1.nextDouble()*guided));
		System.out.println("Enter Iteration Grade: \n");
		double iteration1 = validGrade((input1.nextDouble()*iteration));
		System.out.println("Enter Final Exam Grade: \n");
		double ftest1 = validGrade((input1.nextDouble()*ftest));
		
		
		double finalcalc = ((ftest1)+(iteration1)+(guided1)+(quiz1)+(participation1));
		System.out.println(finalcalc + " is your final grade percentage.\n");
		System.out.println(letterGrade(finalcalc) + " is your final letter grade.\n");
		
		// Grade validity check and letter conversion
		
		System.out.println("Would you like to calculate another grade? (YES/NO)\n");
		rerun = input1.next();
		} while (rerun.equalsIgnoreCase("YES"));
	}
		// end of loop or restart


			
	
	public static double validGrade (double gradeV) {
		double cGrade = gradeV;
		
		if (gradeV > 105 || gradeV < 0) {
		System.out.println("Invalid Entry.");
		cGrade = -1; }
		else if (cGrade >= 0 && cGrade <= 105) {
		System.out.println("Valid Entry."); }
		return cGrade;
	}
		// grade validity check




		
	
	public static char letterGrade (double finalG) {
		
	char letter = ' ';
	
	if (finalG >= 90 && finalG <= 105) {
		letter = 'A';
	} else if (finalG >= 80 && finalG <= 89) { 
		letter = 'B';
	} else if (finalG >= 60 && finalG <= 69) {
		letter = 'D';
	} else if (finalG >= 70 && finalG <= 79) {
		letter = 'C';
	} else if (finalG <= 59)	{
		letter = 'F'; 
	}
	{
	return letter;
	}
	// letter conversion
}
}
		
		
		
