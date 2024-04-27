package ptbeWeek4JavaCodingProject;

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
	
// 1) a:	
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
	System.out.println("Average of array : "+average);
	
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
	
	}

}
