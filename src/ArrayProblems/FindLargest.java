package ArrayProblems;

public class FindLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 78, 23, 56, 89, 34};
        
        // Assume the first element is the largest
        int max = numbers[0];
        
        // Loop through the array to find the actual largest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("The largest element in the array is: " + max);
    }
}

