//12. Write a Java program to extract a portion of a array list.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ExtractPortion{
	
	public static void extractPortionOfArray(){
		
		List <Integer> numbers=new ArrayList(Arrays.asList(34,6,76,4,76,78,65));
		System.out.println("The original Array is: "+numbers);
		System.out.println("A portion of the Array is: "+numbers.subList(3,6));
	}
}