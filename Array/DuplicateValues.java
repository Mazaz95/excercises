// 12. Write a Java program to find the duplicate values of an array of integer values.
import java.util.Arrays;
public class DuplicateValues{
	
	public static void findDuplicateValues(){
		int []numbers={35,65,45,35,45,13};
		for(int i=0;i<numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i]==numbers[j] && i!=j){
					System.out.println("The duplicate values are: "+numbers[j]);
				}
			}
		}
	}
}
		