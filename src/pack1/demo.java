package pack1;

public class demo {
	class Parent {
		private void m2() {
			System.out.println("parent class m2 method");
		}
	}
	public class Employee  extends Parent{
		private void m1() {
			System.out.println("i am from employee m1 methods");
		}
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.m1();
		
		
	}

}
