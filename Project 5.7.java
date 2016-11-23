/*Brenda Mejia
 * ComputeFutureTuition 5.7
 * Java Programming COP 2800
 * September 17, 2016
 */
package computefuturetuition;


public class ComputeFutureTuition {
    public static void main(String[] args) {
        //constant declaration
        final double PERCENT = 0.05; 
        //variable declaration and intitialization 
        double tuition = 10000, total = 0; 
        //counter
        int i;
        
        //
        System.out.println("YEAR \t  TUITION");
        System.out.println("--------------------");
        
        for (i=0; i< 10; i++){
            tuition = tuition + (tuition * PERCENT);
            System.out.printf("%d \t $%.2f\n", i+1, tuition);
               }
        for (i=0; i < 4; i++){
                    tuition = tuition + (tuition * PERCENT);
                    System.out.printf("%d \t $%.2f\n", i+11, tuition);
                    total += tuition;
                }
        System.out.println("\n");
        System.out.printf("Four years worth of tuition after tenth year:  $%.2f\n\n", total);
    }//end of main
    
}//end of class
