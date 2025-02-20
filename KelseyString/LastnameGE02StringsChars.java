/**
 * 
 */

/**
 * 
 */
public class LastnameGE02StringsChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String studentName1 = "Stack Terror";
	String lastName1 = "Terror";
	char lastInitial1 = 'S';
	char firstInitial1 = 'T';
	int nameLength1 = studentName1.length();
	// Naming student 1
	
	String studentName2 = "Memory Leak";
	String lastName2 = "Leak";
	char lastInitial2 = 'L';
	char firstInitial2 = 'M';
	int nameLength2 = studentName1.length();
	// Naming student 2

	System.out.println(studentName1.charAt(0) + "." + (lastName1.charAt(0) + ". " + (studentName1) + " (" + (nameLength1) + " 	characters long)"));
	//Student 1 initials
	
	System.out.println(studentName2.charAt(0) + "." + (lastName2.charAt(0) + ". " + (studentName2) + " (" + (nameLength2) + " characters long)"));
	//Student 2 initials
	
	System.out.println("Names in alphabetical order by last name:");
	if ((studentName1.compareToIgnoreCase(lastName2))>(lastName2.compareToIgnoreCase(lastName1)))
		System.out.println(studentName2);
	else if ((studentName1.compareToIgnoreCase(lastName2))<(lastName2.compareToIgnoreCase(lastName1)));
		System.out.println(studentName1);
	
	
	switch (WeekDay) {

	case 1 {
		System.out.println("Today is Sunday")
	break;
	}
	case 2 {
		System.out.println("Today is Saturday");
	break;
	}
	default {
		System.out.println("Today is not the weekend.")
	break;
	}

	// Switch day of week
	}
	
	String weekEndSat = "Saturday";
	String weekEndSun = "Sunday";		
	
	if (weekEndSat || weekEndSun)
		System.out.println("It's the weekend");
	
	
	// Switch day of week

	}

}
