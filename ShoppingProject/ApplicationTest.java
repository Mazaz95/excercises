public class ApplicationTest{
	
	public static void main(String[]arg){
		Customer kunde=new Customer("sam","samer","samsam");
		Invoice ware=new Invoice(customer,100);
		System.out.println(kunde.getFullName());
		System.out.println(kunde.addInvoice());
		//System.out.println(kunde.getTotalSpend());
		System.out.println(ware.getCustomerName());
		
		//System.out.println(ware.getFinalAmount());
		
	}
}