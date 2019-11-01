public class Main{
	
	//main method
	public static void main(String[]args){
		//create boxes using the various constructors
		Box myBox=new Box();
		Box yourBox=new Box(10,20,15);
		Box hisBox=new Box(7);
		
		double vol;
		
		//get volume of first box
		vol=myBox.volume();
		System.out.println("volume of myBox is : " +vol);
		
		//get volume of second box
		vol=yourBox.volume();
		System.out.println("volume of yourBox is : " +vol);
		
		//get volume of third box
		vol=hisBox.volume();
		System.out.println("volume of hisBox is : " +vol);
		
	}
}