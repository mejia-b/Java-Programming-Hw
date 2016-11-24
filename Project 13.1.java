import java.util.Scanner;
public class GeometricDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Declare variables
		double side1,side2,side3;
		String color,inputFill;
		boolean fill = false; 
		//Prompt user 
		System.out.println("Enter the three sides of the triangle");
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();
		System.out.println("Enter the color you would like for the triangle");
		color = input.next();
		System.out.println("Would you like the triangle filled?");
		System.out.println("Enter \"Yes\" or \"No\"");
		inputFill = input.next();
		if(inputFill.equals("Yes") || inputFill.equals("YES") || inputFill.equals("yes")){
			fill = true;
			}
		else if(inputFill.equals("No")|| inputFill.equals("NO") || inputFill.equals("no")){
			fill = false;
			
		}//end of if statement
		//Create a geometric object with specified fields
		Triangle triangle1 = new Triangle(side1,side2,side3);
		triangle1.setColor(color);
		triangle1.setFilled(fill);
		//Display object properties
		System.out.printf("Area: %.2f\n", triangle1.getArea());
		System.out.println("Perimeter: "+ triangle1.getPerimeter());
		System.out.println("Color: " + triangle1.getColor());
		System.out.println("Filled: " + triangle1.isFilled());
	}//end of main 

}//end of GeometricDriver class

_______________________________________________________________________________

public class Triangle extends GeometricObject {
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

	public Triangle() {
		super();
		
	}//end of default constructor

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}//end of specifed constructor

	public double getSide1() {
		return side1;
	}//end of getSide1

	public double getSide2() {
		return side2;
	}//end of getSide2

	public double getSide3() {
		return side3;
	}//end of getSide3
	
	public double getArea(){
		double sideLength =  ((side1 + side2 + side3)/2);
		double area =  Math.sqrt(sideLength*(sideLength - side1)*(sideLength - side2)*(sideLength - side3));
		return area;
	}//end of getArea method
	 
	public double getPerimeter(){
		double perimeter = side1 + side2 + side2;
		return perimeter;
	}//end of getPermiter method

	@Override
	public String toString() {
		return "Triangle side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "";
	}//end of toString
	
}//end of Triangle extends GeometricObject class

____________________________________________________________________________________

public abstract class  GeometricObject {// the word abstract is added 
private String color = "white";
private boolean filled; 
private java.util.Date dateCreated;

	protected GeometricObject(){ //this line has protected instead of public
		dateCreated = new java.util.Date();
	}//default constructor

	protected GeometricObject(String color, boolean filled) { // this line has protected instead of public
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}//end of constructor

	public String getColor() {
		return color;
	}//end of getColor

	public void setColor(String color) {
		this.color = color;
	}//end of setColor

	public boolean isFilled() {
		return filled;
	}//end of isFilled

	public void setFilled(boolean filled) {
		this.filled = filled;
	}//end of setFilled

	public java.util.Date getDateCreated() {
		return dateCreated;
	}//end of getDateCreated
	
	
	//ADD THESE ABSTRACT METHODS
  public abstract double getArea(); 
	public abstract double getPerimeter();

	
  @Override
	public String toString() {
		return "created on  [dateCreated=" + dateCreated + " ,color=" + color + ", filled=" + filled + "]";
	}//end of toString
}//end of GeometricObject class

////////////////// OUTPUT ///////////////
Enter the three sides of the triangle
7 5 6
Enter the color you would like for the triangle
Blue
Would you like the triangle filled?
Enter "Yes" or "No"
No
Area: 14.70
Perimeter: 17.0
Color: Blue
Filled: false

