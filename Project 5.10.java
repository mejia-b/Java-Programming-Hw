/*Brenda Mejia
 *Project 5.10 
 * Java Programming COP 2800
 * September 17, 2016
 */
package project5_10;


public class Project5_10 {

    
    public static void main(String[] args) {
       
        int i, x=0;
        System.out.println("Numbers between 100 and 10000\n divisible by 5 AND 6: ");
        System.out.println("________________________________________");
        for (i= 100; i <= 1000; i++){
            if(i % 5 == 0 && i % 6 == 0){
                System.out.printf(" %d", i);
                x++;
            }
            
            if(x == 10){
                System.out.println("\n");
                x = 0;
               }
        }//end of loop
    }//end of main
}//end of class
