public class Speed{
	
	//this method appear the speed in m/s , km/h and mi/h
	public static void main(String[]args){
		float distance=2500;
		float hour=5*3600;
		float minutes=56*60;
		float seconds=23+hour+minutes;
		float speed_ms=distance/seconds;
		float speed_kmh=(distance*0.001f)/(seconds/3600f);
		float speed_mih=speed_kmh/1.609f;
		System.out.println("Your speed in meters/second is : " +speed_ms);
		System.out.println("Your speed in km/h is : " +speed_kmh);
		System.out.println("Your speed in miles/h is : " +speed_mih);
	}
}
		