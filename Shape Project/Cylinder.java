import java.lang.Math;
public class Cylinder{
	
	private String color=null;
	private Boolean filled=null;
	private double radius;
	private double height;
	
	/**
	 * this a constructor for the class with two parameter
	 */
	public Cylinder(double radius,double height){
		this.radius=radius;
		this.height=height;
	}
	
	/**
	 * this a constructor for the class with four parameter
	 */
	public Cylinder(double radius,double height, String color, boolean filled){
		this.radius=radius;
		this.height=height;
		this.color=color;
		this.filled=filled;
	}
	
	/**
	 * this setter method has no return 
	 */
	 public void setRadius(){
		 this.radius=radius;
	 }
	 
	 /**
	  * this setter method has no return 
	  */
	  public void setHeight(){
		  this.height=height;
	  }
	  
	 /**
	   * this setter method has no return
	   */
	  public void setColor(){
		   this.color=color;
	  }
	   
	 /**
	   * this setter method has no return 
	  */
	  public void setFilled(){
		this.filled=filled;
	  }
		
	/**
	 * this getter method return the radius value
	 */
	 public double getRadius(){
		 return this.radius;
	 }
		 
	/**
	 * this getter method return the height value
	*/
	public double getHeight(){
		 return this.height;
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
	  * this method check if the Cylinder filled or not
	  * it's return true if it's filled or false if it's not
	  */
	public Boolean isFilled(){
		if(filled!=null)
			return true;
		else return false;
	}
			
	/**
	 * this method calculate the area of a cylinder
	 */
	public double getArea(){
	   return (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
	}
			 
	/**
	 * this method calculate the face area of a cylinder
	 */
	public double getFaceArea(){
	  return Math.PI*radius*radius;
    }
			  
	/**
	* this method calculate the perimeter of a cylinder
	*/
	public double getPerimeter(){
	   return Math.PI*radius*radius*height;
    }
			   
	/**
	 * this method print all the cylinder information
	 */
	public String toString(){
		return "Cylinder [ color: " +getColor() +" , filled : " +isFilled() +" , radius: " +getRadius() +", height: " +getHeight() +" , area: " +getArea() +", Face area: " +getFaceArea() +" , perimeter: " +getPerimeter() +" ]";
	}
}