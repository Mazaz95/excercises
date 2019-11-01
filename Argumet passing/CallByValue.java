public class CallByValue{
	
	
	public static void main(String[]args){
         int a=15,b=20;
		Test ob=new Test();
		ob.math(15,20);
		System.out.println("a and b before call : " +a +" , " +b);
		System.out.println("a and b after call : " +a +" ," +b);
	}
}