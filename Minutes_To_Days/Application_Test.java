public class Application_Test{
	
	public static void main(String[]args){
		int minutes1=1520;
		int minutes2=28983;
		int days1=minutes1/1440;
		int hours1=(minutes1%1440)/60;
		int days2=minutes2/1440;
		int hours2=(minutes2%1440)/60;
		System.out.println(" 1520 minutes are: " +days1 + " days and " +" : " +hours1 +" hours ");
		System.out.println("28983 minutes are: " +days2 +" days and " +" : " +hours2 +" hours ");
	}
}
	
	