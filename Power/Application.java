import java.util.Scanner;
public class Application{
    
	//this method show us the square,cube and the fourth-power of a number
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a Number: ");
		double number=scan.nextInt();
		double square=number*number;
		double cube=Math.pow(number,3);
		double fourth_power=Math.pow(number,4);
		
		System.out.println("\n Square Number is: " +square + "\n Cube Number is: " +cube + "\n Fourth Number is: " +fourth_power);
	}
}