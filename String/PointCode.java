public class PointCode{
	
	//4.Write a java program to count a number of Unicode code points in the specified text range of a String.
	public void countThePoint(String s){
		int count=s.codePointCount(1,10);
		System.out.println("Codepoint count = " +count);
	}
}