//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class PrintElement{
	
	public static void printElementOfList(){
		List <String> words=new ArrayList(Arrays.asList("JAVA","Program","Code","Programmieren"));
		System.out.println("The original Array is: "+words);
		for(int i=0;i<words.size();i++)
			System.out.println(words.get(i));
	}
}