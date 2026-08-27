package PracticeclassAssignments;
import java.util.*;
public class MaxdiffOf2elements {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i  =0;i<n;i++) {
			arr[i] = sc.nextInt();
				
		}*/
		
		int dif = 0;
		int num = 0;
		 int arr[] = {12,23,24,1};
		 
		 for(int i  =0;i<arr.length;i++) {
			 for(int j =0;j<arr.length;j++) {
				 dif = arr[i]-arr[j];
			 }if(dif>num) {
				 num = dif;
			 }
		 }
		 System.out.println(num);
	}


}
