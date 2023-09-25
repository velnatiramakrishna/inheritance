package inheritance;

//Parent class
class Motors {
 void start() {
     System.out.println("Vehicle started");
 }

 void stop() {
     System.out.println("Vehicle stopped");
 }
}

//Child class 1
class Car extends Motors {
 void drive() {
     System.out.println("Car is driving");
 }
}

//Child class 2
class Bike extends Car { // Bike inherits from Car
 void ride() {
     System.out.println("Bike is riding");
 }
}

public class MultiLevel {
 public static void main(String[] args) {
     // Create objects of Car and Bike
     Car myCar = new Car();
     Bike myBike = new Bike();

     // Call methods of Vehicle, Car, and Bike
     myCar.start(); // Inherited from Vehicle
     myCar.drive(); // Inherited from Car
     myCar.stop();  // Inherited from Vehicle

     System.out.println(); // Adding a line break for clarity

     myBike.start(); // Inherited from Vehicle
     myBike.drive(); // Inherited from Car
     myBike.ride();  // Inherited from Bike
     myBike.stop();  // Inherited from Vehicle
 }
}

