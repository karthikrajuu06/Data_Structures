package Sorting;

public class insertionsort {

	public static void insertionSort(int []arr){
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int key = arr[i]; // all elements we should compare 
			
			int j = i-1;
			// move the elements
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j =j-1;
				
			}
			arr[j+1] = key;
			
		}
	}
	public static void main(String[]args) {
		int arr []= {2,5,9,3,7,4,11,10};
	}

}
