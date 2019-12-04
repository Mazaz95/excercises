abstract class Shape{
	//the main class
	
	private String color;
	private Boolean filled;
	
	//the class constructor with two parameter
	public Shape(String color,Boolean filled){
		this.color=color;
		this.filled=filled;
	}
	
	//setter method has no return 
	public void setColor(String color){
		this.color=color;
	}
	
	//setter method has no return 
	public void setFilled(Boolean filled){
		this.filled=filled;
	}
	
	//getter method returns null if it's null and the color if not
	public String getColor(){
		if(this.color==null)
			return null;
		return this.color;
	}
	
	//getter method returns false if it's null and true if it's other
	public Boolean isFilled(){
		if(this.filled==null)
			return false;
		return true;
	}
	
	//abstract method calculate the area of the shape
	public abstract double getArea();
	
	//abstract method calculate the perimeter of tha shape
	public abstract double getPerimeter();
	
	//abstract method print all the informations of the shape
	public abstract String toString();
}