public class ApplicationTest{
	
	public static void main(String[]args){
		
		Fraction f1=new Fraction(3,4);
		Fraction f2=new Fraction(6,12);
		
		System.out.println("Show the Fraction: ");
		System.out.println(f1.str());
		System.out.println(f2.str());
		System.out.println();
		
		System.out.println("Extension Operation: ");
		f1.extend(2);
		f2.extend(5);
		System.out.println();
		
		System.out.println("Addition Operation: ");
		Fraction f3=new Fraction(1,2);
		Fraction f4=new Fraction(2,3);
		Fraction f5=f3.add(f4);
		System.out.println(f5.str());
		System.out.println();
		
		System.out.println("Multiplication Operation: ");
		Fraction f6=new Fraction(5,2);
		Fraction f7=new Fraction(2,3);
		Fraction f8=f6.multiply(f7);
		System.out.println(f8.str());
		System.out.println();
		
		System.out.println("Dividing Operation: ");
		Fraction s1=new Fraction(5,2);
		Fraction s2=new Fraction(2,3);
		Fraction s3=s1.div(s2);
		System.out.println(s3.str());
		System.out.println();
		
		System.out.println("Subtraction Operation: ");
		Fraction s4=new Fraction(6,2);
		Fraction s5=new Fraction(4,3);
		Fraction s6=s4.minus(s5);
		System.out.println(s6.str());
	}
}