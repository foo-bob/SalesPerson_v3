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
 // Code Source: GasController.java, Author: Paul Stay, Date: 21 July 2016 */
import java.util.Scanner; // Required to collect user keyboard input.
//*/ import salesperson.v3.AnnualCalc;


public class SalesPersonV3 {
    
    // Main class entry point
    public static void main(String[] args) {
       
       Compare salesCompare = new Compare(); // Declare new object to access needed methods
        
       System.out.println("Welcome to the sales comparrision tool.");
       System.out.println("You will be prompted to enter the first name of each salesperson,");
       System.out.println("followed by a prompt for their sales total.");
       System.out.println("Use the first name \"end\" to stop.");
       
       salesCompare.getData(); // Call method to collect Salesperson Name and Annual Sales values from user
       
              
       System.out.println("\n" + "END PROGRAM!");

    }
        
}
