package ArrayProblems;

public class RightOccurenceEle {

	public static void main(String[] args) {
		int arr[] = {1,2,2,2,2,3,4,5};
		 int target = 2;
		 int left = 0;
		 int num  = -1;
		 int right = arr.length-1;
		while (left<=right) {
			int mid = (left + right)/2;
			
			if(arr[mid]==target) {
				num = mid;
				left = mid + 1; // go to left to find first occur
				
			}else if(target<arr[mid]) {
				 right = mid-1;
				 
			}else {
				left = mid-1;
				
			}	
		}
		System.out.println(num);
	}

}
