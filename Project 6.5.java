/*
 *Brenda Mejia
 *Display Sorted Numbers 6.5
 *Java Programming COP 2800
 *September 30, 2016
 */
package sortednumbers6_5;

import java.util.Scanner;
public class SortedNumbers6_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare variables
        double n1,n2,n3;
        
        //Prompt user to enter three numbers
        System.out.println("Enter three numbers to be sorted");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        
        //Call the displaySortedNumbers method
        //to sort the numbers in incereasing order
        displaySortedNumbers(n1,n2,n3);
        }//end of Main
    
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double min=0,middle=0,max=0;
         //Only if num1 is bigger than both
        //num2 and num3 will it enter this nested if statement
        if(num1 > num2 && num1 > num3){
            max = num1;
            if(num2 > num3){
                middle = num2;
                min = num3;
            }
            else {
                middle = num3;
                min = num2;
            }
                
        }
       //_____________________________________
       
       //Only if num2 is greater than both num1 and num3
       //it will enter this nested if statement
         if(num2 > num1 && num2 > num3){
            max = num2;
            if(num1 > num3){
                middle = num1;
                min = num3;
            }
            else {
                middle = num3;
                min = num1;
            }
                
         }//end of if statement 
         
         //_______________________________________________
        
         //Only if num3 is greater than both 
         //num1 and num2 will it enter this if statement
          if(num3 > num1 && num3 > num2){
            max = num3;
            if(num1 > num2){
                middle = num1;
                min = num2;
                
            }
            else {
                middle = num2;
                min = num1;
            }
          }
        //Display result 
        System.out.println("Sorted numbers in increasing order\n");
        System.out.printf("%.0f %.0f %.0f\n", min, middle, max);
    }//end of displaySortedNumbers Method
 }//end of SortedNumbers6_5 Class
