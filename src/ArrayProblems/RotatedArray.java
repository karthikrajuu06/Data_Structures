package ArrayProblems;

import java.util.Scanner;

public class RotatedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int arr[]= new int [n];
		 for(int i=0;i<n;i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 for(int j=0;j<3;j++) {    
			 int temp = arr[n-1];    // j is tells number of rotations 
			 for(int i=n-1;i>0;i--) {
				 arr[i] = arr[i-1];
			 }
				 arr[0]=temp;
		 }
		 
		 for(int i=0; i<n; i++) {
			 System.out.println(arr[i]);
		 }

	}

}
