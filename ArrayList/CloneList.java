//16. Write a Java program to clone an array list to another array list.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class CloneList{
	
	public static void cloneListToAnother(){
		List <Integer> number=new ArrayList(Arrays.asList("r","s","f"));
		System.out.println("The original list is: "+number);
		List numbers = ((Integer) ((ArrayList) number).clone());
		System.out.println("The cloned list is: "+numbers);
	}
}