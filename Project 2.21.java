/*Brenda Mejia
 * Programming Project 2.21
 * Java COP 2800
 * 
 */
package financial.application;

import java.util.Scanner;
public class FinancialApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double investmentAmount, annualInterest, futureValue, monthlyInterestRate;
        int numOfYears;
        System.out.println("Enter Investment Amount: ");
        investmentAmount = input.nextDouble();
        
        System.out.println("Enter annual interest rate in percentage: ");
        annualInterest = input.nextDouble();
        
        System.out.println("Enter number of years: ");
        numOfYears = input.nextInt();
        
        monthlyInterestRate = annualInterest / 1200;
        futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numOfYears * 12);
        
        System.out.printf("Accumulated value is $%7.2f\n", futureValue);
    }//end of main
}//end of class
