public class Box{
	
	double width;
	double hieght;
	double depth;
	
	//class constructor without parameter
	Box(){
		width=-1;
		hieght=-1;
		depth=-1;
	}
	
	//class constructor with three double parameter
	Box(double w,double h,double d){
		width=w;
		hieght=h;
		depth=d;
	}
	
	//class constructor with one double parameter
	Box(double len){
		width=hieght=depth=len;
	}
	
	//this method return the result of multiplying the three given variable
	public double volume(){
		return width*hieght*depth;
	}
}