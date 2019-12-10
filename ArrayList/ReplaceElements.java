//21. Write a Java program to replace the second element of a ArrayList with the specified element.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ReplaceElements{
	
	public static void replaceElementsOfList(){
		List <String> words=new ArrayList(Arrays.asList("How","you","do'n"));
		System.out.println("The original Array is: "+words);
		words.set(1,"are");
		System.out.println("The new Array is: "+words);
	}
}