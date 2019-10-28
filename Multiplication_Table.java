import java.util.Scanner;
// this class show us the multiplication-table for any number we want it
public class Multiplication_Table{
			
    public static void main(String[]args){
	System.out.println("please enter a number: ");
	Scanner scann=new Scanner(System.in);
	int number=scann.nextInt();
    int zahl;
		for(int i=0;i<=10;i++){
			zahl=number*i;
		System.out.println(+number +" * " +i +" = " +zahl);
	    }
    }
}
	
	