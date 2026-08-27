package Thiskeyword;

class Parent{
	public Parent() {
		this(45);
		
		System.out.println("Parent class Constructor");
	}
	public Parent(int age) {
		this.m1();
		System.out.println("age of parent class consructor " + age);;
	}
	public void m1() {
		System.out.println("parent class mq method 4");
	}
}
public class Child extends  Parent{
	
	public Child() {
	//	super(); // parent class default constructor
		this(48);
		System.out.println("Child class Constructor ");
	}
	public Child (int age) {
		this.m1();
		System.out.println("");
	}

	public static void main(String[] args) {
		

	}

}

