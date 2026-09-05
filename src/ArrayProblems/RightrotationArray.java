package ArrayProblems;

public class RightrotationArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int k = 2;
		int n = arr.length; 
		
		for(int r = 1;r<=k;r++) {
			int temp = arr[n-1];
			   for(int i=n-1;i>0;i--) {
				arr[i]=arr[i-1];
				
			}
			arr[0] = temp;
		}
		for(int x : arr) {
			System.out.println(x);
		}
		
	}

}
