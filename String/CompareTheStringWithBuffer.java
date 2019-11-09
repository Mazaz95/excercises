public class CompareTheStringWithBuffer{
	
	//9. Write a Java program to compare a given string to the specified character sequence.
	public void compareTheStringWithBuffer(String s,String n, String b){
		System.out.println("comparing "+s +" and " +b +": " +s.contentEquals(b));
		System.out.println("comparing "+n + " and " +b +": " +n.contentEquals(b));
	}
}
		