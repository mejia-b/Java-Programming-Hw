/*Brenda Mejia
 * Kilograms to Pounds Conversion 
 * Java Programming COP 2800
 * September 17, 2016
 */
package kilogramstopounds;

public class KilogramsToPounds {

    
    public static void main(String[] args) {
       final double POUNDS = 2.2;
       double total=0;
       int i;
       
       System.out.println("KILOGRAMS \t POUNDS\n");
       System.out.println("-----------------------\n");
       for (i = 1; i <= 199; i+=2 ){
           total = (i) * POUNDS;
           System.out.printf("%d \t %.1f\n", i, total);
           System.out.printf("i = %d\n", i);
       }//end of loop 
       
    }//end of main 
    
}//end of class
