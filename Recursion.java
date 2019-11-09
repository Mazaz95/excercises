public class Recursion{
	
	
	int []value;
	
	//constructor of class Recursion
	public Recursion(int i){
		value=new int[i];
	}
	
	//this method print the first i elements in the array values.
	public void printArray(int i){
		if(i==0) return;
		else printArray(i-1);
		System.out.println(" [ " +(i-1) +" ] : " +value[i-1]);
	}
}