/**
 * 
 * The Salesperson program v3 compares annual sales values and displays highest,
 * amount of sales and amount needed by each salesperson to at least match the
 * highest annual sales value
 * 
 * 
 * @author Bob Kefurt
 * Date: 08 Aug 2016
 * 
 */

package salesperson.v3;

public class SalesPersonV3 {
    
    // Program entry point
    public static void main(String[] args) {
       
        /* Work object for sales value calcuations */
       Compare salesCompare = new Compare();
       
       /* Program Header and user prompt */
       System.out.println("Welcome to the sales comparrision tool.");
       System.out.println("=======================================\n");
       System.out.println("Enter salesperson's name and annual sales total");
       System.out.println("Type \"last\" to finish input.");
       
       /* MEthod call to collect data from user */
       salesCompare.getData();
       
       /* Method call to find the higest value for ues in comparison process */
       salesCompare.findHighest();
       
       /* Method call to display results of comparison */
       salesCompare.displayTable();
              
       System.out.println("\n" + "END PROGRAM!");

    }
        
}
