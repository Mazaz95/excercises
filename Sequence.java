import java.util.Scanner;
public class Sequence{
	
	//this method break an integer into a sequence of individual digits 
	public static void main(String[]args){
		System.out.println("please enter your number: ");
		Scanner scann=new Scanner(System.in);
		int digit=scann.nextInt();
		int a1=digit/100000%10;
		int a2=digit/10000%10;
		int a3=digit/1000%10;
		int a4=digit/100%10;
		int a5=digit/10%10;
		int a6=digit%10;
		
		System.out.println(a1 +" "+a2+ " "+a3 +" " +a4+" "+a5+" "+a6);
	}
}
	