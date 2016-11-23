/*Brenda Mejia
 *Program 7.4 Analyze Scores
 *October 30, 2016
 *Java Programming COP 2800
 */
package analyzescores;

import java.util.Scanner;
public class AnalyzeScores {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[60];
        int[] aboveAvg = new int[60];
        int[] belowAvg = new int[60];
        int i,x=0,j=0;
        double avg;
        double numOfScores=0.0, total = 0.0;
        
        System.out.println("Enter scores or enter a negative number to exit");
        for(i=0; i < scores.length; i++){
            scores[i] = input.nextInt();
            
            if(scores[i] < 0){
                break;
                }//end of if
            numOfScores++;
            total += scores[i];
         }//end of for loop
        
         avg = total/numOfScores;
        
         for(i = 0; i < numOfScores; i++){
                if(scores[i] >= avg ){
                    aboveAvg[x] = scores[i];
                    x++;
                }
                else if(scores[i] < avg){
                    belowAvg[j] = scores[i];
                    j++;
                }//end of if statement
        }//end of for loop
         
        System.out.printf("The average of the scores is: %4.2f\n", avg);
        System.out.printf("There are %d scores equal or above average.\n", x);
        System.out.printf("There are %d scores below average.\n",j);
        
    
    }//end of main 
}//end of class
///////OUTPUT///////////////////////////
Enter scores or enter a negative number to exit
70 75 68 45 68 90 100 97 75 -1
The average of the scores is: 76.44
There are 3 scores equal or above average.
There are 6 scores below average.
BUILD SUCCESSFUL (total time: 42 seconds)
