import java.util.Random;
public class Invoice{
	
	private int id;
	private Customer customer;
	private double amount;
	private double discount;
	
	/**
	 * This is the Constructor of the class with two parameter 
	   One of the paramter typ is same as the other class
	   Generate ID Random between 1 and 999
	   This will generate a number between 0 and 998 and add 1 to the result which will make the range of the generated value as 1 to 999.
	   **/
	
	public Invoice(Customer customer, double amount){
		this.customer=customer;
		this.amount=amount;
		Random rand=new Random();
		int id=rand.nextInt(998)+1;
		this.id=id;
	}
	
	// this getter method return the value of the ID
	public int getId(){
		return this.id;
	}
	
	//this method return the customer info
	public Customer getCustomer(){
		return this.customer;
	}
	
	//this method return the amount value
	public double getAmount(){
		return this.amount;
	}
	
	//in this method we give a value as paramter to the discount
	public void setDiscount(double discount){
		this.discount=discount;
	}
	
	/**
	 * in this method we calculate the discount
	   when it's zero that's meaning there isn't discount
	   **/
	public double getDiscount(){
		if(discount==0)
			return 0;
		return (amount*discount)/100;
	}
	
	//this method return the customer name
	public String getCustomerFullName(){
		return customer.getFullName();
	}
	
	// in this method we calculate the finale price
	public double getFinalAmount(){
		return getAmount()-getDiscount();
	}
	
}