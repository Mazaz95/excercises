//14. Write a Java program to find the common elements between two arrays (string values). 
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class FindCommonElements{
	
	public static void findCommonElements(){
		String[]array={"program","java","hello","hi"};
		String[]arr={"programmieren","hi","world","java"};
		List<String> set=new ArrayList<String>();
		for(int i=0;i<array.length;i++){
			for(int j=0;j<arr.length;j++){
				if(array[i]==arr[j]){
					set.add(array[i]);
				}
			}
		}
		System.out.println(set);
	}
}