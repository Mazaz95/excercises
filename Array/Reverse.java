//11. Write a Java program to reverse an array of integer values.
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Reverse{
	
	public static void reverse(){
		int []numbers={2,3,7,5,8,4};
		System.out.println("The original array is: "+Arrays.toString(numbers));
		Collections.reverse(Arrays.asList(numbers));
		System.out.println("The reverse array is: "+Arrays.toString(numbers)); 
	}
}