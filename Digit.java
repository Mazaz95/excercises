import java.util.Scanner;
public class Digit{
	
	//this method adds all the digits in the integer.
	public static void main(String[]args){
		System.out.println("please enter your number: ");
		Scanner scann=new Scanner(System.in);
		int digit=scann.nextInt();
		int a1=digit/100%10;
		int a2=digit/10%10;
		int a3=digit%10;
		int sum=a1+a2+a3;
		
		System.out.println("The sum of all digits in 565 is: " +sum);
	}
}