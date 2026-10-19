package Polymorphism;

public class Calculator  {

	// Parent class demonstrating Runtime Polymorphism
	class Animal {
	    // Overridden method
	    public void makeSound() {
	        System.out.println("The animal makes a sound");
	    }
	}

	// Subclass overriding the parent method
	class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("The dog barks: Woof Woof!");
	    }
	}

	// Subclass overriding the parent method
	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("The cat meows: Meow Meow!");
	    }
	}

	// Utility class demonstrating Compile-time Polymorphism (Method Overloading)
	class Calculator {
	    // Overloaded method: takes two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Overloaded method: takes three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Overloaded method: takes two doubles
	    public double add(double a, double b) {
	        return a + b;
	    }
	}

	// Main class to execute the program
	public class PolymorphismDemo {
	    public static void main(String[] args) {
	        
	        // --- 1. DEMONSTRATING COMPILE-TIME POLYMORPHISM (Method Overloading) ---
	        System.out.println("--- Compile-time Polymorphism ---");
	        Calculator calc = new Calculator();
	        
	        // The compiler resolves which method to call based on the arguments provided
	        System.out.println("Sum of 2 ints: " + calc.add(5, 10));          // Calls add(int, int)
	        System.out.println("Sum of 3 ints: " + calc.add(5, 10, 15));      // Calls add(int, int, int)
	        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));    // Calls add(double, double)
	        System.out.println();

	        
	        // --- 2. DEMONSTRATING RUNTIME POLYMORPHISM (Method Overriding) ---
	        System.out.println("--- Runtime Polymorphism ---");
	        
	        // Using parent class references to point to subclass objects
	        Animal myAnimal = new Animal();
	        Animal myDog = new Dog();
	        Animal myCat = new Cat();
	        
	        // The Java Virtual Machine (JVM) determines which method to execute at runtime 
	        // based on the actual object type, not the reference type.
	        myAnimal.makeSound(); 
	        myDog.makeSound();    
	        myCat.makeSound();    
	    }
	}

}
