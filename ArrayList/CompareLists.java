//13. Write a Java program to compare two array lists.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class CompareLists{
	
	public static void compareListWithAnother(){
		List <Integer> number=new ArrayList(Arrays.asList(2,3,5,6,7));
		System.out.println("The first list is: "+number);
		List <Integer> numbers=new ArrayList(Arrays.asList(2,4,5,6,7));
		System.out.println("The second list is: "+numbers);
		System.out.println("Are the lists equal? "+number.equals(numbers));
	}
}