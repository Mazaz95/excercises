//7. Write a Java program to search an element in a array list.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class SearchElement{
	
	public static void searchElementInArray(){
		List<String> words=new ArrayList(Arrays.asList("Muazaz","Dania","Reem","Nahla","Layan"));
		System.out.println("The Array is: "+words);
		System.out.println("Contain the Array (Nahla) ? "+words.contains("Nahla"));
		System.out.println("Contain the Array (Majd) ? "+words.contains("Majd"));
	}
}