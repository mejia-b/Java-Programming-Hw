/*Brenda Mejia
 * Write a program that prompts 
 * the user to enter three points
 * (x1,y1)(x2,y2)(x3,y3) of a triangle
 * and displays its area.
 */
import java.util.Scanner;
public class AreaOfTriangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double x1,y1,x2,y2,x3,y3;
		double side1, side2, side3, s, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points for a triangle: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		side1 = Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
		side2 = Math.pow(Math.pow(x3-x1,2) + Math.pow(y3-y1,2),0.5);
		side3 = Math.pow(Math.pow(x3-x2,2) + Math.pow(y3-y2,2),0.5);
		
		s = (side1 + side2 + side3)/2;
		area = Math.pow(s*(s-side1)* (s-side2)* (s-side3), 0.5);
		
		System.out.printf("The area of the triangle is %7.1f\n", area);
		
		
		
	}//end of main

}//end of class
