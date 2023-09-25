package inheritance;


	// Base class
	class Bajaj {
	    void display() {
	        System.out.println("This is a Vehicle.");
	    }
	}

	// Subclass Car inherits from Vehicle
	class van extends Bajaj {
	    void display() {
	        System.out.println("This is a Car.");
	    }
	}

	// Subclass Motorcycle inherits from Vehicle
	class Motorcycle extends Bajaj {
	    void display() {
	        System.out.println("This is a Motorcycle.");
	    }
	}

	public class Hierarchical_inheritance {
	    public static void main(String[] args) {
	    	Bajaj vehicle = new Bajaj();
	        van v = new van();
	        Motorcycle motorcycle = new Motorcycle();

	        vehicle.display();      // hear i Calls the display method of the Bajaj class
	        v.display();          // hear also i Calls same like the display method of the van class
	        motorcycle.display();    //hear i  Calls the display method of the Motorcycle class
	    }
	}



