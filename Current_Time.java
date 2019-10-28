import java.util.Calendar;
public class Current_Time{
	
	//The main method show us the current time and Date
	public static void main(String[]args){
		Calendar c=Calendar.getInstance();
		System.out.println("The current Date is: ");
		System.out.format("%tB %te ,%tY \n " ,c,c,c);
		System.out.format("%tl : %tM %tp \n" ,c,c,c);
	}
}