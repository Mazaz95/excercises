public class Cylinder extends Circle{
	//this class inheritance the circle class
	private double height;
	
	//the class constructor with 4 parameter
	public Cylinder(String color,Boolean filled,double radius,double height){
		super(color,filled,radius);
		this.height=height;
	}
	
	//setter method has no return 
	public void setHeight(double height){
		this.height=height;
	}
	
	//getter method return the height value
	public double getHeight(){
		return this.height;
	}
	
	//overriding
	//this method return the area value of the cylinder
	public double getArea(){
		return 2*(Math.PI*getRadius()*getRadius())+2*(Math.PI*getRadius()*height);
	}
	
	//overriding
	//this method return the perimeter value of the Cylinder
	public double getPerimeter(){
		return Math.PI*getRadius()*getRadius()*height;
	}
	
	//this method print all the informations of the Cylinder
	public String toString(){
		StringBuilder builder=new StringBuilder();
		if(getColor()!=null && isFilled()!=null)
			builder.append(String.format("color:%s,filled: %s,area: %s,perimeter: %s ",getColor(),isFilled(),getArea(),getPerimeter()));
		else if(getColor()==null && isFilled()==null)
			builder.append(String.format("area: %s, perimeter: %s ",getArea(),getPerimeter()));
		else if(getColor()==null)
			builder.append(String.format("filled: %s,area:%s, perimeter: %s",isFilled(),getArea(),getPerimeter()));
		else
			builder.append(String.format("color: %s, area: %s,perimeter: %s",getColor(),getArea(),getPerimeter()));
		String s="Cylinder [ " +builder.toString()+" ]";
		return s;
	}
}
	
	