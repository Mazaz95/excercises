//19. Write a Java program to trim the capacity of an array list the current list size.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class TrimCapacityList{
	
	public static void trimCapacitayOfList(){
		List <Integer> words=new ArrayList <Integer>(6);
		words.add(3);
		words.add(5);
		words.add(9);
		System.out.println("The original Array is: "+words);
		words.trimToSize();
		System.out.println(words);
	}
}
	