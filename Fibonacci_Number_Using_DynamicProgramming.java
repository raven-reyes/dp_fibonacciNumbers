
public class Fibonacci_Number_Using_DynamicProgramming {

	public static int DP_Fibonacci_Number(int n){
		int fib [] = new int[n + 1];
		
		fib[0]= 0;
		fib[1]= 1;
		if(n <= 1) {
			return n;
		}
		for(int i = 2; i <= n; i++) {
			fib[i] = fib[i-1] + fib[i -2];
		}
		 return fib [n];
		
	}
	public static void main(String[] args) {
		int n = 20;
		System.out.println(DP_Fibonacci_Number(n));
		

	}

}





