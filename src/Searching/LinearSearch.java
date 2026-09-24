package Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int arr [] = new int[n];
		  int target = 12;
		   int index = -1; //element not found 
		   for(int i =0;i<n;i++) {
			   arr[i] = sc.nextInt();
			   
		   }
		   for(int i=0;i<n;i++) {
			   if(arr[i]==target) {
				   index = i;
				   break;
			   }
		   }
		   System.out.println(index!=-1 ? "elementFound: "+ index : "elementNotFound");
		   

	}

}
