public class CallByRefernce{
	
	public static void main(String[]args){
		Test ob =new Test(15,20);
		System.out.println("a and b before call : " +ob +" , " +ob);
		ob.math(ob);
		System.out.println("a and b after call : " +ob+" , " +ob);
	}
}
		