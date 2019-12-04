// 5. Write a Java program to test if an array contains a specific value. 
public class TestSpecificValue{
	
	public static boolean contains(int []arr,int num){
		for(int i:arr){
			if(i==num){
				return true;
			}
		}
		return false;
	}
	
	
	public static void arrayContainSpecificValue(){
		int[]numbers={43,53,24,65};
		System.out.println("Is the array contain 53? " +contains(numbers,53));
		System.out.println("Is the array contain 10? " +contains(numbers,10));
	}
}