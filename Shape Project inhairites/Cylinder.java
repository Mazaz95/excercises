public class Cylinder extends Shapes{
	
	/**
	 * the superclass is Shapes
	   the subclass is Cylinder
	   **/
	   
	private double radius;
	
	/**
	 * this a constructor with three parameter from the superclass Shapes and one parameter from this class
	 **/
	public Cylinder(String color,Boolean filled,double height,double radius){
		super(color,filled,height);
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
	 * this method return the area of a Cylinder
	 **/
	public double getArea(){
		return 2*(Math.PI*radius*radius)+2*(Math.PI*radius*getHeight());
	}
	
	/**
	 * this method return the face area of a cylinder
	 **/
	public double getFaceArea(){
		return Math.PI*radius*radius;
	}
	
	/**
	 * this method return the perimeter of a cylinder
	 **/
	public double getPerimeter(){
		return Math.PI*radius*radius*getHeight();
	}
	
	/**
	 * this method print all the information of a cylinder
	 **/
	public String toString(){
		StringBuilder builder=new StringBuilder();
		if(getColor()!=null && isFilled()!=null){
			builder.append(String.format("color : %s ,filled: %s ,area: %s,face area: %s, perimeter: %s" ,getColor(),isFilled(),getArea(),getFaceArea(),getPerimeter()));
		}
		else if(getColor()==null && isFilled()==null){
			builder.append(String.format("area : %s ,face area : %s ,perimeter : %s",getArea(),getFaceArea(),getPerimeter()));
		}
		else if(getColor()==null){
			builder.append(String.format("filled: %s , area: %s , face area: %s ,perimeter: %s ",isFilled(),getArea(),getFaceArea(),getPerimeter()));
		}
		else {
			builder.append(String.format("color: %s , area: %s , face area: %s , perimeter: %s",getColor(),getArea(),getFaceArea(),getPerimeter()));
		}
		String s="Cylinder [ " +builder.toString()+"]";
		return s;
	}
}