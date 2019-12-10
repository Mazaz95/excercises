//3. Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class InsertElement{
	
	public static void insertElementIntoArray(){
		List <Integer> numbers= new ArrayList(Arrays.asList(43,76,68,46,86));
		System.out.println("The Array before adding new number: "+numbers);
		numbers.add(0,11);
		System.out.println("The new Array is: "+numbers);
	}
}