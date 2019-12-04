import java.lang.StringBuilder;
public class Cd implements Isortable{
	//this class inheritance the Isortable class
	
	public String albumTitel;
	public String artist;
	public String publisher;
	public int preis;
	public String code;
	
	//constructor of the class with 5 parameter
	public Cd(String albumTitel, String artist, String publisher, int preis,String code){
		this.albumTitel=albumTitel;
		this.artist=artist;
		this.publisher=publisher;
		this.preis=preis;
		this.code=code;
	}
	
	//getter method return the albumtitel
	public String getAlbumTitel(){
		return this.albumTitel;
	}
	
	//getter method return the artist
	public String getArtist(){
		return this.artist;
	}
	
	//getter method return the publisher
	public String getPublisher(){
		return this.publisher;
	}
	
	//getter method return the preis
	public int getPreis(){
		return this.preis;
	}
	
	//getter method return the code
	public String getCode(){
		return this.code;
	}
	
	//@overriding
	//this method returns a specific form from the member of the class
	public String getSortString(SortMode mode){
		StringBuilder builder=new StringBuilder();
		String s="";
		String result="";
		String preis=String.valueOf(this.preis);//this member convert the preis from int to string
		//the for loop add zero to the preis if it's less than 6 numbers
		for(int i=0; i<6-preis.length();i++)
			result=result+0;
		switch (mode){
			// the first situation : NAME
			case NAME:
			builder.append(String.format(",,$ { %s }-${ %s }-${ %s }",getAlbumTitel(),getArtist(),getPublisher()));
			// the second situation : PREIS
			case PREIS:
			builder.append(String.format(",,$ { %s %s } " ,result,getPreis()));
			// the third situation : ID
			case ID:
			builder.append(String.format(",,$ { %s }",getCode()));
		}
		s=builder.toString();
		return s;
	}
}
	
