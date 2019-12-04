import java.lang.StringBuilder;
public class Circle extends Shape{
	//this class inheritance the Shape class
	
	private double radius;
	
	//the class constructor with 3 parameter
	public Circle(String color,Boolean filled,double radius){
		super(color,filled);
		this.radius=radius;
	}
	
	//setter method has no return 
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	//getter method return the radius value
	public double getRadius(){
		return this.radius;
	}
	
	//this method return the area value of the Circle
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	//this method return the perimeter value of the Circle
	public double getPerimeter(){
		return 2*Math.PI*radius*radius;
	}
	
	//this method print all the informations of the Circle
	public String toString(){
		StringBuilder builder=new StringBuilder();
		if(getColor()!=null && isFilled()!=null)
			builder.append(String.format("color:%s,filled:%s,area:%s,perimeter:%s",getColor(),isFilled(),getArea(),getPerimeter()));
		else if(getColor()==null && isFilled()==null)
			builder.append(String.format("area: %s,perimeter: %s",getArea(),getPerimeter()));
		else if(getColor()==null)
			builder.append(String.format("filled:%s,area:%s,perimeter:%s",isFilled(),getArea(),getPerimeter()));
		else 
			builder.append(String.format("color:%s,area:%s,perimeter:%s",getColor(),getArea(),getPerimeter()));
		String s="Circle [ "+builder.toString()+" ] ";
		return s;
	}
}
		