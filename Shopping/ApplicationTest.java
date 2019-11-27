import java.lang.StringBuilder;
import java.math.RoundingMode;
import java.math.BigDecimal;
public class ApplicationTest{
	
	public static void main(String[]args){
		
		Customer c=new Customer("Jado","Jad","Shewr");
		Invoice x=new Invoice(c,150);
		Invoice y=new Invoice(c,257);

		x.setDiscount(11.5);
		y.setDiscount(20);
		
		c.addInvoice(x);
		c.addInvoice(y);
		
		StringBuilder builder=new StringBuilder();
		builder.append(String.format("Your user name is: %s \nYour full name is: %s \nYour id is: %s \n",c.getUserName(),c.getFullName(),x.getId()));
		
		double expectedDiscount=BigDecimal.valueOf(17.25).setScale(2,RoundingMode.HALF_UP).doubleValue();
		double resultedDiscount=BigDecimal.valueOf(x.getDiscount()).setScale(2,RoundingMode.HALF_UP).doubleValue();
		builder.append(String.format("The expected discount is : %s , the resulted discount is: %s , and the result is : %b \n " ,expectedDiscount,resultedDiscount,expectedDiscount==resultedDiscount));
		
		double expectedAmount=BigDecimal.valueOf(132.75).setScale(2,RoundingMode.HALF_UP).doubleValue();
		double resultedAmount=BigDecimal.valueOf(x.getFinalAmount()).setScale(2,RoundingMode.HALF_UP).doubleValue();
		builder.append(String.format("The expected final amount is: %s ,the resulted final amount is: %s , and the result is: %b \n" , expectedAmount,resultedAmount,expectedAmount==resultedAmount));
		
		double expectedDis=BigDecimal.valueOf(51.4).setScale(2,RoundingMode.HALF_UP).doubleValue();
		double resultedDis=BigDecimal.valueOf(y.getDiscount()).setScale(2,RoundingMode.HALF_UP).doubleValue();
		builder.append(String.format("The expected discount is: %s, the resulted discount is : %s , and the result is: %b \n" ,expectedDis,resultedDis,expectedDis==resultedDis));
		
		double expectedFinalAmount=BigDecimal.valueOf(205.6).setScale(2,RoundingMode.HALF_UP).doubleValue();
		double resultedFinalAmount=BigDecimal.valueOf(y.getFinalAmount()).setScale(2,RoundingMode.HALF_UP).doubleValue();
		builder.append(String.format("The expected final amount is: %s, the resulted final amount is: %s, and the result is : %s \n",expectedFinalAmount,resultedFinalAmount,expectedFinalAmount==resultedFinalAmount));
		
		
		double expectedSpend=BigDecimal.valueOf(338.35).setScale(2,RoundingMode.HALF_UP).doubleValue();
		double resultedSpend=BigDecimal.valueOf(c.getTotalSpend()).setScale(2,RoundingMode.HALF_UP).doubleValue();
		builder.append(String.format("The expected total spend is: %s, the resulted total spend is: %s, and the result is: %b \n",expectedSpend,resultedSpend,expectedSpend==resultedSpend));
		System.out.println(builder.toString());
		
		test(c);

	}
	public static void test(Customer c){
		Invoice x=new Invoice(c,150);
		Invoice y=new Invoice(c,257);
		
		int invoicesCount=c.getInvoices().size();
		System.out.println(invoicesCount);
		
	}
		
		
}
