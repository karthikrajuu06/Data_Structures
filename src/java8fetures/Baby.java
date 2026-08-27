package java8fetures;

interface Mom{
	default void sleep() {
		System.out.println("Sleep left dirextion");
		
	}
}
interface Dad{
	default void sleep() {
		System.out.println(" sleep right direction");
		
	}
}


public class Baby implements Dad,Mom {
	@Override
	public void sleep() {
		Dad.super.sleep();
	
	}

	public static void main(String[] args) {
		
		
	}
}
