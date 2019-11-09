import java.util.Scanner;
public class MiddleCharacter{

	//1.Write a Java program to get the character at the given index within the String.
	public  void getTheCharacter(String n){
		System.out.println("at which position do you want to find the character? ");
		Scanner sca=new Scanner(System.in);
		int index=sca.nextInt();
		System.out.println("The character atthe position ( " +index +" ) is: " +n.charAt(index));
	    
	}
}