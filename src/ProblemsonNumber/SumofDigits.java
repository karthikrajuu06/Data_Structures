package ProblemsonNumber;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int Num = sc.nextInt();
		int sum = 0;
		while(Num>0) {
			int digit = Num%10;
			sum = sum + digit;
			Num = Num/10;
			
		}
		System.out.println(sum);
		

	}

}
