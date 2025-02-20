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
	// Naming student 1
	
	String studentName2 = "Memory Leak";
	String lastName2 = "Leak";
	// Naming student 2

	System.out.println(studentName1.charAt(0) + "." + (lastName1.charAt(0) + ". " + (studentName1)));
	//Student 1 initials
	
	System.out.println(studentName2.charAt(0) + "." + (lastName2.charAt(0) + ". " + (studentName2)));
	//Student 2 initials
	
	System.out.println("Names in alphabetical order by last name:");
	if ((studentName1.compareToIgnoreCase(lastName2))>(lastName2.compareToIgnoreCase(lastName1)))
		System.out.println(studentName2);
	else if ((studentName1.compareToIgnoreCase(lastName2))<(lastName2.compareToIgnoreCase(lastName1)));
		System.out.println(studentName1);
	
	
	

	}

}
