import java.util.Random;
import java.lang.reflect.Method;
public class Invoice{
	
	private int id;
	private Customer customer;
	private double amount;
	private double discount;
	
	public Invoice(Customer customer,double amount){
		this.customer=customer;
		this.amount=amount;
		Random x=new Random();
		id=x.nextInt();
		
	}
	
	public int getId(){
		return id;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public double getDiscount(){
		return discount;
	}
	
	public String getCustomerName(){
		return customer.getFullName();
	}
	
	public void setDiscount(double discount){
		discount=(50*amount)/100;
	}
	
	public double getFinalAmount(){
		double s=(50*amount)/100;
		return s;
	}
}	
		
		