//20. Write a Java program to increase the size of an array list.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class IncreaseSizeList{
	
	public static void increaseSizeOfList(){
		List <String> word=new ArrayList <String>();
		word.add("pink");
		word.add("rosa");
		System.out.println(word);
		word.ensureCapacity(4);
		word.add("black");
		word.add("red");
		System.out.println(word);
	}
}