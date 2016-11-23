/*Brenda Mejia
 *Quadratic Equations Program 3.1
 * September 16, 2016
 * Java Programming COP 2800
 */
package quadraticequations;

/**
 *
 * @author Brenda
 */

import java.util.Scanner;
public class QuadraticEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a, b, c, r1, r2, discriminant ;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter a, b ,c : ");
       a = input.nextDouble();
       b = input.nextDouble();
       c = input.nextDouble();
       
       r1 = (-b + (Math.pow((Math.pow(b,2))-(4*a*c),0.5)))/ (2*a);
       r2 = (-b - (Math.pow((Math.pow(b,2))-(4*a*c),0.5)))/ (2*a);
       discriminant = (Math.pow(b,2))-(4*a*c);
       
       
       if (discriminant > 0){
       System.out.printf("The equation has two roots %f and %f\n", r1, r2);
       }
    
       else if (discriminant == 0){
           
            if (r1 < 0 || r1 > 0){
                System.out.printf("The equation has one root %.0f\n", r1);
            }
            else if (r2 < 0 || r2 > 0){
                System.out.printf("The equation has one root %.0f\n", r2);
                
                 }
        
        }
       else 
         System.out.println("The equation has no real roots\n");
    }//end of main
}//end of class
