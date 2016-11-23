/*Brenda Mejia
*Compute PI when value of 
*i is 10,000, 20,000 up to 100,000
*Project 5.25
*Java Programming COP 2800
*/

package computepi;


public class ComputePi {

    
    public static void main(String[] args) {
    //variable declaration
    double pi=0, result;
    int i,x=10000;
    
    for(i=1; i <= 100000; i++){
       
         result = 4*(Math.pow(-1,i+1)/ (2*i-1));
         pi += result;
        
        if(i == x){
            System.out.printf("Pi value at %d = %f\n", x, pi);
            x += 10000;
        
        }//end of if block
    
     }//end of for loop
    
    }//end of main
    
}//end of class
