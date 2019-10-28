import java.util.Scanner;
public class Number{
	
	//this method will convert the number from inch to meter
	public static void main(String[]args){
		System.out.println("please enter the number in inch: ");
		Scanner scann=new Scanner(System.in);
		int inch=scann.nextInt();
		double meter=inch*0.0254;
		System.out.println( "1000 inch is in meter equal to : " +meter);
	}
}