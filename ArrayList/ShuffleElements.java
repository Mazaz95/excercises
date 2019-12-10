//10. Write a Java program to shuffle elements in a array list.
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ShuffleElements{
	
	public static void shuffleElementsInArray(){
		List<Integer>numbers=new ArrayList(Arrays.asList(3,5,8,7,0,4,6));
		System.out.println("The original Array is: "+numbers);
		Collections.shuffle(numbers);
		System.out.println("The Array after doing shuffle is: "+numbers);
	}
}