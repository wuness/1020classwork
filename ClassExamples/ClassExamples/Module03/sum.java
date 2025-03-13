
import java.util.Scanner;

public class sum 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum = 0;
		int inSum = 0;
		int value = 0;
		int sum = 0;
		final int max = 100;
		final int min = 1;
		// Declaring public variables/constants
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value 1-100");
		value = numIn(input);
		sum = numAdd(value);
		
		input.close();
	}
	
	public static int numIn(Scanner input2)
	{
		Scanner input = new Scanner(System.in);
		int firstNum = 0;
		firstNum = input.nextInt();
	while (firstNum > min && firstNum < max)
	{
		System.out.println("Invalid number, enter a number 1-100");
		firstNum = input.nextInt();
	}			
		return firstNum;
	}//end calculateSum

	public static int numAdd(int firstNum)
	{
		int inSum = 1;
		int addi = 1;
		
		for (addi = 1; addi <= firstNum; addi++);
		{
			inSum = inSum + addi;
		}
	return inSum;
	
}
}