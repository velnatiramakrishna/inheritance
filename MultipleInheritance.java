package inheritance;
public class MultipleInheritance {
	 public static void main(String[] args) {
	     Cat myCat = new Cat();
	     
	     //  hear Calling methods from both interfaces
	     myCat.eat();
	     myCat.drive();
	     
	     // Hear i Calling a method specific to the cat class
	     myCat.bark();
	 }
	}

// Hear i Define two interfaces
interface Wild {
 void eat();
}

interface Vehicle {
 void drive();
}

// hear i Implement the interfaces in a class
class Cat implements Wild, Vehicle {

 public void eat() {
     System.out.println("cat is eating.");
 }

 
 public void drive() {
     System.out.println("cat is driving.");
 }

 public void bark() {
     System.out.println("cat is mewao.");
 }
}



