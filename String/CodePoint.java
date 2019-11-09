import java.util.Scanner;
public class CodePoint{
	
	//3. Write a Java program to get the character (Unicode code point) before the specified index within the String.
	public void getTheCode(String r){
		System.out.println("at which position do you want to find the character? ");
		Scanner scan=new Scanner(System.in);
		int index=scan.nextInt();
		System.out.println("Character(unicode point) = " +r.codePointBefore(index));
	}
}