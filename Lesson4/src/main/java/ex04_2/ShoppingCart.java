/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_2;

/**
 *
 * @author Reggi
 * 
 * Exercise 4-2

1. Declare and initialize numeric fields. Include price and tax (double), 
     quantity (int). Also declare a double called total, but do not initialize it.
2. Change the message variable to include quantity 
      (example: "Mary Smith wants to purchase 1 Shirt.")
3. Calculate total by multiplying price * quantity * tax.
4. Print a message showing the total cost. 
      (example:  "Total cost with tax is: 25.78.") 
 */
public class ShoppingCart {
   
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
      
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 9.99 , tax = 0.15,total ;
        int quantity=10;
        
        // Modify message to include quantity 
        
        String message = custName + " wants to purchase "+ quantity +" "+itemDesc +"s";
                
        System.out.println(message);
        
        // Calculate total and then print the total cost
        
total = price + quantity + tax;
        System.out.println("Total cost with tax is "+ total);
        
    } 
    
    
}
