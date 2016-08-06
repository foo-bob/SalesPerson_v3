/*
 * 
 * 
 * 
 */
package salesperson.v3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
        

/**
 *
 * @author Bob Kefurt
 */
public class Compare {
    
    Scanner userInput = new Scanner(System.in); // Instantiate new scanner object to call method
    ArrayList<SalesData> salesCompare = new ArrayList<SalesData>(); // Create array to be filled
    private String fName = "no-one"; // initialize to use in while loop
    private double aValue;
    private String sentinel = "end";
    
    // Method to collect input from user via the keyBoard
    public void getData() {
        
        while(!fName.equals(sentinel)) {  //Begining of while loop to collect data and fill array list
            
            // Get Sales person's first name from user
            System.out.print("\nEnter sales person first name: "); // prompt user for input
            String nameIn = userInput.next(); // Stow KB input into "in" variable string variable
            
            //Break out of the loop on sentinel value entery
            if(nameIn.equals(sentinel)){
                // add what is in the nameIn bucket to the salesName array list 
                //salesCompare.add(nameIn); 
                //this.aValue = 0;
                break;
            }
            
            // Assign fName (sentinel value) the key word
            this.fName = nameIn; 
            
            // Get Sales person's annual sales total from user
            System.out.print("Enter " + nameIn + "'s" + " annual sales total: "); // prompt user for input
            double salesIn = userInput.nextDouble(); // Stow KB input into "in" variable string variable
            this.aValue = salesIn; // Assign fName (sentinel value) the key word
            
            
            
            // NEED TO USE SalesData OBJECT TO LOAD ARRAY LIST OF ARRAYS
            // @ Author Michael Fudge
            // https://www.youtube.com/watch?v=FhqdMFJbsxs
            // add what is in the nameIn bucket to the salesName array list 
            salesCompare.add(new SalesData(fName, aValue));
        
        }    
        
        // Enhanced For Loop to list everything in the salesName array
        for(SalesData rows :salesCompare){ 
        System.out.format("%s\n$%6.2f", rows); // @ Author Michael Fudge   
        
        } 
        
        System.out.println("ALL DONE"); // Prints contents of salesName Array to screen.
        
    }
              
}
    
