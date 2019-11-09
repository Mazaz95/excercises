import java.util.Scanner;
public class Application{
	
	public static void main(String[]args){
		//first of all the main method create an object from the class MiddleCharacter and then call the getCharacter method
		System.out.println("We are going to find the character at the given index ");
		MiddleCharacter middle=new MiddleCharacter();
		System.out.print("please give your string: ");
		Scanner scann=new Scanner(System.in);
		String scan=scann.nextLine();
		middle.getTheCharacter(scan);
		System.out.println();
		
		//now we are going to find the code point value of the character at the index
		System.out.println("we are going to find the code point value of the character at the index ");
		UniCode point=new UniCode();
		System.out.print("please give your string : ");
		Scanner str=new Scanner(System.in);
		String string=str.nextLine();
		point.getThePoint(string);
		System.out.println();
		
		//now ´we are going to find the character (Unicode code point) before the specified index
		System.out.println("we are going to find the character (Unicode code point) before the specified index ");
		CodePoint code=new CodePoint();
		System.out.print("please enter your string : ");
		Scanner satz=new Scanner(System.in);
		String saz=satz.nextLine();
		code.getTheCode(saz);
		System.out.println();
		
		//the main method returns now  the number of Unicode code points in the specified text range
		System.out.println("we are going to find the number of Unicode code points in the specified text range");
		PointCode count=new PointCode();
		System.out.print("please enter you string: ");
		Scanner enter=new Scanner(System.in);
		String sat=enter.nextLine();
		count.countThePoint(sat);
		System.out.println();
		
		//main method call the findTheString method to compare two strings lexicographically.
		System.out.println("we are going to compare two strings lexicographically ");
		Comparing compare=new Comparing();
		System.out.print("please enter your first string : ");
		Scanner one=new Scanner(System.in);
		String first=one.nextLine();
		System.out.print("please enter your second string : ");
		Scanner two=new Scanner(System.in);
		String second=two.nextLine();
		compare.findTheBigString(first,second);
		System.out.println();
		
		//main method call the ignoreCase method to compare two strings lexicographically, ignoring case differences
		System.out.println("we are going to compare two strings lexicographically, ignoring case differences");
		Compare com=new Compare();
		System.out.print("please enter your first string : ");
		Scanner three=new Scanner(System.in);
		String third=one.nextLine();
		System.out.print("please enter your second string : ");
		Scanner four=new Scanner(System.in);
		String fourth=two.nextLine();
		compare.findTheBigString(third,fourth);
		System.out.println();
		
		//main method call now the checkIfStringContainAnother to check if String contains another substring or not
		System.out.println("we are going to check if String contains another substring or not ");
		ContainTheValue value=new ContainTheValue();
		System.out.print("please enter your first string: ");
		Scanner scn=new Scanner(System.in);
		String san=scn.nextLine();
		System.out.print("please enter your second string: ");
		Scanner sam=new Scanner(System.in);
		String say=sam.nextLine();
		value.checkIfStringContainsAnother(san,say);
		System.out.println();
		
		//now the main method will compare the String with the String Buffer and returns a boolean value 
		System.out.println("we are going to compare the String with the String Buffer and returns a boolean value");
		CompareTheStringWithBuffer buff=new CompareTheStringWithBuffer();
		System.out.print("please enter your first string: ");
		Scanner man=new Scanner(System.in);
		String nam=man.nextLine();
		System.out.print("please enter your second string: ");
		Scanner mar=new Scanner(System.in);
		String ram=mar.nextLine();
		System.out.print("please enter a Buffer: ");
		Scanner ban=new Scanner(System.in);
		String nab=ban.nextLine();
		buff.compareTheStringWithBuffer(nam,ram,nab);
		System.out.println();
		
		//
		System.out.println();
		CopyValues copy=new CopyValues();
		System.out.print("please enter your array: ");
		Scanner s=new Scanner(System.in);
		char[] a = s.next().toCharArray();
		System.out.print("at which index do you want to start? ");
		Scanner sa=new Scanner(System.in);
		int ss=sa.nextInt();
		System.out.print("at which index d you want to stop? ");
		Scanner sss=new Scanner(System.in);
		int m=sss.nextInt();
		copy.displayTheCharacterOfTheArray(a,ss,m);
		System.out.println();
	}
}
		
		