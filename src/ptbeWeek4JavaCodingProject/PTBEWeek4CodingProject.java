package ptbeWeek4JavaCodingProject;

import java.util.Arrays;


public class PTBEWeek4CodingProject {

	public static void main(String[] args) {
		
//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

//a. Programmatically subtract the value of the first element in the array from the value in the last
//   element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  

//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array,
//   and have more elements).  

//i. Make sure that there are 9 elements of type int in this new array.  

//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element
//	  in the new array ages2 from the last element of ages2). 

//iii. Show that using the index values for the elements is dynamic (works for arrays of different
//	   lengths).

// c. Use a loop to iterate through the array and calculate the average age. Print the result to the
//		console.
	
// 1)		
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
// 1) a:	first element is accessed by [0] index, and the last by the length-1 (since index is zero based)
	int subtract = ((ages[0]) - (ages[ages.length-1]));	
	System.out.println(subtract);
	
// 1) b: i-iii:
	int[] ages2 = {26, 35, 46, 55, 2, 8, 95, 75, 86};
	
	int subtract2 = ((ages2[0]) - (ages2[ages2.length-1]));	
	System.out.println(subtract2);
	
	int length = ages2.length;
	int total = 0;
		for(int age : ages2) {
			total += age;
	} int average = total / length;
	System.out.println("Average of array : "+ average);
	
// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”,
// 	  “Sally”, “Buck”, “Bob”.

// a. Use a loop to iterate through the array and calculate the average number of letters per name. 
// 	  Print the result to the console.

// b. Use a loop to iterate through the array again and concatenate all the names together, separated by
//	  spaces, and print the result to the console.
	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
// 2) a:
	int chCount = 0;
	int nLength = names.length;
	for(String name : names) {
		chCount += name.length();
	}
	int	average2 = chCount/nLength;
	System.out.println("The average numer of letters per name is : " + average2);
	
// 2) b:
	String allTheNames = "";
	for(int i = 0; i < names.length; i++) {
		allTheNames += names[i] + " ";
	}
	System.out.println(allTheNames);
	
// 3) How do you access the last element of any array?
//		The last element of an array is accessed by referencing the arrayName.length-1.  Example:
	System.out.println(names[names.length-1]);
	
// 4) How do you access the first element of any array?
//  	Arrays have a zero based index, so the first element of the array is arrayName[0]  Example:
	System.out.println(names[0]);
	
// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created
//    names array and add the length of each name to the nameLengths array.	
//  .stream separates each of the elements of the array, .mapToInt changes the str to an int length, 
//  .toArray returns the map to an Array, then .toString returns a string representation of the 
//	nameLengths array.
	
	int[] nameLengths = Arrays.stream(names)
						.mapToInt(String::length)
						.toArray();
	System.out.println(Arrays.toString(nameLengths));
	
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the
//	  array. Print the result to the console.
	int sum = 0;
	for(int name : nameLengths) {
		sum += name;
	}
	System.out.println("The sum of all of the elements is: " + sum);

// 7)  Method to concatenate string as many times as specified by user
	System.out.println(multipleWords("Bye, Falicia!", 4));
	
// 8) Prints to console the person's full name with a space between first and last name
	System.out.println(fullName("Shirley", "Jones"));
	
// 9)Prints result of method to check if the sum of an array is higher than 100
	System.out.println(higherThanHundo(ages2));
	
// 10)
	double[] twiceArr = {5.7, 99.25, 5.6, 19393.3, 2.4};
	System.out.println(arrAve(twiceArr));
	
// 11)
	double[] moreArray = {6.2, 5.8, 67.9, 123432.9};
	System.out.println(isGreater(twiceArr, moreArray));
// 12) 
	boolean isHotOutside = true;
	double moneyInPocket = 11;
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
// 13) 
	double subtotal = 76.82;
	System.out.printf("%, .2f",totalWithTax(subtotal));
	
	}
	
//  METHODS:
	
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
//	  concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to
//	  return “HelloHelloHello”).	
//    starting with an empty string, then a for loop to iterate through the number of times given by user, 
//    with the string added to the empty string at each iteration, and returning when the loop is done.	
	public static String multipleWords(String word, int num) {
		String multipliedWords = "";
		for(int i = 0; i < num; i++) {
			multipliedWords += word;
		} return multipliedWords;
	}
	
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full
//	 name should be the first and the last name as a String separated by a space).	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array
//	  is greater than 100.
	public static Boolean higherThanHundo(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}
	
// 10. Write a method that takes an array of double and returns the average of all the elements in the
//	   array. 	
	public static Double arrAve(double[] arr) {
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in
//     the first array is greater than the average of the elements in the second array.	
	public static Boolean isGreater(double[] arr1, double[] arr2) {
			return arrAve(arr1) > arrAve(arr2);
	}
	
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
//	   and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 	
	public static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	
// 	13. Create a method of your own that solves a problem. In comments, write what the method does and
//	    why you created it.
//  	This method is to calculate sales tax when given a subtotal. 	
	public static double totalWithTax(double subtotal) {
		double total = subtotal * 1.08;
		return total;
	}
	
	
}
