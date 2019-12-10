//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.List;
import java.util.ArrayList;
public class AddColorsToArray{
	
	public static void addColorsToArray(){
		List <String> array=new ArrayList<String>();
		array.add("green");
		array.add("red");
		array.add("yellow");
		array.add("rosa");
		System.out.println(array);
	}
}