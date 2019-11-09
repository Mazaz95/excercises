public class Comparing{
	
	//5. Write a java program to compare two strings lexicographically.
	public int findTheBigString(String m,String n){
		int result=m.compareTo(n);
		if (result==0)
			return 0;
		else if(result<0)
			System.out.println("The First string (" +m +" ) is less than the second one ( " +n +" )");
		else
		    System.out.println("The second string(" +n  +" ) is greater than the first one ( " +m +" )");
		return result;
	}
}
		
		