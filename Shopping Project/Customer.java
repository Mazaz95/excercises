import java.util.HashSet;
import java.util.Set;
public class Customer{
	
	private String userName;
	private String firstName;
	private String lastName;
	Set <Invoice> invoices=new HashSet <Invoice>();
	
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
	
	//this getter method return the full name (first and last)
	public String getFullName(){
		return getFirstName() +" " +getLastName();
	}
	
	//this method add all the invoices together
	public void addInvoice(Invoice invoiceToAdd){
		invoices.add(invoiceToAdd);
	}
	
}
	