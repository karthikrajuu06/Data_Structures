package Sorting;

import java.util.Arrays;

public class Mergesort {
    public static void mergeSort(int[] arr, int nofEle) {
        if (nofEle < 2) {
            return;
        }
        int mid = nofEle / 2;
        int leftArr[] = new int[mid];
        int rightArr[] = new int[nofEle - mid];

        // Fill elements into the left array
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        // Fill elements into the right array
        for (int i = mid; i < nofEle; i++) {
            rightArr[i - mid] = arr[i];
        }

        // Recursively divide both halves
        mergeSort(leftArr, mid);
        mergeSort(rightArr, nofEle - mid);

        // Merge the sorted halves back into arr
        merge(arr, leftArr, rightArr, mid, nofEle - mid);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr, int leftSize, int rightSize) {
        int i = 0, j = 0, k = 0;

        // Compare elements from leftArr and rightArr and put the smaller one into arr
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements of leftArr, if any
        while (i < leftSize) {
            arr[k++] = leftArr[i++];
        }

        // Copy remaining elements of rightArr, if any
        while (j < rightSize) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 8, 1, 6, 3};
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
