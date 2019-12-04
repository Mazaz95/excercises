// 6. Write a Java program to find the index of an array element.
public class FindIndex{
	
	public static int find(int []arr,int f){
		int y=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==f){
				y=i;
				break;
			}
		}
			return y;
	}
		
	public static void findElementIndex(){
		int []numbers={23,55,64,24,6};
		System.out.println("The index of 64 is: " +find(numbers,64));
		System.out.println("The index of 23 is: " +find(numbers,23));
	}
}
	