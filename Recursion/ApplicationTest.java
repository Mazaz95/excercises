public class ApplicationTest{
	
	public static void main(String[]args){
		Factorial fac=new Factorial();
		fac.fact(3);
		fac.fact(4);
		fac.fact(5); 
		System.out.println("The factorial of 3 is : " +fac.fact(3));
		System.out.println("The factorial of 4 is: " +fac.fact(4));
		System.out.println("The factorial of 5 is: " +fac.fact(5));
	}
}