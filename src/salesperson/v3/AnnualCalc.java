/**
 * Calculation Class
 *
 * This class calculates annual salesperson commission and any bonuses.
 * FOR Loops and IF-ELSE control statements are used for intelligence
 * in determining appropriate calculation to apply
 * 
 * @author Bob Kefurt
 * Date: 01 Aug 2016
 * 
 */
package salesperson.v3;
        
/**
 *
 * @author Bob Kefurt
 */

public class AnnualCalc {
    
    private double sales;
    private final double salary = 55000;
    private final double commprcnt = 0.12;
    private final double target = 150000;
    private final double trigger = (target * 0.80);
    private final double multiplier = 1.3;
    private double annualCommission = 0;
    private double bonus;
    private int tableIDX = 0;
    
    
    // Constructor for calcualtion object creation
    // No paramteres are passes as values are declared (hard coded)
    public AnnualCalc () {
        
    }
    
    // METHOD called to set sales value from outside the class
    public void setSales(double sales){
        this.sales = sales;
    }
       
    /**
     * 
     * METHOD 
     * Uses IF-ELSE control statements to determine which calculation is applied
     * To re-factor or refine this class, methods should replace 
     * the assignment statements used.
     * 
     * @return sends the calculated total back to the main controlling class
     * 
     */
    public double getCommission(){
        
        if(sales<trigger){
            annualCommission = salary;
            
        } else if(sales>=trigger && sales<=target){
            annualCommission = salary + (sales * commprcnt);
            
        } else if(sales>target){
            annualCommission = salary + (sales * commprcnt * multiplier);
            
        } return annualCommission; 
        
    }
    
    /**
     * 
     * METHOD
     * This method is used to generate what looks like a table. 
     * The table contains two sets of numbers possible sales totals
     * in $5000 increments and the total earnings base on the sales value
     * 
     * This section of code combines a FOR LOOP with IF-ELSE control statements
     * Again to refine this section of code methods should replace the 
     * assignment statements used.
     * Alternatively Arrays could be used to hold the table data.
     * 
     * @return The return value is left unused 
     * 
     */
    
    public double getBonusTable(){
       
        
        double uBound = sales * 1.5; // Used as upper limit to count to in the For loop
        int counter = 0;             // Coutner to place line numbers on "table"
        
        // Table Header code
        System.out.println("\n         Potential Earnings Table");
        System.out.println("\n Potential Sales" + "\t" + "Potential Bonus");
        System.out.println("-------------------------------------------");
        
        /**
         * 
         * COMBO FOR / IF-ELSE Loop
         * idxCounter is used to populate the potential sales column
         * Assignment statements are used to calculate appropriate bonus values
         * for the potential bonus column
         * 
         * To refine methods should replace the assignment statements
         * 
         * @return this variable is left unused
         * 
         */
        for(double idxCounter=sales; idxCounter<=uBound; idxCounter+=5000){
            counter++;            
            if(idxCounter>=target){
               bonus = salary + (idxCounter * commprcnt * multiplier);
               
            } else if(idxCounter >= trigger && idxCounter < target) {
               bonus = salary + (idxCounter * commprcnt);
                
            } else {
               bonus = salary;
             
            }
        // This is where the vaues get printed in alignment with the table header
        // on each pass through the loop. 
        // It's brutish and inelegant but works.
        System.out.println(counter + ".  $" + idxCounter + "\t          $" + bonus);
            
        } return tableIDX; // Left unused
        
    } 
    
}
        
