package ProblemsonNumber;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		 int Num = sc.nextInt();
		 int temp = Num;
		 int rev = 0;
		 
		 while(Num>0){
			 int digit = Num % 10;
			  rev = rev * 10 + digit;
			  Num = Num / 10;
		 }
			  
			  if(temp== rev) {
				  System.out.println("palindrome");
			  }
			  else {
				  System.out.println("Not palindrome");
			  }
			  
			 
		 

	}

}
