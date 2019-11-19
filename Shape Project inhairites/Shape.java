public class Shape{
	
	private String color;
	private Boolean filled;
	double area;
	double perimeter;
	/**
	 * this a constructor with two parameter
	 **/
	public Shape(String color, Boolean filled){
		this.color=color;
		this.filled=filled;
	}
	
	/**
	 * this setter method has no return 
	 **/
	public void setColor(String color){
		this.color=color;
	}
	
	/**
	 * this getter method return the value of color if it's not null
	 **/
	public String getColor(){
		if(color==null)
			return null;
		else return this.color;
	}
	
	/**
	 * this setter method has no return
	 **/
	public void setFilled(Boolean filled){
		this.filled=filled;
	}
	
	/**
	 * this method return the value of filled if it's not null
	 **/
	public Boolean isFilled(){
		if(filled==null)
			return null;
		else return this.filled;
	}
	
	/**
	 * this method return the Area of a Shape
	 **/
	public double getArea(){
		return area;
	}
	
	/**
	 * thos method return the Perimeter of a Shape
	 **/
	public double getPerimeter(){
		return perimeter;
	}
}