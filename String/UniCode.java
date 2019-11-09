import java.util.Scanner;
public class UniCode{
	
	//2. Write a Java program to get the character (Unicode code point) at the given index within the String.
	public void getThePoint(String m){
		System.out.println("at which position do you want to find the character? ");
		Scanner scan=new Scanner(System.in);
		int index=scan.nextInt();
		System.out.println("Character(unicode point) =" +m.codePointAt(index));
	}
}