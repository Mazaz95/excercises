//11. Write a Java program to reverse elements in a array list.
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseElements{
	
	public static void reverseElementsInArray(){
		List <Integer> numbers= new ArrayList(Arrays.asList(4,76,5,43,979,56));
		System.out.println("The original Array is: "+numbers);
		Collections.reverse(numbers);
		System.out.println("The Array after reversing is: "+numbers);
	}
}