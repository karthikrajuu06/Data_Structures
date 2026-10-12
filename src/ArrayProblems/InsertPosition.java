package ArrayProblems;

import java.util.Arrays;

public class InsertPosition {
    public static int searchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; // returns the index where target should be inserted
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6};
        int target = 2;
        
        int position = searchInsert(arr, target);
        System.out.println("Insert position for " + target + " is: " + position);
    }
}
