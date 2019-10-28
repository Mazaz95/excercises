import java.util.Arrays;
import java.util.*;

// this class deals with Arrays and Mathematical relationships
public class Array{
	
	//this method arranged the Matrix from smallest number to the biggest one
	public static void numeric(){
		int []x={2,87,12,54,0,67,5};
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println();
	}
	
	//this method arranged the matrix in alphabetical order
	public static void text(){
		String []y={"fun","welcome","Programming","Huhu"};
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		System.out.println();
	}
	
	//this method calculate the sum,avg,max,min of an array
	public static void add(){
		int []z={4,5,8,2,0,1};
		int sum=0;
		int avg=0;
		int max=z[0];
		int min=z[0];
		
		for(int i=0;i<z.length;i++){
			sum=sum+z[i];
			avg=sum/6;
		}
		
		for(int i=0;i<z.length;i++){
			if(max<z[i])
				max=z[i];
		}
		
		for(int i=0;i<z.length;i++){
			if(min>z[i])
				min=z[i];
		}
		
		System.out.println("The sum of the array's values is: " +sum);
		System.out.println();
		System.out.println("The average of this Array is: " +avg);
		System.out.println();
		System.out.println("The Maximum value is: " +max);
		System.out.println();
		System.out.println("The Minimum value is: " +min);
		System.out.println();
	}
	
	//this method print a square
	public static void print(){
		String [][]m =new String[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				m[i][j]=" - ";
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
	
	//this method convert the array to arraylist
	public static void convert(){
		String []s={"Hi","you","are","doing","good"};
		List a=Arrays.asList(s);
		System.out.println(a);
		System.out.println();
	}
	
	//this method convert the arraylist to array
	public static void conversion(){
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(6);
		Object [] array=list.toArray();
		System.out.println(Arrays.toString(array));
	}
		
	//this method cheak if two arrays are equal
	public static void equal(){
		int []a={2,4,6,8,0,1};
		int []b={3,6,9,0,2};
		int []c={2,4,6,8,0,1};
		System.out.println("Is a equal to b? " +Arrays.equals(a,b));
		System.out.println();
		System.out.println("Is a equal to c? " +Arrays.equals(a,c));
		System.out.println();
		System.out.println("Is b equal to c? " +Arrays.equals(b,c));
		System.out.println();
	}
	
    //this method print the Leader of an array which it is greater than all the elements to its right side	
	public static void leaders(){
		int []z={45,87,23,90,12,99,100,47};
		for(int i=0;i<z.length-1;i++){
			if(z[i+1]>z[i]){
				z[i]=z[i+1];
				System.out.print(z[i]+" ");
		    }
		}
		System.out.println();
		
		int []y=z.clone();
		int leader=y[0];
		for(int j=0;j<y.length-1;j++){
			if(y[0]<y[j+1]){
				y[0]=y[j+1];
			}
		}
		System.out.println("The Leader is: " +y[0]);
		System.out.println();
	}
	
	//this method replace every element with the next greatest element
	public static void replace(){
		int []m={34,87,56,12,99};
		for(int i=0;i<m.length-1;i++){
			if(m[i]<m[i+1]){
				m[i]=m[i+1];
		    }
		System.out.print(m[i] + " ");
		}
		System.out.println();
	}
		
    //main method		
	public static void main(String[]args){
		numeric();
		text();
		add();
		print();
		convert();
		conversion();
		equal();
		leaders();
		replace();
	}
}
