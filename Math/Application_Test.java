public class Application_Test{
	
	//1- Write a Java program to round up the result of integer division.
	public static void round(){
		int theory_mark=350;
		int practical_mark=90;
		int total_mark=500;
		int precentage_of_mark=((theory_mark+practical_mark)*100)/total_mark;
		System.out.println("precentage of mark: " +precentage_of_mark +"%");
		System.out.println();
	}
	
	//3-Write a Java program to test if a double number is an integer.
	public static void suchen(){
		double x=5.4444;
		if(x%1==0)
			System.out.println("The number is'nt double ");
		else
			System.out.println("The number is double");
		System.out.println();
	}
	
	//2-Write a Java program to get whole and fractional parts from a double value.
	public static void parting(){
		double x=12.56;
		double fractional_part=x%1;
		double integral_part=x-fractional_part;
		System.out.println("The fractional part is: " +fractional_part);
		System.out.println("The integral part is: " +integral_part);
		System.out.println();
	}
	
	//11- Write a Java program to accept two integers and return true if the either one is 15 or if their sum or difference is 15.
	public static void accept(){
		int x1=30;
		int x2=45;
		System.out.println("The result is: " +is_true(x1,x2));
		System.out.println();
	}
	public static boolean is_true(int x1,int x2){
		if(x1==15 || x2==15)
			return true;
		else if((x1+x2)==15 || Math.abs(x1-x2)==15)
			return true;
		else
			return false;
	}
		
    //9- Write a Java program to convert a float value to absolute value.
	public static void convert(){
		float f=-36.432f;
		System.out.println(Math.abs(f));
		System.out.println();
	}
	
	//8- Write a Java program to convert an integer value to absolute value.
	public static void convert2(){
		int x=-10;
		System.out.println(Math.abs(x));
	}
	
	//main method
	public static void main(String[]args){
		round();
		suchen();
		parting();
		accept();
		convert();
		convert2();
	}
}