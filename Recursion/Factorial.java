public class Factorial{
	
	//this method find the factorial of a number
	public int fact(int i){
		int result;
		if(i==1) return 1;
	    else result=fact(i-1)*i;
		return result;
	}
}