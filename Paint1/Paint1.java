/*
 * Modified by Joshua Langer 6/13/2020
 */
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        
    	Scanner scnr = new Scanner(System.in);
    	double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
    	// Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        while (wallHeight == 0.0) {
         	//ensure input is a number greater than 0 and not a string, else start over.
        	try {
         		wallHeight = Double.parseDouble(scnr.next());
             	if (wallHeight == 0.0)
             	{
             		//Expain issue and request new input.
             		System.out.println("Invalid Height input, please input a number greater than zero.");
             		System.out.println("Enter wall height (feet): ");
             		wallHeight = Double.parseDouble(scnr.next());
             	}
         		break;
         	} catch(NumberFormatException ignore) {
         		System.out.println("Invalid Height input, please input a number greater than zero.");
         		System.out.println("Enter wall height (feet): ");
         	}

            
        }

        // Implement a do-while loop to ensure input is valid 
    	// Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
      //ensure input is a number greater than 0 and not a string, else start over.
        while (wallWidth == 0.0) {
        	try {
        		wallWidth = Double.parseDouble(scnr.next());
        		if(wallWidth == 0.0) 
        		{
        			//Expain issue and request new input.
        			System.out.println("Invalid width input, please input a number greater than zero.");
        			System.out.println("Enter wall width (feet): ");
        			wallWidth = Double.parseDouble(scnr.next());
        			
        		}
        		break;
        	} catch(NumberFormatException ignore) {
        		System.out.println("Invalid width input, please input a number greater than zero.");
        		System.out.println("Enter wall width (feet): ");
        	}

        		
         
        }

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet"); //added the wallArea to the output. 6/13-Joshua Langer

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons"); //resolved gallonsPaintNeeded from gallonspaintneeded 6/13-Joshua Langer

    }
    
    
    
}
