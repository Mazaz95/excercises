import java.util.ArrayList;
import java.util.List;
public class Customer{
	
	private String userName;
	private String firstName;
	private String lastName;
	ArrayList <Invoice> invoices=new ArrayList <Invoice>();
	
	//constructor of the class with three parameter
	public Customer(String userName,String firstName,String lastName){
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	//this setter method has no return 
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	//this getter method return the username
	public String getUserName(){
		return this.userName;
	}
	
	//this setter method has no return 
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	//this getter method return the first name 
	public String getFirstName(){
		return this.firstName;
	}
	
	//this setter method has no return 
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	//this getter method return the last name
	public String getLastName(){
		return this.lastName;
	}
	
	//this getter method return the full name
	public String getFullName(){
		return getFirstName() +" " + getLastName();
	}
	
	//this method add all the invoices together
	public void addInvoice(Invoice inv){
		invoices.add(inv);
	}
	
	//this method return the invoices 
	public List <Invoice> getInvoices(){
		return invoices;
	}
	
	//this method calculate the amount of all the invoices
	public double getTotalSpend(){
		double sum=0;
		for(Invoice invoice: invoices){
			sum += invoice.getFinalAmount();
		}
		return sum;
	}
	
}
		
		
		
	