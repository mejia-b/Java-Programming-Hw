/*Brenda Mejia
 *Project 5.6 miles to kilometers
 * Java Programming COP 2800
 * September 17, 2016
 */
package project.pkg5_6;


public class Project5_6 {

    
    public static void main(String[] args) {
        //declare variables to store result of calculations
        double totalMiles, totalKilometers;
        //declaration of counters and initialization
        int i, x = 20;
        //Print header title
        System.out.printf("MILES \t KILOMETERS \t|\tKILOMETERS \t MILES\n");
        
        //loop will iterate 10 times and print conversions
        //from miles to kilometers and kilometers to miles
        for(i=1; i <= 10; i++){
            totalKilometers = 1.609 * i;
            
                if(x <=65){
                    totalMiles = x / 1.609;
                    System.out.printf("%d \t   %.3f\t|\t%d \t\t %.3f\n",i, totalKilometers, x, totalMiles);
        
                   }//end of if statement
                x+=5;
        }//end of loop
        
    }//end of main
}//end of class
