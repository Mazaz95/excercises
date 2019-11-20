import java.lang.StringBuilder;
import java.math.RoundingMode;
import java.math.BigDecimal;
public class ApplicationTest{
	
	public static void main(String[]args){
		Customer c=new Customer("Mazaz","Muazaz","Alikhwan");
		Invoice x=new Invoice(c,399.95);
		System.out.println("The Discount value is: " +x.setDiscount(15.5));
		
		StringBuilder builder=new StringBuilder();
		builder.append(String.format("Your full Name is: %s, the Username is: %s and your ID is: %s \n",c.getFullName(),c.getUserName(),x.getId()));
		double expectedDiscount=BigDecimal.valueOf(61.99225).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double resultedDiscount=BigDecimal.valueOf(x.getDiscount()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		builder.append(String.format("The expected get Discount is: %s ,the got Discount is: %s , and the result is: %b \n",expectedDiscount,resultedDiscount,expectedDiscount==resultedDiscount));
		double expectedFinalAmount=BigDecimal.valueOf(337,9577).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double resultedFinalAmount=BigDecimal.valueOf(x.getFinalAmount()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		builder.append(String.format("The expected Final amount is: %s ,the got final amount is: %s, and the result is : %b \n ",expectedFinalAmount,resultedFinalAmount,expectedFinalAmount==resultedFinalAmount));
		System.out.println(builder.toString());
	}
}