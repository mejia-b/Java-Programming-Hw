/*Brenda Mejia 
 *Project 6.11 Compute Commission
 *Java Programming COP 2800
 *October 23, 2016
*/
package project6_11;


public class Project6_11 {

   
    public static void main(String[] args) {
        
        double i;
        
        System.out.println("Sales Amount \t Commission");
        System.out.println("_______________________________");
        
        for(i = 10000; i <= 100000; i+= 5000){
           System.out.printf("%.0f \t\t %.1f\n", i, computeCommission(i));
        }//end of for loop
     }//end of main
    
    public static double computeCommission(double salesAmount){
        double commission = 0;
        if (salesAmount >= .01 && salesAmount <= 5000){
            commission = 5000 * .08;
        }
        else if (salesAmount >= 5000.01 && salesAmount <= 10000){
            commission = (5000 * .08) + (5000 * .1);
        }
        else if (salesAmount >= 10000.01){
            commission = (5000 * .08) + (5000 * .1) + ((salesAmount - 10000) * .12);
        }
        return commission;
    }
    
}//end of class
