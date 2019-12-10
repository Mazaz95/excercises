//14. Write a Java program of swap two elements in an array list.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class SwapElements{
	
	public static void swapElementsInArray(){
		List <String> words=new ArrayList(Arrays.asList("first","fourth","second","third"));
		System.out.println("The original Array is: "+words);
		Collections.swap(words,1,2);
		Collections.swap(words,2,3);
		System.out.println("The Array after swapping is: "+words);
	}
}