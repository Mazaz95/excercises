//9. Write a Java program to copy one array list into another.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class CopyArrayList{
	
	public static void copyArrayIntoAnother(){
		List<String> words=new ArrayList(Arrays.asList("Adana","Leibniz","Duisburg"));
		System.out.println("The Words Array is: "+words);
		List <String> copyList=new ArrayList<String>(words);
		System.out.println("The CopyList is: "+copyList);
	}
}