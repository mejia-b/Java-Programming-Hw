/*Brenda Mejia
*Cost of Shipping Program 3.18
*Java Programming COP 2800
*September 16, 2016
 */
package costofshipping;

/**
 *
 * @author Brenda
 */
import java.util.Scanner;
public class CostOfShipping {

    
    public static void main(String[] args) {
        double weight, shippingCost;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight of package in pounds: ");
        weight = input.nextDouble();
        
        if (weight > 0 && weight <= 1){
            shippingCost = 3.5 * weight;
            System.out.printf("Shipping Cost is $%.2f\n", shippingCost);
        }
        else if (weight > 1 && weight <= 3){
            shippingCost = 5.5 * weight;
            System.out.printf("Shipping Cost is $%.2f\n", shippingCost);
        }
        else if (weight > 3 && weight <= 10){
            shippingCost = 8.5 * weight;
           System.out.printf("Shipping Cost is $%.2f\n", shippingCost);
        }
        else if (weight > 10 && weight <= 20){
            shippingCost = 10.5 * weight;
            System.out.printf("Shipping Cost is $%.2f\n", shippingCost);
        }
        else if (weight > 50){
            System.out.println("The package cannot be shipped");
        }
        
        
    }// end of main
    
}//end of class
