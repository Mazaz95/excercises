public class Rectangle{
	
	private String color=null;
	private Boolean filled=null;
	private double width;
	private double height;
	
	/**
	 * this a constructor for the class with two parameter
	 */
	public Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	
	/**
	 * this a constructor for the class with four parameter
	 */
	public Rectangle(double width,double height, String color, boolean filled){
		this.width=width;
		this.height=height;
		this.color=color;
		this.filled=filled;
	}
	
	/**
	 * this setter method has no return 
	 */
	 public void setWidth(){
		 this.width=width;
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
	 public double getWidth(){
		 return this.width;
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
	   return width*height;
	}
			  
	/**
	* this method calculate the perimeter of a cylinder
	*/
	public double getPerimeter(){
	   return 2*(width+height);
    }
			   
	/**
	 * this method print all the cylinder information
	 */
	public String toString(){
		return "Rectanglr [ color: " +getColor() +" , filled : " +isFilled() +" , width: " +getWidth() +", height: " +getHeight() +" , area: " +getArea() +" , perimeter: " +getPerimeter() +" ]";
	}
}