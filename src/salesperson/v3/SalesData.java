/*
 * Class to create an object to hold 
 * salesperson and sales data in an ArrayList
 * In order to have an array of object to hold both 
 * String and double data types
 *
 */
package salesperson.v3;

/**
 *
 * @author Bob Kefurt
 */
public class SalesData {
    
    private String sName;  //Salespersons first name
    private double sValue; //Annnual sales for salesperson
    
    public SalesData(String sName, double sValue){ // Constructor must pass name and sales values on creation
        this.sName = sName;
        this.sValue = sValue;
                
    }
    
    
    public String setName (String newName){  // Method to set salesperson's first name
        return (this.sName=newName);
    }
    
    public double setValue (double newValue){ // Method to set salesperson's annual sales value
        return (this.sValue = newValue);
    }
    
    public String getName (){ // Method to get salesperson's name
        return this.sName;
        
    }
    
    public double getValue(){ // Method to get salesperson's annual sales value
        return this.sValue;
        
    }
    
    
    /* 
     * Not sure if this is neded. 
     * Obtained from:
     * @ Author Michael Fudge
     * https://www.youtube.com/watch?v=FhqdMFJbsxs
     * "Learn Programming in Java - Lesson 14: ArrayList and Collections"
     *
     */
    //@Override
    //public String toString(){
    //    return String.format("%s\t$%.2f",this.sName,this.sValue);
        
    }
    
//}
