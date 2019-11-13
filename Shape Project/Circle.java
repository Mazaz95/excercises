import java.lang.Math;
public class Circle{
	
	private String color=null;
	private Boolean filled=null;
	private double radius;
	
	/**
	 * this a constructor for the class with one parameter
	 */
	public Circle(double radius){
		this.radius=radius;
	}
	
	/**
	 * this a constructor with three parameter
	 */
	public Circle(double radius, String color, boolean filled){
		this.radius=radius;
		this.color=color;
		this.filled=filled;
	}
	
	/**
	 * this setter method has no return
	 */
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	/**
	 * this setter method has no return 
	 */
	public void setColor(String color){
		this.color=color;
	}
	
	/** 
	 * this setter method has no return
	 */
	public void setFilled(Boolean filled){
		this.filled=filled;
	}
	
	/** 
	 * this getter method return radius value
	 */
	public double getRadius(){
		return this.radius;
	}
	
	/**
	 * this getter method return color value
	 */
	public String getColor(){
	  if(color!=null)
		  return this.color;
	  else return null;
	}
	 /**
	  * this method check if the circle filled or not
	  * return true if it's filled or false if it's not
	  */
	public boolean isFilled(){
		if(filled!=null)
		   return true;
	   else return false;
	}
	/**
	 * this method calculate the area of a circle
	 */
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	/**
	 * this method calculate the perimeter of a circle
	 */
	public double getPerimeter(){
		return 2*Math.PI*radius*radius;
	}
	
	/**
	 * this method print the circle information
	 */
	public String toString(){
		return "Circle [ color: " +getColor() +" , filled : " +isFilled() +" , radius: " +getRadius() +" , area: " +getArea() +" , perimeter: " +getPerimeter();
	}
}
	
	