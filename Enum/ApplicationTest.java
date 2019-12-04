public class ApplicationTest{
	
	public static void main(String[]args){
		// create new object array from the class BlueRay
		BlueRay [] blueray=new BlueRay[3];
		blueray[0]=new BlueRay("hde",454,"jtd","sgd");
		blueray[1]=new BlueRay("sao",654343453,"ikzt","gt");
		blueray[2]=new BlueRay("sag",3,"ada","wfw");
		
		// create new object from the class Sort
		Sort s=new Sort();
		// call the method sort
		s.sort(SortMode.PREIS,blueray);
		
		//print all the elements from the array blueray according to it's preis
		for(int i=0;i<blueray.length;i++)
			System.out.println(blueray[i].getSortString(SortMode.PREIS));
		System.out.println();
		
		//create new object from the class Book
		Book[] book=new Book[3];
		book[0]=new Book("Ameer","Shaza","Azeen",342,"nelsa");
		book[1]=new Book("Mohanad","Hala","MAi",1,"Reem");
		book[2]=new Book("Laila","Abd","Maria",3243,"Dania");
		
		//create new object array from the class Sort
		//Sort t=new Sort();
		//call the method sort
		Sort.sort(SortMode.NAME,book);
		
		//print all the elements from the array book according to it's name
		for(int i=0;i<book.length;i++)
			System.out.println(book[i].getSortString(SortMode.NAME));
		System.out.println();
		
		//create new object array from the class Cd
		Cd[] cd=new Cd[3];
		cd[0]=new Cd("Ali","Jad","Julia",543,"Mazen");
		cd[1]=new Cd("Eman","Hasan","Aya",32,"Sara");
		cd[2]=new Cd("Saly","Luna","Nahla",7,"Ruba");
		
		//create new object from the class Sort
		Sort r=new Sort();
		//call the method sort
		r.sort(SortMode.ID,cd);
		
		//print all the elements from the array cd according to it's id
		for(int i=0;i<cd.length;i++)
			System.out.println(cd[i].getSortString(SortMode.ID));
	}
}