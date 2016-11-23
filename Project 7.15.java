/*Brenda Mejia
 *Program 7.15 Elminate Duplicates
 *Java Programming COP 2800
 *October 31, 2016
 */
package program7_15;

import java.util.Scanner;
public class Program7_15 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        int[] newValues = new int[10];
        int i;
        
        System.out.println("Enter ten numbers");
        for(i = 0; i < values.length; i++){
            values[i] = input.nextInt();
        }//end of for loop
        
        System.out.println("The distinct numbers are");
        
        newValues = eliminateDuplicates(values);
        for(i = 0; i < newValues.length; i++){
            if(newValues[i] > 0){
               System.out.printf("%d ", newValues[i]); 
            }
        }
        System.out.println("\n");
    }//end of main
    
    
    public static int[] eliminateDuplicates(int[] list){
        int[] tempArray = new int[300];
        int[] newArray = new int[list.length];
        int i,j=0,temp;
        
        for(i = 0; i < list.length; i++){
            temp = list[i];
            tempArray[temp]++;
        }
        for(i = 0; i < tempArray.length; i++){
           if(tempArray[i] > 0){
                newArray[j] = i;
                j++;
            }//end of if statement
        }//end of for loop
        return newArray;
     }//end of elimiateDuplicates
   
    
}//end of Program7_15 Class
////// OUTPUT///////////

Enter ten numbers
26 45 26 4 6 50 45 2 4 50
The distinct numbers are
2 4 6 26 45 50 

BUILD SUCCESSFUL (total time: 34 seconds)
