import java.lang.StringBuilder;
public class Square extends Shape{
	/**
	 * the Shape class is the superclass
	   the Square class is the subclass
	  **/
	
	private double side;
	
	
	/**
	 * this a constructor with one parameter from the Square class and two parameter form the     superclass(Shape)
	 **/
	public Square(String color,Boolean filled,double side){
		super(color,filled);
		this.side=side;
	}
	
	/**
	 * this setter method has no return
	 **/
	public void setSide(double side){
		this.side=side;
	}
	
	/**
	 * this getter method return the side value
	 **/
	public double getSide(){
		return this.side;
	}
	
	/**
	 * @overriding
	   this method return the area of a Square
	 **/
	public double getArea(){
		return side*side;
	}
	
	/**
	 * @overriding
	   this method return the perimeter of a Square
	 **/
	public double getPerimeter(){
		return 4*side;
	}
	
	/**
	 * this method print all the information of a square
	 **/
    public String toString(){
		StringBuilder builder=new StringBuilder();
		if(getColor()!=null && isFilled()!=null){
			builder.append(String.format("color : %s , filled : %b ,area: %s ,perimeter: %s",getColor(),isFilled(),getArea(),getPerimeter()));
		}
		else if(getColor()==null && isFilled()==null){
			builder.append(String.format("area : %s ,perimeter : %s",getArea(),getPerimeter()));
		}
		else if (isFilled()==null){ //if the filled is null we will not print it
			 builder.append(String.format(" color: %s ,area : %s , perimeter: %s " ,getColor(),getArea(),getPerimeter()));
		}
		else{ //if the color is null we will not print it
			 builder.append(String.format(" filled: %b ,area : %s , perimeter: %s " ,isFilled(),getArea(),getPerimeter()));
		}
		
		String result="Square ["+builder.toString() +"]";
		return result;
	}
	
}
	
	