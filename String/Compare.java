public class Compare{
	
	//6. Write a java program to compare two strings lexicographically, ignoring case differences
	public int ignoreCase(String k,String l){
		int result=k.compareToIgnoreCase(l);
		if(result==0)
			System.out.println("The first string ( " +k +" ) is equal to the second one ( " +l +") ");
		else
		    System.out.println("They are not equal");
		return result;
	}
}