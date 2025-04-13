
public class TopAthlete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int[] athlete = {100,200,300,400,500};
		
		printContents(athlete);
		
		maxValue(athlete);
		
		minValue(athlete);
		
		total(athlete);
	}


	public static int printContents (int[] athlete) {
		
		for (int runs = 0; runs < athlete.length; runs++)
		System.out.println(athlete[runs]);
	
	return athlete[0];
	
	}
	
	public static int maxValue (int[] athlete) {
		int maxV = athlete[0];
		int index = 0;
		for (int runs = 0; runs < athlete.length; runs++)
		if (athlete[runs] > maxV) {
			maxV = athlete[runs];
			index = runs; }
	System.out.println("Max Value " + maxV + "Index: " + index);
	return athlete[0];
}
	
	public static int minValue (int[] athlete) {
		int minV = athlete[0];
		for (int runs = 0; runs < athlete.length; runs++)
		if (athlete[runs] < athlete[0])
			minV = athlete[runs];
			System.out.println("Min Value " + minV);
	return athlete[0];
}
	
	public static int total (int[] athlete) {
	int sum = 0;
	for (int runs = 0; runs < athlete.length; runs++)
	sum += athlete[runs];
	System.out.println("Sum of values: " + sum);
	return athlete[0];
	}
}
 
	