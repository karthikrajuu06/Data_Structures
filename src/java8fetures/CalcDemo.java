package java8fetures;

@FunctionalInterface
interface Calc{
	int dquare (int x);
}

class DemoExist{
	public int solved(int val) {
		return val * val;
	}
	
}
public class CalcDemo {
	public static void main(String[] args) {
		Calc c = x->x*x;
		System.out.println(c.dquare(2));
		
		DemoExist de = new DemoExist();
		
		Calc ct = de::solved;
		System.out.println(c.dquare(3));
		

	}

}
