// 9. Write a Java program to insert an element (specific position) into an array.
import java.util.Arrays;
public class InsertElement{
	
	public static void insertElementIntoArray(){
		int []numbers={35,25,75,86,5};
		int pos=4;
		int newValue=45;
		System.out.println("The original array is: "+Arrays.toString(numbers));
		numbers[pos]=newValue;
		System.out.println("The new array is:"+Arrays.toString(numbers));
	}
}
			