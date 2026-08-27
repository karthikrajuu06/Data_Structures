package java8fetures;
interface A{
	void m1();
	public default void sleeping() {
		System.out.println("Sleeping with dream");
	}
}
public class Demo implements A {

	@Override
	public void m1() {
		System.out.println("eating in the class");
	}
	public void sleeping() {
		System.out.println("sleeping with dreamzz along with eating ");
	}
     public static void main(String[] args) {
    	 Demo d = new Demo();
    	 d.m1();
    	 d.sleeping();
		
	}

}
