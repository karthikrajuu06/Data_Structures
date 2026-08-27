package Strings; 
import java.util.*;

public class UppercaseandReverse {

	public static void main(String[] args) {
	//	String s = "This is my program in java";
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String [] str = s1.split(" ");
		for(int i  =0;i<str.length;i++) {
			if(i % 2 == 0) {
		  	 str[i]=str[i].toUpperCase();
			}else {
                String rev = " ";

                for (int j = str[i].length() - 1; j >= 0; j--) {
                    rev = rev + str[i].charAt(j);
                    System.out.print(rev);
                }

                if (i < str.length - 1) {
                    System.out.print(" ");

		}
	}
		

	}
		}
}




