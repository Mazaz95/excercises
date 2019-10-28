import java.util.Scanner;
public class Temberatur{
	
	//this method will convert the degree from Fahrenheit to celsius
	
	public static void main(String[]args){
		System.out.println("please enter the degree in fahrenheit: ");
		Scanner scann=new Scanner(System.in);
		int fahrenheit=scann.nextInt();
		double celsius=(fahrenheit - 32)*5/9;
		System.out.println("The degree in fahrenheit is: " +fahrenheit);
		System.out.println("The degree in celsius is: " +celsius);
	}
}