public class CopyValues{
	
	//11. Write a Java program to create a new String object with the contents of a character array
	public void displayTheCharacterOfTheArray(char[]data,int offset,int count){
		String satz=String.copyValueOf(data,offset,count);
		System.out.println("The book contains : " +satz +" pages");
	}
}
		