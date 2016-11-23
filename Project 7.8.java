/*Brenda Mejia
 *Project 7.8 Average An Array
 *Java Programming COP 2800
 *October 31, 2016
 */
package averageanarray;

import java.util.Scanner;
public class AverageAnArray {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[10];
        double totalAverage;
        int i;
        
        System.out.println("Enter ten decimal value numbers");
        for(i = 0; i < numbers.length; i++){
           numbers[i] = input.nextDouble();
        }//end of for loop
        
        totalAverage = average(numbers);
        System.out.printf("The average is: %4.2f\n", totalAverage);
     }//end of main
    
    public static int average(int[] values){
        int sum = 0,total;
        int i; 
        for(i = 0; i < values.length; i++){
            sum += values[i];
            }//end of for loop
        total = sum/values.length;
        return total;
    }//end of average method
    
    public static double average(double[] values){
        double sum = 0.0,total;
        int i; 
        for(i = 0; i < values.length; i++){
            sum += values[i];
            }//end of for loop
        total = sum/values.length;
        return total;
    }//end of average method
    
}//end of AverageAnArray class

////////OUTPUT////////////
Enter ten decimal value numbers
3.4 5.6 2.5 6.7 3.9 5.9 7.8 1.0 2.2 5.5
The average is: 4.45
BUILD SUCCESSFUL (total time: 3 minutes 22 seconds)
