import java.util.Scanner;
public class Application{
	
	//1- Write a Java program to round up the result of integer division.
	public static void roundUpInteger(){
		System.out.println("please enter the theory mark: ");
		Scanner scann=new Scanner(System.in);
		int x1=scann.nextInt();
		System.out.println("please enter the practical mark: ");
		Scanner scan=new Scanner(System.in);
		int x2=scan.nextInt();
		System.out.println("please enter the total mark: ");
		Scanner sca=new Scanner(System.in);
		int x3=scan.nextInt();
		int precentage_of_mark=((x1+x2)*100)/x3;
		System.out.println("precentage of mark: "+precentage_of_mark +"%");
		System.out.println();
	}
	
	//3-Write a Java program to test if a double number is an integer.
	public static void testOfDoubleNumberIsInteger(){
		System.out.println("please enter a double number: ");
		Scanner scann=new Scanner(System.in);
		double x=scann.nextDouble();
		if(x%1==0)
			System.out.println("The number you have enterd it's not a double ");
		else
			System.out.println("The number you have entered it's double");
	}
	
	//2-Write a Java program to get whole and fractional parts from a double value.
	public static void displayFractionalUndIngeralFromDoubleNumber(){
		System.out.println("please enter a double number: ");
		Scanner scann=new Scanner(System.in);
		double x=scann.nextDouble();
		double fractional_part=x%1;
		double integral_part=x-fractional_part;
		System.out.println("The integral part of (" +x +" ) is: " +integral_part);
		System.out.println("The fractional part of ( " +x +" ) is: " +fractional_part);
	}
	
	//11- Write a Java program to accept two integers and return true if the either one is 15 or if their sum or difference is 15.
	public static void acceptOnlyNumberFifteen(){
		System.out.println("please enter the first number: ");
		Scanner scann=new Scanner(System.in);
		int x1=scann.nextInt();
		System.out.println("please enter the second number: ");
		Scanner scan=new Scanner(System.in);
		int x2=scan.nextInt();
		System.out.println("The result is: " +isTrue(x1,x2));
	}
	public static boolean isTrue(int x1,int x2){
		if(x1==15 || x2==15)
			return true;
		else if((x1+x2)==15 || Math.abs(x1-x2)==15)
			return true;
		else 
			return false;
	}
	
	//9- Write a Java program to convert a float value to absolute value.
	public static void convertFloatToAbsolute(){
		System.out.println("please enter a float number: ");
		Scanner scann=new Scanner(System.in);
		float f=scann.nextFloat();
	    System.out.println(Math.abs(f));
	}
	
	//8- Write a Java program to convert an integer value to absolute value.
	public static void convertIntegerToAbsolute(){
		System.out.println("please enter an integer number: ");
		Scanner scann=new Scanner(System.in);
		int x=scann.nextInt();
		System.out.println(Math.abs(x));
	}
		
	//main method
	public static void main(String[]args){
		roundUpInteger();
		testOfDoubleNumberIsInteger();
		displayFractionalUndIngeralFromDoubleNumber();
		acceptOnlyNumberFifteen();
		convertFloatToAbsolute();
		convertIntegerToAbsolute();
	}
}