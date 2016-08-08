/**
 * Class: Compare
 * 
 * 
 * 
 */
package salesperson.v3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * @author Bob Kefurt
 * 27 Aug. 2016
 */
public class Compare {
    
    private String fName = "no-one"; // initialize to use in while loop
    private double arrayValue;
    private double saleHighest;
    private String maxName;
    Scanner userInput = new Scanner(System.in); // Instantiate new scanner object to call method
    ArrayList<SalesData> salesCompare = new ArrayList<SalesData>(); // Create array to be filled
    
    /**
     * Method: getData
     * to collect input from user via the keyBoard
     * 
     */
    public void getData() {
        
        Boolean isCollecting = true;
        
        while(isCollecting){ //Begining of while loop to collect data and fill array list
            
        // Get Sales person's first name from user
            System.out.print("\nEnter sales person first name: "); // User Prompt
            String nameIn = userInput.next(); // Stow KB input into "in" variable string variable
            
        //Break out of the loop on sentinel value entery
            if(nameIn.equalsIgnoreCase("last")){
                break;
            }
            
        // Assign fName (sentinel value) the key word
            this.fName = nameIn; 
            
        // Get Sales person's annual sales total from user
            System.out.print("Enter " + nameIn + "'s" + " annual sales total: "); // prompt user for input
            double salesIn = userInput.nextDouble(); // Stow KB input into "in" variable string variable
            this.arrayValue = salesIn; // Assign fName (sentinel value) the key word


            SalesData myList = new SalesData(); // Create new object with user entered values
            myList.setName(fName); //set name string to user entry
            myList.setValue(arrayValue); // set sales value to user entry
            salesCompare.add(myList); // add object myList to SaleCompare array list
        
        }    

    }
    
    /**
     * Method: findHighest
     * Find highest value entered into the array
     * List sales person with highest sales value recorded in the array
     *
    */
    public void findHighest() {
        double maxValue = 0;
        int Record = 0;

        /* Loop through the array using local sVlaue object */
        for(int Idx=0; Idx < salesCompare.size(); Idx++){  
            SalesData salesValue = (SalesData)salesCompare.get(Idx);
            
            /* Evaluate each value in array against maxValue varaible on each pass */
            if(salesValue.getValue() > maxValue){
                Record = Idx;
                maxValue = salesValue.getValue(); // Set maxValue to highest value  found on each pass
                saleHighest = maxValue; // Set value for class variable to be used in display table method
                maxName = salesValue.getName(); // Set maxName to highest value salesperson found on each pass
                
            } 
        
        } System.out.println("\n The salesperson with the highest sales is: " + maxName + " with $" + saleHighest + " in sales!\n");

    }

    /**
     * Method: displayTable
     * Loops through array to print out a table of 
     * sales values and difference between each sale 
     * and the highest sales value.
     * 
     */
    public void displayTable() {
        
        /* Table header information */
        System.out.println("\t\tSALESPERSON COMPARISSON TABLE");
        System.out.println("======================================================================");
        System.out.println("Salesperson\t" + "Sales Amount\t" + "Highest Sales\t" + "Difference");
        System.out.println("======================================================================");
        
        /* Loop through the array using local tVlaue object */
        for(int Idx=0; Idx < salesCompare.size(); Idx++){
            SalesData salesTable = (SalesData)salesCompare.get(Idx);
            
            System.out.println(salesTable.getName() + "\t\t$" + salesTable.getValue() + "\t$" + saleHighest + "\t$" + (saleHighest - salesTable.getValue()));
        } System.out.println("======================================================================");  
        
    }
}
    
