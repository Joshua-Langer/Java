import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Driver {

    // instance variables (add more as needed)
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();

    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); //initialize scanner
    	char input; //declare input capture

    	initializeShipList();       // initial ships
        initializeCruiseList();     // initial cruises
        initializePassengerList();  // initial passengers

        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed
        displayMenu();
        input = sc.next().charAt(0);
        if (input == 'x') {
        	return;
        }
        else {
	        while (input != 'x') {
	        	if (input == '1') {
	        		addShip();
	        	}
	        	else if (input == '2') {
	        		editShip();
	        	}
	        	else if (input == '3') {
	        		addCruise();
	        	}
	        	else if (input == '4') {
	        		editCruise();
	        	}
	        	else if (input == '5') {
	        		addPassenger();
	        	}
	        	else if (input == '6') {
	        		editPassenger();
	        	}
	        	else if (input == 'A') {
	        		printShipList("name");
	        	}
	        	else if (input == 'B') {
	        		printShipList("active");
	        	}
	        	else if (input == 'C') { 
	        		printShipList("full");
	        	}
	        	else if (input == 'D') {
	        		printCruiseList("list");
	        	}
	        	else if (input == 'E') {
	        		printCruiseList("details");
	        	}
	        	else if (input == 'F') {
	        		printPassengerList();
	        	}
	        	break;
	        }
        }
        


    }

    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList() {
        add("Candy Cane", 20, 40, 10, 60, true);
        add("Peppermint Stick", 10, 20, 5, 40, true);
        add("Bon Bon", 12, 18, 2, 24, false);
        add("Candy Corn", 12, 18, 2, 24, false);
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
    }

    // hardcoded cruise data for testing
    // Initialize passenger list
    public static void initializePassengerList() {
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }

    // custom method to add ships to the shipList ArrayList
    public static void add(String tName, int tBalcony, int tOceanView,
                           int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }


    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") {
            System.out.println("\n\nSHIP LIST - Active");
            for (Ship activeShip: shipList)
            	//looks for any Ship that is in Service
            	if(activeShip.getInService() == true) {
            		//prints the active ships from the name in the Ship memory.
            		System.out.println(activeShip.getShipName());
            	}


        } else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();

        } else
            System.out.println("\n\nError: List type not defined.");
        displayMenu();
    }

    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
        displayMenu();
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
        displayMenu();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship - Method implemented by Joshua Langer 6/21/2020
    public static void addShip() {
    	boolean shipInService; //declare boolean for later input.
    	Scanner newShipInput = new Scanner(System.in); //init the scanner for this method
    	System.out.println("Enter the new ship's name: ");
    	String newShipName = newShipInput.nextLine();
    	
    	//ensure new ship doesn't exist
    	for (Ship eachShip: shipList) {
    		if(eachShip.getShipName().equalsIgnoreCase(newShipName)) {
    			System.out.println("That Ship is already in the system. Exiting to menu...");
    			return; //quits addShip() method
    		}
    	}
    	
    	//get room amounts for each room type
    	System.out.println("Enter the amount of Balcony Rooms: ");
    	int newShipBalRoom = newShipInput.nextInt();    	
    	System.out.println("Enter the amount of Ocean View Rooms: ");
    	int newShipOVRoom = newShipInput.nextInt();    	
    	System.out.println("Enter the amount of Suites: ");
    	int newShipSuiteRoom = newShipInput.nextInt();
    	System.out.println("Enter the amount of Interior Rooms: ");
    	int newShipInteriorRoom = newShipInput.nextInt();
    	//Boolean input is test only initially.
    	System.out.println("Enter if the ship is in service: Enter 'Yes' or 'No'");
    	String newShipInService = newShipInput.next();
    	if (newShipInService.equalsIgnoreCase("YES")) {
    		shipInService = true;
    	} else {
    		shipInService = false;
    	}
    	
    	Ship newShip = new Ship(newShipName, newShipBalRoom, newShipOVRoom, newShipSuiteRoom, newShipInteriorRoom, shipInService);
    	shipList.add(newShip);
    	printShipList("full"); //test to verify saved
    	return;
    	

    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise - Method implemented by Joshua Langer 6/21/2020
    public static void addCruise() {
    	Scanner newCruiseInput = new Scanner(System.in);
    	System.out.println("Enter the new cruise name: ");
    	String newCruiseName = newCruiseInput.nextLine();
    	
    	//ensure new cruise doesn't exist
    	for (Cruise eachCruise: cruiseList) {
    		if(eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
    			System.out.println("That Cruise is already in the system. Exiting to menu...");
    			return; //quits addCruise() method
    		}
    	}
    	
    	//Gather other information needed to save  -- Initial Run
    	System.out.println("Enter the Cruise Ship Name for this Cruise: ");
    	String newCruiseShipName = newCruiseInput.nextLine();
    	for(Ship activeShip: shipList) {
				if (!shipList.contains(newCruiseShipName)) {
					System.out.println("That Ship is not in the system. Exiting to menu...");
					return;
				}
				if (shipList.contains(newCruiseShipName) && activeShip.getInService() == false) {
					System.out.println("That Ship is not in service. Exiting to menu...");
					return;
				}
			}
     	System.out.println("Enter the Departure Port for this Cruise: ");
    	String newDeparturePort = newCruiseInput.nextLine();
    	System.out.println("Enter the Destination for this Cruise: ");
    	String newDestination = newCruiseInput.nextLine();
    	System.out.println("Enter the Return Port for this Cruise: ");
    	String newReturnPort = newCruiseInput.nextLine();
    	
    	Cruise newCruise = new Cruise(newCruiseName, newCruiseShipName, newDeparturePort, newDestination, newReturnPort);
    	cruiseList.add(newCruise);
    	printCruiseList("details");
    	return;
       

        
    }

    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger() {

        Scanner newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = newPassengerInput.nextLine();

        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get cruise name for passenger
        System.out.println("Enter cruise name: ");
        String newCruiseName = newPassengerInput.nextLine();

        // ensure cruise exists
        for (Cruise eachCruise: cruiseList) {
            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
                // cruise does exist
            } else {
                System.out.println("That cruise does not exist in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        String room = newPassengerInput.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }

}
