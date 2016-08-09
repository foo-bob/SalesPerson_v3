/**
 * Class: Compare
 * Contains several methods to collect user input into an array.
 * Find the highest value in the array.
 * Perform calculations based on the highest value in the array.
 * Display results of comparison
 * 
 */
package salesperson.v3;


import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * @author Bob Kefurt
 * 08 Aug. 2016
 */
public class Compare {
    
    /* Setup class level variables for use with any method */
    private String fName = "no-one"; // initialized for use in while loop
    private double arrayValue;
    private double saleHighest;
    private String maxName;
    
    /* Work Object to connect user input */
    Scanner userInput = new Scanner(System.in); // Instantiate new scanner object to call method
    
    /* New arraylist to accept unknown number of input elements */
    ArrayList<SalesData> salesCompare = new ArrayList<SalesData>();
    
    /**
     * Method: getData
     * Use: collect input from user via the keyBoard via the scanner import and object
     */
    public void getData() {
        
        /* While loop: used to collect user input and place it into an Array List*/
        Boolean isCollecting = true;
        while(isCollecting){ 
            
            /* Get Sales person's first name from user */
            System.out.print("\nEnter sales person first name: "); // User Prompt
            String nameIn = userInput.next(); // Stow KB input into "nameIn" variable using method from scanner object
            
            /* Used as a sentinel control to break out of the while loop*/
            if(nameIn.equalsIgnoreCase("last")){ // Use .equals when comparing values instead of object references that point to the same object
                break; // Used to prevent the entry of further data input in to Array List
            }
            
            /* Set class level variable */
            this.fName = nameIn; // located outside for loop, prevents KB entry from being recorded into arrayList
            
            /* Get Sales person's annual sales total from user */
            System.out.print("Enter " + nameIn + "'s" + " annual sales total: "); 
            double salesIn = userInput.nextDouble(); // Stow KB input into "salesIn" variable using method from scanner object
            this.arrayValue = salesIn; // Set class levle variable 

            /* Create work object to store user input, this object with then be stored in an ArrayList */ 
            SalesData myList = new SalesData(); 
            
            /* Method calls to set values in the wor object */ 
            myList.setName(fName); 
            myList.setValue(arrayValue);
            
            /* Add work object now containing valies to Array List */
            salesCompare.add(myList); // add object myList to SaleCompare array list
        
        }    

    } /* END METHOD getData */
    
    /**
     * Method: findHighest
     * Find highest value entered into the array
     * List sales person with highest sales value recorded in the array
     */
    public void findHighest() {
        double maxValue = 0; // instance varaible
        
        /* Loop through the array using local sVlaue object */
        for(int Idx=0; Idx < salesCompare.size(); Idx++){  
            SalesData salesValue = (SalesData)salesCompare.get(Idx);
            
            /* Evaluate each value in array against maxValue varaible on each pass */
            if(salesValue.getValue() > maxValue){
                maxValue = salesValue.getValue(); // Set maxValue to highest value  found on each pass
                saleHighest = maxValue; // Set value for class variable to be used in display table method
                maxName = salesValue.getName(); // Set maxName to highest value salesperson found on each pass
                
            } 
        
        } System.out.println("\n The salesperson with the highest sales is: " + maxName + " with $" + saleHighest + " in sales!\n");

    } /* END METHOD findHighest */

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
            
            /*  Work object created and filled with data from object in array at Idx position */
            SalesData salesTable = (SalesData)salesCompare.get(Idx);
            
            /* Setup local instance variable for use inoutput instead of calcuations being performed at time of output */
            double diffValue = (saleHighest - salesTable.getValue());
            
            /* Fill table output on each pass*/
            System.out.println(salesTable.getName() + "\t\t$" + salesTable.getValue() + "\t$" + saleHighest + "\t$" + diffValue); //(saleHighest - salesTable.getValue())
            
        } System.out.println("======================================================================");  // located outside the loop to prevent it from showing up on each pass.
        
    } /* END METHOD displayTable */
}