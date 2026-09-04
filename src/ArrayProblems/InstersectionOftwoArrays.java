package ArrayProblems;

public class InstersectionOftwoArrays {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4,5,6};
		int arr1[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			boolean alreadyprint = false;
			
			// duplicate check
			for(int k=0;k<i;k++) {
				if(arr[k]==arr[i]) {
					alreadyprint = true;
					break;
				}
			}
			if(alreadyprint) {
				continue;
				
			}
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
			}
		}
		
	}

}
