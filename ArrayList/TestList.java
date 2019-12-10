//18. Write a Java program to test an array list is empty or not.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class TestList{
	
	public static void testEmptyArray(){
		List <String> word=new ArrayList(Arrays.asList("Homs","Majd"));
		List <String> words=new ArrayList <String>();
		String s=String.format("The first list is: %s and the second is: %s",word,words);
		System.out.println(s);
		System.out.println("Is the first list empty? "+word.isEmpty());
		System.out.println("Is the second list empty? "+words.isEmpty());
	}
}