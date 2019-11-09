import java.util.Scanner;
public class RecursionTest{
	
	
	public static void main(String[]args){
		//main method create an object from the Recursion class and call the method printArray
		Recursion recursive = new Recursion(10);
		for(int i=0;i<10;i++) recursive.value[i]=i;
		System.out.println("we are going to print the elements of our Array ");
		recursive.printArray(10);
		
		System.out.println();
		// our main method here is going to find the factorial of a number
		Factorial fac=new Factorial();
		System.out.print("please enter the number that you want to know it's factorial : ");
		Scanner scann=new Scanner(System.in);
		int number=scann.nextInt();
		fac.fact(number);
		System.out.println("The factorial of "+number +" is : " +fac.fact(number));
	}
}
