/*
 *  Name: [Garrett Kelsey]
 *  Class: CS1050 (T/TH)
 *  Description: Guided Exploration 01 
 *  This program will print a couple paragraphs about my passions and interests.       
 *  The program will store and display my age and my aged squared. 
 */

package KelseyGarrettGEO1Calculations;

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
		// introductory paragraph
		
		double participation2 = ((double)(80*participation));
		double quiz2 = ((double)(90*quiz));
		double guided2 = ((double)(70*guided));
		double iteration2 = ((double)(85*iteration));
		double ftest2 = ((double)(60*ftest));
		double finalg = ((participation2)+(quiz2)+(guided2)+(iteration2)+(ftest2));
		// individual weighted final grades
				
		System.out.println("Final Grade:");
		System.out.println((finalg));
		// final grade actual
		
	if (finalg >= 70 && finalg <= 79) {
		System.out.println("Letter grade: C");
		
	} else if (finalg >= 80 &&  finalg <= 89) {
		System.out.println("Letter grade: B");
	}
	else if (finalg >= 90 && finalg <= 100)	  {
		System.out.println("Letter grade: A");
	}
	else if (finalg >= 60 && finalg <= 69)	{
		System.out.println("Letter Grade: D");
	}
	else if (finalg <= 59) {
		System.out.println("Letter Grade: F");
		// final grade letter
	}
	}
		
		// MAIN
		// GEO01
		
		
				
			
		}
		
		

		
		
		
	

