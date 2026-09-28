package Sorting;

public class Mergesort {
	
	public static void mergeSort(int[]arr,int nofEle) {
		if(nofEle<2) {
			return;
			
		}
		int mid = nofEle/2;
		int leftArr[] = new int[mid];
		int rightArr[] = new int[nofEle-mid];
		 
		// fill the elements before mid
		for(int i=0;i<mid;i++) {
			leftArr[i] = arr[i];
		}
		
		//insert into right Array
		for(int i =0;i<mid;i++) {
			rightArr[i-mid] = arr[i];
		}
		 // left array again dividing small subarray until single element
		mergeSort(leftArr,mid);
		mergeSort(rightArr,nofEle-mid);
		//merge the values
		merge(arr,leftArr,rightArr,mid,nofEle-mid);
		
	}

	private static void merge(int[] arr, int[] leftArr, int[] rightArr, int mid, int i) {
	
		     int i = 0,j=0,k=0;
		     while(i<left && j<right) {
		    	if(leftArr[i]<rightArr[j]) {
		    		
		    	}
		     }
		
	}

	public static void main(String[] args) {
		

	}

}
