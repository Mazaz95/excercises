//2. Write a Java program to iterate through all elements in a array list. 
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class MyArray{
	
	public static void myArray(){
		List <String> array=new ArrayList(Arrays.asList("rosa","blue","pink","black"));
		for(String iterator : array)
			System.out.println(iterator);
	}
}
