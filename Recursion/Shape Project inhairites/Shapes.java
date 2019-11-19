public class Shapes{
	
	private String color;
	private Boolean filled;
	private double height;
	
	/**
	 * this a construcotr with three parameter
	 **/
	public Shapes(String color,Boolean filled,double height){
		this.color=color;
		this.filled=filled;
		this.height=height;
	}
	
	/**
	 * this setter method has no return
	 **/
	public void setColor(String color){
		this.color=color;
	}
	
	/**
	 * this getter method return the value of color
	 **/
	public String getColor(){
		return this.color;
	}
	
	/**
	 * this setter method has no return
	 **/
	public void setFilled(Boolean filled){
		this.filled=filled;
	}
	
	/**
	 * this getter method return the value of a filled
	 **/
	public Boolean isFilled(){
		return this.filled;
	}
	
	/**
	 * this settter method has no return
	 **/
	public void setHeight(double height){
		this.height=height;
	}
	
	/**
	 * this getter method return the value of the height
	 **/
	public double getHeight(){
		return this.height;
	}
}