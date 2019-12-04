import java.lang.StringBuilder;
public class Book implements Isortable{
	//this class inheritance the Isortable class
	
	public String titel;
	public String author;
	public String publisher;
	public int preis;
	public String isbn;
	
	// constructor of the class with 5 parameter
	public Book(String titel, String author, String publisher, int preis, String isbn){
		this.titel=titel;
		this.author=author;
		this.publisher=publisher;
		this.preis=preis;
		this.isbn=isbn;
	}
	
	//getter method return the titel
	public String getTitel(){
		return this.titel;
	}
	
	//getter method return the author
	public String getAuthor(){
		return this.author;
	}
	
	//getter method return the publisher
	public String getPublisher(){
		return this.publisher;
	}
	
	//getter method return the preis
	public int getPreis(){
		return this.preis;
	}
	
	// getter method returns the value of isbn
	public String getIsbn(){
		return this.isbn;
	}
	//@overriding
	// this method returns specific form from the member of the class
	public String getSortString(SortMode mode){
		StringBuilder builder=new StringBuilder();
		String s="";
		String preis=String.valueOf(this.preis);// this member convert the preis from int to string
		String result="";
		// the for loop add zero to the preis if it's less than 6 numbers
		for(int i=0;i<6-preis.length();i++)
			result=result+0;
		switch (mode){
			// the first situation : name
			case NAME:
			builder.append(String.format(",,${ %s }-${ %s }-${ %s }",getTitel(),getAuthor(),getPublisher()));
			// the second situation : preis
			case PREIS:
			builder.append(String.format(",,$ {%s %s}",result,getPreis()));
			// the third situation : id
			case ID:
			builder.append(String.format(",,$ { %s }",getIsbn()));
		}
		s=builder.toString();
		return s;
	}
}
		

	
	
	
	
	
	