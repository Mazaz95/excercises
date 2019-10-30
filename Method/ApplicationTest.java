public class ApplicationTest{
	
	//this method find the smallest number between three numbers
	public static void findingTheSmallestNumber(){
		int n1=25;
		int n2=55;
		int n3=13;
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
		int m1=25;
		int m2=45;
		int m3=65;
		int sum=m1+m2+m3;
		int avg=sum/3;
		System.out.println("The average of these numbers is : " +avg);
		System.out.println();
	}
	
	//this method compute the sum of the digits in an integer
	public static void sumOfDigitInInteger(){
		int x=251;
		int y1=x/100%10;
		int y2=x/10%10;
		int y3=x%10;
		int sum=y1+y2+y3;
		System.out.println("The sum of ( " +x +" ) is: " +sum );
		System.out.println();
	}
	
	 /* this method check whether a year is a leap year or not
       a normal year has 356 days.A leap year has 366 days */	
	public static void leapYear(){
		int y=2019;
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
		int [][]z=new int [10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				z[i][j]=10;
				System.out.print( z[i][j] +" ");
		    }
		System.out.println();
	    }
	}
	
	//this method calculate the area of a triangle
	public static void areaOfTriangle(){
		int b=10;
		int h=3;
		int area=(b*h)/2;
		System.out.println("The area of this Triangle is: " +area);
		System.out.println();
	}
	
	//this method create the area of a pentagon
	public static void areaOfPentagon(){
		int s=5;
		double a=6;
		double area=(s * a * a) / (4 * Math.tan(Math.PI/s));
		System.out.println("The area of this pentagon is: " +area);
		System.out.println();
	}
	
	//this method display the middle character of a string
	public static void displayMiddleCharacter(){
		String s="Java";
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
		String s="w3resource";
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
		String s="The quick brown fox jumps over the lazy dog.";
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
	
	public static void main(String[]args){
		findingTheSmallestNumber();
		averageOfNumbers();
		sumOfDigitInInteger();
		leapYear();
		displayNumberAsMatrix();
		areaOfTriangle();
		areaOfPentagon();
		displayMiddleCharacter();
		countVowelInString();
		countWordsInString();
	}
  
}
		