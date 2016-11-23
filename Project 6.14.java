/*Brenda Mejia
 *Program 6.14 Compute PI Method
 *Java Programming COP 2800
 *October 11, 2016
 */
package computepimethod;


public class ComputePIMethod {

    
    public static void main(String[] args) {
        //declare variables
        double i,piValue;
        //print out title bar
        System.out.printf("i\t  pi\n");
        System.out.println("___________________");
        
        //For loop will start at 1 and increment by 100
       for(i = 1; i <= 901; i+=100){
            //computePI method will be called and the value
            //of i will be passed as its argument then the value
            //returned will be stored in piValue variable
            piValue = computePI(i);
            System.out.printf("%.0f\t%.4f\n",i, piValue);
        }
    }//end of main
    
    //computePI Method has one parameter of type double
    public static double computePI(double value){
        double i,result, pi=0;
        for(i = 1; i <= value; i++){
          result = 4*(Math.pow(-1,i+1)/ (2*i-1));
          pi += result;
        }
        return pi;
        
        
    }//end of computePI Method
    
}//end of ComputePIMethod class
