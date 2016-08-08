/**
 * 
 * The Salesperson program v3 compares annual sales values and displays highest,
 * amount of sales and amount needed by each salesperson to at least match the
 * highest annual sales value
 * 
 * 
 * @author Bob Kefurt
 * Date: DAY Aug 2016
 * 
 */

package salesperson.v3;

public class SalesPersonV3 {
    
    // Main class entry point
    public static void main(String[] args) {
       
       Compare salesCompare = new Compare(); // Declare new object to access needed methods
       
        
       System.out.println("Welcome to the sales comparrision tool.");
       System.out.println("=======================================\n");
       System.out.println("Enter salesperson's name and annual sales total");
       System.out.println("Type \"last\" to finish input.");
       
       salesCompare.getData(); // Call method to collect Salesperson Name and Annual Sales values from user
       
       salesCompare.findHighest(); // Call method to find higest value
       
       salesCompare.displayTable(); // Call method to display table of sales and differences
              
       System.out.println("\n" + "END PROGRAM!");

    }
        
}
