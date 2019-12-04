// 4. Write a Java program to calculate the average value of array elements.
public class Avg{
	
	public static void calculateAvgOfArray(){
		
		int []numbers={34,53,24,75};
		double sum=0;
		for(int i=0;i<numbers.length;i++)
			sum=sum+numbers[i];
		double avg=sum/numbers.length;
		System.out.println("The average value of this array elemente is: " +avg);
	}
}