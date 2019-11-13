public class Square{
	
	private String color=null;
	private Boolean filled=null;
	private double side;
	
	/**
	 * this a constructor for the class with one parameter
	 */
	public Square(double side){
		this.side=side;
	}
	
	/**
	 * this a constructor for the class with three parameter
	 */
	public Square(String color, boolean filled, double side){
		this.color=color;
		this.filled=filled;
		this.side=side;
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
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	
	/**
	 * this setter method has no return
	 */
	public void setSide(double side){
		this.side=side;
	}
	 /**
	  * this getter method return the color value
	  */
	public String getColor(){
		if(color!=null)
			return this.color;
		else return null;
	}
	
	/**
	 * this method check if the square filled or not
	 * return true if it's filled or false if not
	 */
	public boolean isFilled(){
		if(filled!=null)
			return true;
		else return false;
	}
	
	/**
	 * this getter method return the side value
	 */
	public double getSide(){
		return this.side;
	}
	
	/**
	 * this method calculate the area of a square
	 */
	public double getArea(){
		return side*side;
	}
	
	/**
	 * this method calculate the perimeter of a square
	 */
	public double getPerimeter(){
		return 4*side;
	}
	
	/**
	 * this method print all of the square information
	 */
	public String toString(){
		return "Square [ color: " +getColor() +" , filled : " +isFilled() +" , side: " +getSide() +" , area: " +getArea() +" , perimeter: " +getPerimeter();
	}
}
	
	
	