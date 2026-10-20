package Sorting;

import java.util.Arrays;

public class BubbleSort {
    
    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop to compare adjacent elements
            // (n - i - 1) avoids checking already sorted elements at the end
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true; // Mark that a swap occurred
                }
            }
            
            // Optimization: If no elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Driver code to test the algorithm
    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original Array: " + Arrays.toString(data));
        
        bubbleSort(data);
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
