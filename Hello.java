import java.util.Scanner;
public class Hello{
	
	//this method will appear the name of user with "Hello" word
	public static void main(String[]args){
		System.out.println("Please enter your name: ");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		System.out.println("Hello " +name);
	}
}