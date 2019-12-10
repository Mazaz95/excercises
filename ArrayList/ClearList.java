//17. Write a Java program to empty an array list. 
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ClearList{
	
	public static void clearList(){
		List <Integer> numbers=new ArrayList(Arrays.asList(3,5,7,5,4,3));
		System.out.println("The original Array is: "+numbers);
		numbers.clear();
		System.out.println("The Array after clearing is: "+numbers);
	}
}