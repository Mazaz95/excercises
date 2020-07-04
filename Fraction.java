public class Fraction{
	
	int num;
	int denom;
	
	public Fraction(int num,int denom){
		this.num=num;
		this.denom=denom;
		reduce();
	}
	
	public void setNum(int num){
		this.num=num;
	}
	
	public int getNum(){
		return this.num;
	}
	
	public void setDenom(int denom){
		this.denom=denom;
	}
	
	public int getDenom(){
		return this.denom;
	}
	
	public void setValue(int num,int denom){
		this.num=num;
		this.denom=denom;
		reduce();
	}
	
	public String str(){
		return num +"/" +denom;
	}
	
	public int ggt(){
		int a=num;
		int b=denom;
		int h;
		while(b!=0){
			h=a%b;
			a=b;
			b=h;
		}
		return a;
	}
	
	private void reduce(){
		int faktor=ggt();
		num=num/faktor;
		denom=denom/faktor;
	}
	
	public void extend(int amount){
		num=num*amount;
		denom=denom*amount;
		System.out.println(num +"/" +denom);
	}
	
	public Fraction add(Fraction summand){
		num=summand.denom*num;
		summand.num=denom*summand.num;
		denom=denom*summand.denom;
		
		int bruch=num+summand.num;
		
		return new Fraction(bruch,denom);
	}
	
	public Fraction multiply(Fraction multiplicand){
		num=num*multiplicand.num;
		denom=denom*multiplicand.denom;
		
		return new Fraction(num,denom);
	}
	
	public Fraction div(Fraction divisor){
		num=divisor.denom*num;
		denom=divisor.num*denom;
		
		return new Fraction(num,denom);
	}
	
	public Fraction minus(Fraction minuend){
		num=num*minuend.denom;
		minuend.num=minuend.num*denom;
		denom=denom*minuend.denom;
		
		int bruch=num-minuend.num;
		
		return new Fraction(bruch,denom);
	}
}