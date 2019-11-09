public class ApplicationTest{
	
	public static void main(String[]args){
		
		//1.Write a Java program to get the character at the given index within the String.
		MiddleCharacter middle=new MiddleCharacter();
		System.out.println("Your string is: Java Exercises!  ");
		middle.getTheCharacter("Java Exercises! ");
		System.out.println();
		
		//2. Write a Java program to get the character (Unicode code point) at the given index within the String.
		UniCode point=new UniCode();
		System.out.println("Your string is :  w3resource.com");
		point.getThePoint(" w3resource.com");
		System.out.println();
		
		//3. Write a Java program to get the character (Unicode code point) before the specified index within the String.
		CodePoint code=new CodePoint();
		System.out.println("Your string is: w3resource.com ");
		code.getTheCode("w3resource.com ");
		System.out.println();
		
		//4.Write a java program to count a number of Unicode code points in the specified text range of a String.
		PointCode count=new PointCode();
		System.out.println("Your string is : w3rsource.com");
		count.countThePoint("w3rsource.com");
		System.out.println();
		
		//5. Write a java program to compare two strings lexicographically.
		Comparing compare=new Comparing();
		System.out.println("Your strings are : (This is Exercise 1) and (This is Exercise 2)");
		compare.findTheBigString("This is Exercise 1 " ," This is Exercise 2");
		System.out.println();
		
		//6. Write a java program to compare two strings lexicographically, ignoring case differences
		Compare com=new Compare();
		System.out.println("Your strings are : (This is Exercise 1) and (This is exercise 1)");
		com.ignoreCase("This is Exercise 1 " ," This is exercise 1");
		System.out.println();
		
		//7. Write a Java program to concatenate a given string to the end of another string.
		Connect conet=new Connect();
		System.out.println("Your strings are : (PHP Exercises and) and (Python Exercises) ");
		conet.connectTheString("PHP Exercises and " ,"Python Exercises ");
		System.out.println();
		
		//8. Write a Java program to test if a given string contains the specified sequence of char values.
		ContainTheValue value=new ContainTheValue();
		System.out.println("Your strings are: (PHP Exercises and Python Exercises) and (and)");
		value.checkIfStringContainsAnother("PHP Exercises and Python Exercises","and");
		System.out.println();
		
		//9. Write a Java program to compare a given string to the specified character sequence.
		CompareTheStringWithBuffer buffer=new CompareTheStringWithBuffer();
		System.out.println("Your strings are: (example.com) ,(Example.com) and (example.com)");
		buffer.compareTheStringWithBuffer("example.com","Example.com","example.com");
		System.out.println();
		
		//11. Write a Java program to create a new String object with the contents of a character array
		CopyValues copy=new CopyValues();
		char []array=new char[]{'1','2','3','4'};
	    copy.displayTheCharacterOfTheArray(array,1,3);
		System.out.println();
	}
}