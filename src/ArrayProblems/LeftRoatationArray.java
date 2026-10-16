package ArrayProblems;

import java.util.Arrays;

public class LeftRotationArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int k = 2;
        int n = arr.length;

        // Handle cases where k is greater than the array length
        k = k % n;

        // Step 1: Reverse the first k elements (0 to k-1)
        reverse(arr, 0, k - 1);

        // Step 2: Reverse the remaining elements (k to n-1)
        reverse(arr, k, n - 1);

        // Step 3: Reverse the entire array (0 to n-1)
        reverse(arr, 0, n - 1);

        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }

    // Helper method to reverse a sub-array from index 'start' to 'end'
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
