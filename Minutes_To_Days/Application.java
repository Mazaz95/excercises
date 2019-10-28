import java.util.Scanner;

public class Application{
	
	//this method will convert the number of minutes to days and hours
	public static void main(String[]args){
		System.out.println("please enter the number of minutes: ");
		Scanner scann=new Scanner(System.in);
		int minutes=scann.nextInt();
		int days = minutes/1440;
		int hours = (minutes%1440)/60;
		System.out.println("days: " + days + " and hours: " + hours);
	}
}