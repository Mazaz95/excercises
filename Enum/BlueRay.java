import java.lang.StringBuilder;
public class BlueRay implements Isortable{
	// this class inheritance the Isortable class
	
	public String titel;
	public int preis;
	public String publisher;
	public String code;
	
	// the constructor of this class with four parameter
	public BlueRay(String titel, int preis, String publisher, String code){
		this.titel=titel;
		this.preis=preis;
		this.publisher=publisher;
		this.code=code;
	}
	
	// getter method returns the value of the titel
	public String getTitel(){
		return this.titel;
	}
	
	// getter method returns the value of the preis
	public int getPreis(){
		return this.preis;
	}
	
	// getter method returns the value of the publisher
	public String getPublisher(){
		return this.publisher;
	}
	
	// getter method returns the value of the code
	public String getCode(){
		return this.code;
	}
	
	//@overriding
	// this method returns specific form from the member of the class
	public String getSortString(SortMode mode){
		StringBuilder builder=new StringBuilder();
		String s="";
		String result="";
		String preis=String.valueOf(this.preis); //this member convert the preis from int to string
		// this for loop add zero to the preis if it's less than 6 numbers
		for(int i=0;i<6-preis.length();i++)
			result=result+0;
			
		switch(mode){
			// the first situation: name
			case NAME:
		    builder.append(String.format(",,$ { %s } - $ { %s } '' " ,getTitel(),getPublisher()));
		    break;
			// the second situation : preis
			case PREIS:
			builder.append(String.format(",, $ { %s %s } ''",result,getPreis()));
			break;
			// the third situation : id
			case ID:
			builder.append(String.format(",, $ { %s } ''",getCode()));
		}
		return s= builder.toString();
	}
}
	
		
