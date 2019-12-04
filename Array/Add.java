// 2. Write a Java program to sum values of an array.
public class Add{
	
	public static void addValuesArray(){
		int []numbers={24,27,65,3};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
			sum=sum+numbers[i];
		System.out.println("The sum value of the arrayselement is:" +sum);
	}
}
			