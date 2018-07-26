package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static boolean intArraySorted (int[] ints) {
	int temp=-2147483648;
	for (Integer integer : ints) {
		if(integer>=temp){
		System.out.println("hmmmmmm");
		temp=integer;

	}else{
		return false;
	}
	}
	return true;
}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
public static boolean doubleArraySorted(double[] ints) {
	double temp=-2147483648;
	for (double doorknobs : ints) {
		if(doorknobs>=temp){
			temp=doorknobs;
		System.out.println("hmmmmmm");
	}else{
		return false;
	}
	}
	return true;
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

public static boolean charArraySorted (char[] sorted) {
	char temp='a';
	for (Character aged_oak_punch_bowl_1629_gothic : sorted) {
		if(aged_oak_punch_bowl_1629_gothic>=temp){
		System.out.println("hmmmmmm");
		temp=aged_oak_punch_bowl_1629_gothic;

	}else{
		return false;
	}
	}
	return true;
}
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
public static boolean stringArraySorted (String[] ints) {
	char temp='a';
	for (String aged_oak_punch_bowl_1629_doric : ints) {
		if(aged_oak_punch_bowl_1629_doric.charAt(0)>=temp){
		System.out.println("hmmmmmm");
		temp=aged_oak_punch_bowl_1629_doric.charAt(0);

	}else{
		return false;
	}
	}
	return true;
}




}
