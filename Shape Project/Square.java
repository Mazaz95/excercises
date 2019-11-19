public class Square{
	
	
	private double side;
	
	/**
	 * this a constructor for the class with one parameter
	 */
	
	
	/**
	 * this a constructor for the class with three parameter
	 */
	public Square(String color, Boolean filled, double side){
		super(color,filled);
		this.side=side;
	}
	
	/**
	 * this setter method has no return 
	 *
	
	/**
	 * this setter method has no return
	 */
	
	/**
	 * this setter method has no return
	 */
	public void setSide(double side){
		this.side=side;
	}
	 /**
	  * this getter method return the color value
	
	
	/**
	 * this method check if the square filled or not
	 * return true if it's filled or false if not
	 */
	
	/**
	 * this getter method return the side value
	 */
	public double getSide(){
		return this.side;
	}
	
	/**
	 * this method calculate the area of a square
	 */
	public double area(){
		return side*side;
	}
	
	/**
	 * this method calculate the perimeter of a square
	 */
	public double perimeter(){
		return 4*side;
	}
	
	/**
	 * this method print all of the square information
	 */
	public String toString(){
		return "Square [ color: " +getColor() +" , filled : " +isFilled() +" , side: " +getSide() +" , area: " +area() +" , perimeter: " +perimeter() +" ]";
	}
}
	
	
	