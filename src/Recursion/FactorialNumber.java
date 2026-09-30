package Recursion;

public class FactorialNumber {
	public static int factLoop(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
     // recursion
	public static int factRes(int n) {
		if(n==0) {
			return 1;
		}
		return n*factRes(n-1);
	}
	public static void main(String[] args) {
	System.out.println(factLoop(5));
	System.out.println(factRes(5));

	}

}
