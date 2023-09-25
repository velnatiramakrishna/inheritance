package inheritance;
	// Parent class
	class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

	// Child class inheriting from Animal
	class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog barks.");
	    }
	}

	public class SingleLevel {
	    public static void main(String[] args) {
	        // Create an instance of the Dog class
	        Dog myDog = new Dog();

	        // Call methods from both the parent and child class
	        myDog.eat(); 
	        myDog.bark();
	    }
	}

