public class CallByRefernce{
	
	public static void main(String[]args){
		Testing ob =new Testing(15,20);
		System.out.println("a and b before call : " +ob.a +" , " +ob.b);
		ob.math(ob);
		System.out.println("a and b after call : " +ob.a+" , " +ob.b);
	}
}
		