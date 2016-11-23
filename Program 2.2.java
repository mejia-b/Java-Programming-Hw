/*Brenda Mejia
*Write a program that reads in 
*the radius and length of a cylinder
*and computes the area and volume.
*September 7, 2016
*Java Programming COP 2800
*/

import java.util.Scanner;
public class ComputeVolumeCylinder {

  public static void main (String [] args){
    float radius, length, area, volume;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius and Length of a Cylinder");
    
    radius = input.nextFloat();
    length = input.nextFloat();
    
    area = (float)(Math.PI * math.pow(radius, 2));
    volume = (float) (area *length);
    
    System.out.printf("The area is %4.4f\n", area);
    System.out.printf("The volume is %4.1f\n", volume);
  
  
  }//end of main

}//end of class
