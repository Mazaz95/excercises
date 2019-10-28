public class Body_Mass_Index{
	
	//this method show us the Body Mass Index
	public static void main(String[]args){
		double weight=452*0.45359237;
		double height=72*0.0254;
		double bmi=weight/(height*height);
		
		System.out.println("The Body Mass Index is: " +bmi);
	}
}