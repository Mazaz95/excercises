import java.util.Scanner;
import java.util.Calendar;
public class Application{
	
	//this method find the smallest number between three numbers
    public static void findTheSmallestNumber(){
		System.out.println("please enter three numbers: ");
		Scanner scann=new Scanner(System.in);
		int n1=scann.nextInt();
		int n2=scann.nextInt();
		int n3=scann.nextInt();
		int small_number;
		if(n1<n2 && n1<n3)
			small_number=n1;
		else if(n2<n1 && n2<n3)
			small_number=n2;
		else
			small_number=n3;
		System.out.println("The smallest number between ( " +n1 +" , " +n2 +" , " +n3 +" ) is : " +small_number);
		System.out.println();
	}
	
	//this method calculate the avg of the numbers
	public static void averageOfNumbers(){
		System.out.println("please enter three numbers: ");
		Scanner scann=new Scanner(System.in);
		int m1=scann.nextInt();
		int m2=scann.nextInt();
		int m3=scann.nextInt();
		int sum=m1+m2+m3;
		int avg=sum/3;
		System.out.println("The average of these numbers is : " +avg);
		System.out.println();
	}
	
	//this method compute the sum of the digits in an integer
	public static void sumOfDigitInInteger(){
		System.out.println("please enter a number: ");
		Scanner scann=new Scanner(System.in);
		int x=scann.nextInt();
		int y1=x/100%10;
		int y2=x/10%10;
		int y3=x%10;
		int sum=y1+y2+y3;
		System.out.println("The sum of ( " +x +" ) is: " +sum );
		System.out.println();
	}
	
	//this method display the first 50 pentagonal numbers
	public static void displayPentagonalsNumbers(){
		System.out.println("These are the first 50 Pentagonal numbers: ");
		for(int i=0;i<=50;i++)
			System.out.print(" " +(i*(3*i-1))/2 +" ");
		System.out.println();
	}
	
    /* this method check whether a year is a leap year or not
       a normal year has 356 days.A leap year has 366 days */	
	public static void leapYear(){
		System.out.println();
		System.out.println("please enter a year : ");
		Scanner scann=new Scanner(System.in);
		int y=scann.nextInt();
       int x1=y/1000&10;
	   int x2=y/100%10;
	   int x3=y/10%10;
	   int x4=y%10;
	   int sum=x1+x2+x3+x4;
	   if(sum%4==0)  // Leap years are any year that can be divided by 4
		   System.out.println("the year ( " +y +" ) is leap ");
	   else
		   System.out.println("The year ( " +y +" ) is not leap " );
	   System.out.println();
	}
	
	//this method takes a number n  to displays an n-by-n matrix
	public static void displayNumberAsMatrix(){
		System.out.println("which number do you want to display it as a matrix? ");
		Scanner scann=new Scanner(System.in);
		int a=scann.nextInt();
		int [][]z=new int [a][a];
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				z[i][j]=a;
				System.out.print( z[i][j] +" ");
		    }
		System.out.println();
	    }
	}
	
	//this method calculate the area of a triangle
	public static void areaOfTriangle(){
		System.out.println();
		System.out.println("please enter the base b : ");
		Scanner scann=new Scanner(System.in);
		int b=scann.nextInt();
		System.out.println("please enter the height h : ");
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
		int area=(b*h)/2;
		System.out.println("The area of this Triangle is: " +area);
		System.out.println();
	}
	
	//this method create the area of a pentagon
	public static void areaOfPentagon(){
		System.out.println("please enter the number of sides: ");
		Scanner scann=new Scanner(System.in);
		int s=scann.nextInt();
		System.out.println("please enter the side : ");
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		double area=(s * a * a) / (4 * Math.tan(Math.PI/s));
		System.out.println("The area of this pentagon is: " +area);
	}
		
	//this method display the current date and time
	public static void currentDateAndTime(){
		System.out.println();
		
		Calendar c=Calendar.getInstance();
		System.out.format("The current time and date is : %te %tB , %tY, %tr " ,c,c,c,c);
		System.out.println();
	}
	
	//this method display the middle character of a string
	public static void displayMiddleCharacter(){
		System.out.println();
		System.out.println("please enter a string(one word) to find the middle character: ");
		Scanner scann=new Scanner(System.in);
		String s=scann.nextLine();
		int pos;
		int length;
		if(s.length()%2==0){
			pos=s.length()/2-1;
			length=2;
		}
		else{
			pos=s.length()/2;
			length=1;
		}
		System.out.println("The middle character in ( " +s +" ) is : " +s.substring(pos,pos+length));
		System.out.println();
	}
			
	//this method count all vowels in a string
    public static void countVowelInString(){
        System.out.println("please enter a string to count the vowels: ");
        Scanner scann=new Scanner(System.in);
        String s=scann.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
           if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
		}
        System.out.println("The number of vowels in this string are: " +count);
		System.out.println();
    }
	
	//this method count all words in a string
	public static void countWordsInString(){
		System.out.println("please enter a string to count the words: ");
		Scanner scann=new Scanner(System.in);
		String s=scann.nextLine();
		int count =0;
		if(!(" ".equals(s.substring(s.length()-1)))){
		   for(int i=0;i<s.length();i++){
			  if(s.charAt(i) == ' '){
			   count++;
			  }
		    }
		    count++;
		}
		System.out.println("The number of words are: " +count);
		System.out.println();
	}
	
			
    //main method 
	public static void main(String[]args){
		System.out.println("we are going to find the smallest number ");
		findTheSmallestNumber();
		averageOfNumbers();
		sumOfDigitInInteger();
		displayPentagonalsNumbers();
		leapYear();
		displayNumberAsMatrix();
		areaOfTriangle();
		areaOfPentagon();
		currentDateAndTime();
		displayMiddleCharacter();
		countVowelInString();
		countWordsInString();
	}
}
		 