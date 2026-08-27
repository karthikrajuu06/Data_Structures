package Strings;

public class EvenPositions {

	public static void main(String[] args) {
		String s1 = "object oriented programming ";
		String[] s2  = s1.split(" ");
		for(int i = 0;i<s2.length;i++) {
			
			if(i%2==0) {
				System.out.println(s2[i]);
				
				
			}
			 
		}
		
	}

}
