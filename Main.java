import java.util.Random;

public class arraysAndMethods {

	public static Random randomNum = new Random(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //initialize ages array
		
		System.out.println(ages[ages.length - 1] - ages[0]); //print the last subtracted from the first
		
		int[] ages2 = new int[ages.length + 1]; //initialize new array because arrays aren't expandable
		for (int i = 0; i < ages.length; i++) { //fill new array with contents of old array
			ages2[i] = ages[i];
		}
		ages2[ages2.length - 1] = 46; 
		
		System.out.println(ages2[ages2.length - 1] - ages2[0]); //print again to show it is dynamic
		
		double total = 0;
		for (int age : ages2) { //total all ages in the array
			total += age;	
		}
		double average = total / ages2.length; //store average age
		
		System.out.println("Average Age: " + average); //print average age
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //initialize names array
		
		double totalLetters = 0;
		for (String name : names) { //total all lengths in array
			totalLetters += name.length();
		}
		double averageLetters = totalLetters / names.length; //store average letters
		
		System.out.println("Average Letters: " + averageLetters); //print average age
		
		String combinedNames = "";
		for (String name : names) { //loop to concatenate all names together
			combinedNames = combinedNames + name + " ";
		}
		
		System.out.println("Concantenated Names: " + combinedNames); //print concatenated names
		
		int[] nameLengths = new int[names.length]; //create nameLengths array
		for (int i = 0; i < names.length; i++) { //add all lengths from names into nameLengths
			nameLengths[i] = names[i].length();
		}
		
		int sumLengths = 0;
		for (int name : nameLengths) { //sum all lengths from nameLengths
			sumLengths += name;
		}
		
		System.out.println("Sum of Name Lengths: " + sumLengths); //print sumLengths
		
		methodTester(); //call methodTester to test all other methods


	}
	
	public static String multiplyWord(String word, int n) { //concatenates a String, word, n times
		String combinedWord = "";
		for (int i = 0; i < n; i++) {
			combinedWord += word;
		}
		return combinedWord;		
	}
	
	public static String combineName(String firstName, String lastName) { //combines first and last name with a space
		return firstName + " " + lastName;
	}
	
	public static boolean isGreaterThan100(int[] arr) { //sums contents of int array and returns true if >100
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		if (total > 100) {
			return true;
		}
		return false;
	}
	
	public static double getAverage(double[] arr) {//returns the average value of the double array
		double total = 0;
		for (double x : arr) {
			total += x;
		}
		return total/arr.length;
	}
	
	public static boolean isGreater(double[] arr, double[] arr2) { //returns true if the average of the first array is greater than the average of the second
		if (getAverage(arr) > getAverage(arr2)) {
			return true;
		}
		return false;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //returns true if isHotOutside is true and moneyInPocket >10.50
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	public static int[] createIntArray() {
		int arraySize = randomNum.nextInt(14) + 1; //randomly determines how large the array will be, between 1 and 15
		int[] arr = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) { //fill array with random numbers
			arr[i] = randomNum.nextInt(19) + 1; //generates a random number between 1 and 20 and inserts it into array
		}
		return arr;
	}
	
	public static double[] createDoubleArray() {
		int arraySize = randomNum.nextInt(14) + 1; //randomly determines how large the array will be, between 1 and 15
		double[] arr = new double[arraySize];
		
		for (int i = 0; i < arraySize; i++) { //fill array with random numbers
			arr[i] = randomNum.nextDouble(19) + 1; //generates a random number between 1 and 20 and inserts it into array
		}
		return arr;
	}
	
	public static void methodTester() { //this method calls all other methods (other than main) and tests them with randomly generated integer input.
		//I wrote it because I need to show that all other methods works as intended with variable input
		
		String word = "Tester";
		int numberOfTimes = randomNum.nextInt(9) + 1; // generates a random number between 1 and 10
		
		System.out.println("\nmultiplyWord Test:\nPrinting Tester " + numberOfTimes + " Time(s):");
		System.out.println(multiplyWord(word, numberOfTimes)); //multiplyWord test
		
		String firstName = "Timothy";
		String lastName = "Smith";
		
		System.out.println("\ncombineName Test:\n" + combineName(firstName, lastName)); //combineName test
		
		int[] testArray = createIntArray(); //create the test array for isGreaterThan100
		
		System.out.print("\nIsGreaterThanTest:\nThe array has " + testArray.length + " integers, and contains: "); //isGreaterThan test
		System.out.print(testArray[0]);
		for (int i = 1; i < testArray.length; i++) {
			System.out.print(", " + testArray[i]);
		}
		System.out.print("\n");
		
		int totalArr = 0;
		for (int i = 0; i < testArray.length; i++) {
			totalArr += testArray[i];
		}
		
		System.out.println("The array totals: " + totalArr);
		System.out.println("IsGreaterThan100? " + isGreaterThan100(testArray)); //print out results of isGreaterThan100
		
		double[] testArray2 = createDoubleArray(); //create test array for getAverage
		
		System.out.println("\ngetAverage Test:\nThe array has " + testArray2.length + " doubles, and contains: "); //getAverage test
		System.out.print(String.format("%.2f", testArray2[0]));
		for (int i = 1; i < testArray2.length; i++) {
			System.out.print(", " + String.format("%.2f", testArray2[i]));
		}
		System.out.print("\n");
		
		System.out.println("The Average is: " + String.format("%.2f", getAverage(testArray2)) + "\n");
		
		double[] testArray3 = createDoubleArray(); //create a second test array to compare with isGreater
		
		System.out.println("isGreater Test:\nThe Average of the first array is: " + String.format("%.2f", getAverage(testArray2)));
		System.out.println("The Average of the second array is: " + String.format("%.2f", getAverage(testArray3)));
		System.out.println("isGreater? " + isGreater(testArray2, testArray3)); //checks to see if the first is greater than the second

		boolean isHot = randomNum.nextBoolean();  //willBuyDrink test
		double moneyInPocket = randomNum.nextDouble(20);
		
		System.out.println("\nisHotOutside Test:\nIs it hot outside? " + isHot);
		System.out.println("How much money do you have? " + String.format("%.2f", moneyInPocket));
		System.out.println("Will you buy a drink? " + willBuyDrink(isHot, moneyInPocket));
		
	}

}
