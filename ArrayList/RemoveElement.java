//6. Write a Java program to remove the third element from a array list.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class RemoveElement{
	
	public static void removeElementFromArray(){
		List <String> words=new ArrayList(Arrays.asList("Mohanad","Majd","Hazem","Ameer"));
		System.out.println("The Array is: "+words);
		words.remove(2);
		System.out.println("The new Array is: "+words);
	}
}