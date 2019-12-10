//4. Write a Java program to retrieve an element (at a specified index) from a given array list
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class RetrieveElement{
	
	public static void retrieveElementFromArray(){
		List <Integer> numbers=new ArrayList(Arrays.asList(43,66,86,54,87));
		System.out.println("The Array is: "+numbers);
		System.out.println("The element at the index 2 is: "+numbers.get(2));
	}
}