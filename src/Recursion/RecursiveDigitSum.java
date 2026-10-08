package Recursion;

public class RecursiveDigitSum { 
    
    
     static int digitSum(int n) { 
        if (n < 10) { 
            return n; 
        } 
       
        return (n % 10) + digitSum(n / 10);
    } 

    public static void main(String[] args) { 
        int number = 12345;
        int result = digitSum(number);
        
        System.out.println("The sum of digits of " + number + " is: " + result);
    } 
}



