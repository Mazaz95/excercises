// 8. Write a Java program to copy an array by iterating the array. 
import java.util.Arrays;
public class CopyArray{
	
	public static void copyArrayElement(){
		int []numbers={23,56,86,45};
		int []zahlen=numbers.clone();
		
		System.out.println("numbers= "+Arrays.toString(numbers));
		System.out.println("zahlen= "+Arrays.toString(zahlen));
	}
}