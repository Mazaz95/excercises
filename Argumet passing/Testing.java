public class Testing{
		int a,b;
	
	
	//class constructor with two parameter
    Test(int i,int j){
		a=i;
		b=j;
	}
	
	// pass an object
	public void math(Test o){
		o.a*=2;
		o.b/=2;
	}
}
	