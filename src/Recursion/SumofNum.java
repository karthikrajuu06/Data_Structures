package Recursion;

public class SumofNum {

	public static void main(String[] args) {
		int n = 5;  
		
		int result = sum(n);
		System.out.println(result);
	}

	 
	public static int sum(int n) {
		 
		if (n <= 1) {
			return n;
		}
		 
		return n + sum(n - 1);
	}

}

