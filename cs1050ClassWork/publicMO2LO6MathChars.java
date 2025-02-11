/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class publicMO2LO6MathChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double exponentResult=Math.pow(10, 2);
		System.out.println("result = " + exponentResult);
		
		double randomDouble= Math.random();
		int randomint=(int)randomDouble;
		
		randomint=(int)(randomDouble * 10);
		randomint=(int)(randomDouble * 10 + 1);
		
		char middleInitial = 'M';
		// when declaring char use single quotes
		int charInValue = 1;
		System.out.println(middleInitial);
		int charIntValue = (int)middleInitial;
		System.out.println(charIntValue);
		
		// Assigns the character 4 to numCharacter
		System.out.println("enter a char");
		Scanner input = new Scanner(System.in);
		char someChar = input.next().charAt(0);
		System.out.println("A char has been entered in a Ascii value " + someChar);
		
		//String myName = "Garrett";
		// string use second capital due to it not being primitive data type
		
		//String studentName = "Silly Willy";
		//String studentName1 = new String ("Willy Nilly");
		//String firstName = "Willy";
		
		String firstName = "Willy";
		String lastName = "Nilly";
		String middleName = "N";
		String fullName = (firstName + middleName + lastName);
		String lowerCaseFullName = firstName.toLowerCase();
		
		System.out.println(lowerCaseFullName);
		
		int lengthOfString = firstName.length();
		System.out.println(lengthOfString);
		System.out.println("the third letter of your name is: " + fullName.charAt(0));
		
	}

}

