//8. Write a Java program to sort a given array list.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class SortElement{
	
	public static void sortElementInArray(){
		List <String> words=new ArrayList(Arrays.asList("Homs","Mersin","Hannover","NeuIsenburg","Damaskus"));
		System.out.println("The given Array is: "+words);
	    Collections.sort(words);
		System.out.println("The Sorted Array is: "+words);
	}
}