public interface Colorable {
	abstract public void howToColor();
}//end of Colorable interface
___________________________________________________________________

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled; 
	private java.util.Date dateCreated;

		protected GeometricObject(){
			dateCreated = new java.util.Date();
		}//default constructor

		protected GeometricObject(String color, boolean filled) {
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
		
		public abstract double getArea();
		public abstract double getPerimeter();

		@Override
		public String toString() {
			return "created on  [dateCreated=" + dateCreated + " ,color=" + color + ", filled=" + filled + "]";
		}//end of toString
}//end of GeometricObject class
____________________________________________________________________________________________________________


public class Circle extends GeometricObject implements Colorable {
	public int x,y,radius; 
	public String circleColor;
	public static final float PI = 3.14159f;
	
	public Circle(){
		super();
		x = 40;
		y = 50;
		radius = 8;
		circleColor = "White"; 
	}//default constructor



	@Override
	public String toString() {
		return "Circle x=" + x + ", y=" + y + ", radius=" + radius + ", circleColor=" + circleColor + "";
	}//end of toString



	@Override
	public void howToColor() {
		System.out.println("Color all around");
		
	}//end of howToColor



	@Override
	public double getArea() {
		return PI * radius * radius;
	
	}//end of getArea



	@Override
	public double getPerimeter() {
		
		return 2 * PI * radius;
	}//end of getPerimeter
	
	
}//end of Circle class
__________________________________________________________________________________________

public class Square extends GeometricObject implements Colorable {
	private double width; 
	private double height;
	
	public Square() {
		super();
		this.width = 1.0;
		this.height = 1.0;
	}//default constructor

	public Square(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}//constructor with specified fields
	
	public double getArea(){
		return width * height;
	}//end of getArea method
	
	public double getPerimeter(){
		return 4 * height;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
		
	}

	@Override
	public String toString() {
		return "Square width=" + width + ", height=" + height + "";
	}
}//end of Square class
__________________________________________________________________________________________

public class Rectangle extends GeometricObject implements Colorable {
	double width, height;

	public Rectangle() {
		width = 1;
		height = 1;
	}//default constructor

	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}//end of constructor

	public double getArea(){
		return width * height;
	}//end of getArea

	public double getPerimeter(){
		return (2 * width) + (2 * height);
	}//end of getPerimeter

	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
		
	}//end of howToColor

	@Override
	public String toString() {
		return "Rectangle width=" + width + ", height=" + height + "";
	}
	
	

}//end of Rectangle class

__________________________________________________________________________________________

public class Triangle extends GeometricObject implements Colorable {
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

		@Override
		public void howToColor() {
			System.out.println("Color all three sides");
			
		}//end of howToColor()
		
		
		
}//end of Triangle extends GeometricObject class
__________________________________________________________________________________________


public class ArrayGeometricObjects {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Square square1 = new Square(5,5);
		Triangle triangle1 = new Triangle(9,16,11);
		Rectangle rectangle1 = new Rectangle();
		Square square2 = new Square(10,10);
		
		GeometricObject[] objects = new GeometricObject[5];
		
		objects[0] = circle1;
		objects[1]= square1;
		objects[2] = triangle1;
		objects[3]= rectangle1;
		objects[4]= square2;
		
		for(int i =0; i < objects.length; i++){
			System.out.println(objects[i].toString());
			((Colorable) objects[i]).howToColor();
			System.out.println("\n");
		}//end of for loop
	}//end of main 
	
	
}//end of ArrayGeometricObjects
__________________________________________________________________________________________
///////////////// OUTPUT ////////////////////////////

Circle x=40, y=50, radius=8, circleColor=White
Color all around


Square width=5.0, height=5.0
Color all four sides


Triangle side1=9.0, side2=16.0, side3=11.0
Color all three sides


Rectangle width=1.0, height=1.0
Color all four sides


Square width=10.0, height=10.0
Color all four sides

