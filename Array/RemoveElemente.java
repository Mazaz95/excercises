// 7. Write a Java program to remove a specific element from an array
import java.util.Arrays;
public class RemoveElemente{
	
	public static int remove(int []numbers,int del){
		//int [] numbers={23,45,65,86,46};
		//System.out.println("The array elemente before removing: "+Arrays.toString(numbers));
		//System.out.println();
		//for(int i=0;i<numbers.length-1;i++)
			//numbers[i]=numbers[i+1];
		  for(int i=0; i<numbers.length; i++)
       {
           if(numbers[i] == del)
           {
               for(int j=i; j<(numbers.length-1); j++)
               {
                   numbers[j] = numbers[j+1];
               }
               
               break;
           }
       }
	   return 0;/**
		System.out.println("The array elemente after removing the first index: "+Arrays.toString(numbers));
		System.out.println();
		for(int i=3;i<numbers.length-1;i++)
			numbers[i]=numbers[i+1];
		System.out.println("The array elemente after removing the third index: "+Arrays.toString(numbers));
		**/
		
	}
	public static void rem(){
		int[] zahl={34,35,657,57};
		System.out.println(remove(zahl,35));
	}
}

		