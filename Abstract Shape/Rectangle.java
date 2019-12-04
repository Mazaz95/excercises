import java.lang.StringBuilder;
public class Rectangle extends Shape{
	// this class inheritance the Shape class
	
	private double width;
	private double height;
	
	//the class constructor with 4 parameter
	public Rectangle(double width, double height, String color, Boolean filled){
		super(color,filled);
		this.width=width;
		this.height=height;
	}
	
	//setter method has no return 
	public void setWidth(double width){
		this.width=width;
	}
	
	//setter method has no return 
	public void setHeight(double height){
		this.height=height;
	}
	
	//getter method return the width value
	public double getWidth(){
		return this.width;
	}
	
	//getter method return the height value
	public double getHeight(){
		return this.height;
	}
	
	//this method return the area of the Rectangle
	public double getArea(){
		return width*height;
	}
	
	//this method return the perimeter of the Rectangle
	public double getPerimeter(){
		return 2*(width*height);
	}
	
	//this method return all the informations of the Rectangle
	public String toString(){
		StringBuilder builder=new StringBuilder();
		if(getColor()!=null && isFilled()!=null)
		builder.append(String.format("color: %s,filled:%s,area:%s, perimeter: %s ",getColor(),isFilled(),getArea(),getPerimeter()));
		else if(getColor()==null)
		builder.append(String.format(" filled: % s,area:%s,perimeter: %s",isFilled(),getArea(),getPerimeter()));
		else if(isFilled()==null)
		builder.append(String.format(" color: %s,area:%s,perimeter:%s ",getColor(),getArea(),getPerimeter()));
	    else 
			builder.append(String.format("color: %s , area: %s , perimeter: %s",getColor(),getArea(),getPerimeter()));
		String s="Rectangle [ " +builder.toString() +" ]";
		return s;
	}
}