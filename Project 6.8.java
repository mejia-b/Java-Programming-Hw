/*Brenda Mejia
*Project 6.8 Conversion
*between Celsius and Farenheit
*October 9, 2016
*Java Programming COP 2800
*/
package project6_8;


public class Project6_8 {

    
    public static void main(String[] args) {
        ConversionMethods c = new ConversionMethods();
        double fahrenheit, celsius,i,x = 120.0;
        
        
        System.out.println("Celsisus\tFahrenheit |\tFahrenheit\tCelsius");
        System.out.println("________________________________________________________");
        
        
        for(i = 40.0; i > 30.0; i--){
           fahrenheit = c.celsiusToFahrenheit(i);
           
           if(x >= 30.0){
             celsius = c.fahrenheitToCelsius(x);
             System.out.printf("%.1f\t\t%.1f\t  |\t%.1f\t\t%.2f\n",i,fahrenheit,x,celsius);
           }//end of if block
           x-=10;
    
        }//end of for loop
    }//end of main
    
}//end of class

////////////////////////////////////////////////////////////////////////////////////////////

/*Brenda Mejia
*ConversionMethods Class
*includes methods for 
*conversion from celsius to fahrenheit
and fahrenheit to celsisus
*/
package project6_8;


public class ConversionMethods {
     public static double celsiusToFahrenheit(double celsius){
        double fahrenheit;
        fahrenheit = (9.0/5) * celsius + 32;
        
        return fahrenheit;
    
}//end of celsiusToFarenheit method
    
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius;
        
        celsius = (5.0/9) * (fahrenheit - 32);
        
        return celsius;
    }//end of farenheitToCelsius method
}
