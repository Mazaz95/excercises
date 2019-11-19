import java.lang.StringBuilder;
public class Rectangle extends Shapes{
	
	/**
	 * the superclass is Shapes
	   the subclass is Rectangle
	   **/
	   
	private double width;
	
	/**
	 * this a constructor with three parameter from the superclass Shapes and one parameter from this class
	 **/
	public Rectangle(String color,Boolean filled, double height, double width){
		super(color,filled,height);
		this.width=width;
	}
	
	/**
	 * this method return the area of a Rectangle
	 **/
	public double getArea(){
		return width*getHeight();
	}
	
	/**
	 * this method return the perimeter of a Rectangle
	 **/
	public double getPerimeter(){
		return 2*(width+getHeight());
	}
	
	/**
	 * this method print all the information of a Rectangle
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
		String s="Rectangle [ " +builder.toString()+"]";
		return s;
	}
}