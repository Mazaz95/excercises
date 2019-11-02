public class Testing{
		int a,b;
	
	
	//class constructor with two parameter
    Testing(int i,int j){
		a=i;
		b=j;
	}
	
	// pass an object
	public void math(Testing o){
		o.a*=2;
		o.b/=2;
	}
}
	