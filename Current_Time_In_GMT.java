import java.util.Calendar;
import java.util.Scanner;
public class Current_Time_In_GMT{
	
	//the main method print the current time in GMT
	public static void main(String[]args){
		Calendar c=Calendar.getInstance();
		System.out.print("please enter the Time in GMT: ");
		Scanner scann=new Scanner(System.in);
		String time=scann.next();
		System.out.println("The Time in GMT is: " +time);
		System.out.format(" cureent time is: %tT " ,c);
	}
}
