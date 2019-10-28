public class Prime{
	
	//this method cheack if the number is prime or not
	public static boolean is_prime(int n){
		if(n<=2)  // 0 and 1 are not prime numbers
			return false;
	    for(int i=2;i<=n/2;i++){
			if(n%i==0)  // prime numbers can divided,without a remainder,only by itself and by 1
				return false;
		}
	    return true;
	}
	
	//main method
	public static void main(String[]args){
		for(int i=2;i<100;i++){
			if(is_prime(i) && is_prime(i+2))
				System.out.printf("( %d , %d ) \n" ,i,i+2);
		}
	}
}
	