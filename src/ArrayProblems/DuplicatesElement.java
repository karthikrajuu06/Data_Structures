package ArrayProblems;

public class DuplicatesElement {

	public static void main(String[] args) {
		int arr[]= {10,10,20,30,40,50};
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
			   System.out.println(arr[i] );
			}
			
		}
		//System.out.println("no duplicates found");

	}

}
