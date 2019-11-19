import java.lang.StringBuilder;
public class Circle extends Shape{
	
	/**
	 * the superclass is Shape
	   the supclass is Circle
	   **/
	   
	private double radius;
	
	/**
	 * this a constructor with two parameter from the superclass Shape and one parameter from this class
	 **/
	public Circle(String color, Boolean filled, double radius){
		super(color,filled);
		this.radius=radius;
	}
	
	/**
	 * this setter method has no return 
	 **/
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	/**
	 * this getter method return the radius value
	 **/
	public double getRadius(){
		return this.radius;
	}
	 
	/**
	 * @overriding
	   this method return the Area of a Circle
	   **/
	public double getArea(){
        return Math.PI*radius*radius;
	}
     
	/**
	 * @overriding
	   this method return the Perimeter of a Circle
	   **/
    public double getPerimeter(){
        return 2*Math.PI*radius*radius;
	}	
	 /**
	  * this method print all the information of a Circle
	  **/
	public String toString(){
		StringBuilder builder=new StringBuilder();
		if(getColor()!=null && isFilled()!=null){
			builder.append(String.format("color : %s ,filled: %s ,area: %s, perimeter: %s" ,getColor(),isFilled(),getArea(),getPerimeter()));
		}
		else if(getColor()==null && isFilled()==null){
			builder.append(String.format("area : %s ,perimeter : %s",getArea(),getPerimeter()));
		}
		else if(getColor()==null){
			builder.append(String.format("filled: %s , area: %s ,perimeter: %s ",isFilled(),getArea(),getPerimeter()));
		}
		else {
			builder.append(String.format("color: %s , area: %s , perimeter: %s",getColor(),getArea(),getPerimeter()));
		}
		String s="Circle [ " +builder.toString()+"]";
		return s;
	}
}