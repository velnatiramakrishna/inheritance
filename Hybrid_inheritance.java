package inheritance;



	// hear i Define a parent class as jangal
	class Jangal {
	    void All() {
	        System.out.println("Jangal");
	    }

		public void High() {
			
		}
	}

	// Define an interface for flying behavior
	interface Tree {
	    void green();
	}

	// Define an interface for swimming behavior
	interface leacks {
	    void swim();
	}

	// Create a child class that inherits from jangal and implements Hills and trees interfaces
	class Hills extends Jangal implements Tree {
	    @Override
	    void All() {
	        System.out.println("Jangal have all kinds of trees and leackes and founds and hills");
	    }

	    @Override
	    public void High() {
	        System.out.println("Hills is very high");
	    }

		@Override
		public void green() {
			System.out.println("the trees are very greeny");
		}
	}

	// Create another child class that implements leacks interface
	class Fish implements leacks {
	    @Override
	    public void swim() {
	        System.out.println("Fish is swims in leacks");
	    }
	}

	public class Hybrid_inheritance {
	    public static void main(String[] args) {
	    	Hills h = new Hills();
	        h.green(); // Calls Bird's eat method
	        h.High(); // Calls Bird's fly method

	        Fish f = new Fish();
	        f.swim(); // Calls Fish's swim method
	    }
	}

