import java.util.List;
import java.util.ArrayList;
public class Customer{
	
	private String userName;
	private String firstName;
	private String lastName;
	private List<Invoice> invoices = new ArrayList<>();
	
	
	public Customer(String userName,String firstName,String lastName){
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getFullName(){
		return (firstName +" " + lastName);
	}
	
	public void setFirstName(String firstName){
		firstName=firstName;
	}
	
	public void setLastName(String lastName){
		lastName=lastName;
	}
	
	public Invoice addInvoice(){
	//Invoice invToAdd = new Invoice(customer,amount);
    invoices.add(invoice); 
	}
	
	public double getTotalSpend(){
	}
 
		
}
	
	
	
	
	
	