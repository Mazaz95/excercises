// 1. Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;
public class Sort{
	
	public static void sortValuesArray(){
	     String [] word={"Muazaz","Reem","Mohanad","Ameer"};
	     int [] numbers={34,21,85,45};
	
	     Arrays.sort(word);
	     System.out.println(Arrays.toString(word));
	     System.out.println();
	     Arrays.sort(numbers);
	     System.out.println(Arrays.toString(numbers));
	}
}