//15. Write a Java program to join two array lists.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class JoinLists{
	
	public static void joinLists(){
		List <String> word=new ArrayList (Arrays.asList("welcome","to","JAVA"));
		List <String> words=new ArrayList(Arrays.asList("Hello","World"));
		String s=String.format("The first list is: %s , and the second is: %s",word,words);
		System.out.println(s);
		word.addAll(words);
		System.out.println("The two lists together are: "+word);
	}
}