/*Brenda Mejia
 * Boolean Operators 3.26
 * Java Programming COP 2800
 * September 17, 2016
 */
package booleanoperators;

/**
 *
 * @author Brenda
 */
import java.util.Scanner;
public class BooleanOperators {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num;
       System.out.println("Enter an integer");
       num = input.nextInt();
       
      
       if (num % 5 == 0 && num % 6 == 0 )
           System.out.println("Is " + num + " divisible by 5 and 6? True");
    
       else
           System.out.println("Is " + num + " divisible by 5 and 6? False");
       if (num % 5 == 0 || num % 6 == 0)
          System.out.println("Is " + num + " divisible by 5 or 6? True");
       else 
           System.out.println("Is " + num + " divisible by 5 or 6? False");
       if (num % 5 == 0 ^ num % 6 == 0 )
           System.out.println("Is " + num + " divisible by 5 or 6, but not both? True");
    
       else
           System.out.println("Is " + num + " divisible by 5 or 6, but not both? False");
       
    
}//end of main 
}//end of class
