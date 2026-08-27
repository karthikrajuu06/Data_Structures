package java8fetures;

  interface employee{
	  void work();
	  
	  static void companyName() {
		  System.out.println("CapGate");
	  }
  }
  
  class Developer implements employee{
	@Override
	public void work() {
		System.out.println("handliing some bugg");
		
	}
	  
  }

public class Companyy {
	public static void mamainin(String[] args) {
		Developer de = new Developer();
		de.work();
		

	}

}
