import java.util.Scanner;
public class BinaryNumbers{
	
	//Write a Java program to find the length of the longest sequence of zeros in binary representation of an integer.
	public static void main(String[]args){
		System.out.println("please enter a number: ");
		Scanner scann=new Scanner(System.in);
		int number=scann.nextInt();
		String binary = Integer.toBinaryString(number);
		System.out.println(binary);
	}
}
		