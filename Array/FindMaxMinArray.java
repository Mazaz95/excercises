//10. Write a Java program to find the maximum and minimum value of an array.
import java.util.Arrays;
public class FindMaxMinArray{
	
	public static void findMaxMinArray(){
		int []numbers={34,65,24,86,76};
		int max=numbers[4];
		int min=numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>max)
				max=numbers[i];
			else if(numbers[i]<min)
				min=numbers[i];
		}
		System.out.println("The maximum value of the array is: " +max);
		System.out.println("The minimum value of the array is: "+min);
	}
}
		