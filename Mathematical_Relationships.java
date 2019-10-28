import java.util.Scanner;

/*this is a mathematic class which calculate the adding,subtraction,multiplication,division between Numbers     
  and show too the biggest and smallest number */
public class Mathematical_Relationships{
	
	//this method count two inetger Numbers and appear the result
	public static void sum(int number1,int number2){
		int sum=number1+number2;
		System.out.println("The Sum is: " +sum);
		System.out.println();
		}
	
	//this method subtract two inetger Numbers and appear the result
	public static void diff(int number1,int number2){
		int diff=number1-number2;
		System.out.println("The difference is: " +diff);
		System.out.println();
	}
	
	//this method multiplication two integer Numbers and appear the result
	public static void product(int number1,int number2){
		int prod=number1*number2;
		System.out.println("The product is: " +prod);
		System.out.println();
	}
	
	//this method divide two integer Numbers and appear the result
	public static void average(int number1,int number2){
		int avg=(number1+number2)/2;
		System.out.println("The average is: " +avg);
		System.out.println();
	}
    
	//this method show the biggest number between two Numbers
	public static void max(int number1,int number2){
		int max=0;
		if(number1>number2)
			max=number1;
		else
			max=number2;
		System.out.println("The maximum number is: " +max);
		System.out.println();
	}
	
	//this method show the smallest number between two Numbers
	public static void min(int number1,int number2){
		int min=0;
		if(number1<number2)
			min=number1;
		else
			min=number2;
		System.out.println("The minimum Number is: " +min);
		System.out.println();
	}
	
	//main method
	public static void main(String[]args){
		Scanner scann=new Scanner(System.in);
		System.out.println("please enter your first Number: ");
		int number1=scann.nextInt();
		System.out.println("please enter your second Number: ");
		int number2=scann.nextInt();
		System.out.println("Your Numbers are: " +number1 + ", " +number2);
		System.out.println();
		sum(number1,number2 );
		diff(number1,number2);
	    product(number1,number2);
		average(number1,number2);
		max(number1,number2);
		min(number1,number2);
	}
}
			
	