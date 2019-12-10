//5. Write a Java program to update specific array element by given element.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class UpdateElement{
	
	public static void updateElementByAnother(){
		List <String> words=new ArrayList(Arrays.asList("Informatik","Programmieren","C"));
		System.out.println("The Array is: "+words);
		words.set(2,"Java");
		System.out.println("The new Array is: "+words);
	}
}