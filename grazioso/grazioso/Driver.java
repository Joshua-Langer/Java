//Modifications made by Joshua Langer 6/6/2020
import java.util.Scanner; //Import Scanner Function to allow input from user.

public class Driver {

    public static void main(String[] args) {

        // Instance variables
    	Scanner sc = new Scanner(System.in);
    	char input;
        // Create New Dog - Implemented by Joshua Langer
    	Dog dog = new Dog();
        // Create New Monkey - Implemented by Joshua Langer
    	Monkey monkey = new Monkey();
    	
    	System.out.println("Please input a Character for what you would like to do: ");
    	System.out.println("N - New Process Request");
    	System.out.println("U - Update Existing Animal-NYI");
    	System.out.println("D - Display All Animals-NYI");
    	System.out.println("A - Add New Animal-NYI");
    	System.out.println("P - Process Out an Animal-NYI");
    	System.out.println("I - Display In-Service Animal Information-NYI");
    	System.out.println("R - Display Agency Reports-NYI");
    	//Capture Input
    	input = sc.next().charAt(0);
    	//Decide what method is called
    	if (input == 'N') {
    		NewRequest();
    	}
    	
    }
        // Method to process request for a rescue animal
    	static void NewRequest() {
    		Scanner sc = new Scanner(System.in);
    		char input;
    		String animalType;
    		String customerCountry;
    		boolean reserve;
    		boolean monkeyIsAvailable = false; //for testing only
    		boolean dogIsAvailable = true; //for testing only
    		System.out.println("What Type of Animal do you want? D for Dog or M for Monkey: ");
    		input = sc.next().charAt(0);
    		if (input == 'D') {
    			animalType = "Dog";
    			System.out.println("What country do you live in? ");
    			customerCountry = sc.next();
    			//Testing Iteration only
    			if(dogIsAvailable) {
    				reserve = true;
    				System.out.println("We have dogs available in " + customerCountry + " at this time.");
    			}
    			else {
    				reserve = false;
    				System.out.println("There are no dogs available in " + customerCountry + " at this time.");
    			}
    		}
    		else if (input == 'M'){
    			animalType = "Monkey";
    			System.out.println("What country do you live in? ");
    			customerCountry = sc.next();
    			//Testing iteration only
    			if(monkeyIsAvailable)
    			{
    				reserve = true;
    				System.out.println("We have monkeys available in " + customerCountry + " at this time.");
    			}
    			else {
    				reserve = false;
    				System.out.println("There are no monkeys available in " + customerCountry + " at this time.");
    			}
    		}
    		return;
    	}   
}
