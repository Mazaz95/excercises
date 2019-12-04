import java.lang.StringBuilder;
public class Square extends Rectangle{
	//this class inheritance the Rectangle class
	
	private double side;
	
	//the class constructor with 3 parameter
	public Square(double side,String color,Boolean filled){
		super(side,side,color,filled);
		
	}
	
	//@overriding
	//this method return the perimeter value of the Square
	public double getPerimeter(){
		return 4*getHeight();
	}
	
	//this method print all the informations of the Square
	public String toString(){
		StringBuilder builder=new StringBuilder();
		if(getColor()!=null && isFilled()!=null)
			builder.append(String.format("color:%s , filled: %s,area: %s,perimeter: %s",getColor(),isFilled(),getArea(),getPerimeter()));
		else if(getColor()==null && isFilled()==null)
			builder.append(String.format("area: %s,perimeter: %s",getArea(),getPerimeter()));
		else if(getColor()==null)
			builder.append(String.format("filled: %s,area:%s,perimeter:%s",isFilled(),getArea(),getPerimeter()));
		else 
			builder.append(String.format("color: %s,area:%s,perimeter:%s",getColor(),getArea(),getPerimeter()));
		String s="Square [ "+builder.toString()+" ]";
		return s;
	}
}