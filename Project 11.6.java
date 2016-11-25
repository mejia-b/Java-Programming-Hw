import java.util.ArrayList;
import java.util.Date;
public class Lists {

	public static void main(String[] args) {
		ArrayList<Object> list =  new ArrayList<>();
		
		list.add(new Loan());
		list.add(new Date());
		list.add("Hello World");
		list.add(new Circle());
		
		for (int i = 0; i <= list.size() - 1; i++){
			System.out.println(list.get(i).toString());
		}//end of for loop 
		
	}//end of main 

}//end of Lists class

________________________________________________________________________________________________

// **** THE FOLLOWING CLASSES I CREATED IN ORDER FOR ME TO ADD THEM TO THE ARRAY LIST ABOVE 

public class Circle {
	public int x,y,radius; 
	public String circleColor;
	
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
}//end of Circle class
______________________________________________________________________________________________________

public class Loan {
	public double loanAmount;
	public int numOfYears;
	public double annualInterestRate;
	
	public Loan(){
		super();
		this.loanAmount = 1200;
		this.numOfYears = 1;
		this.annualInterestRate = 3.5;
	}//default constructor

	@Override
	public String toString() {
		return "Loan loanAmount=" + loanAmount + ", numOfYears=" + numOfYears + ", annualInterestRate="
				+ annualInterestRate + "";
	}//end of toString 
	
}//end of Loan class

////////////// OUTPUT ///////////////////

Loan loanAmount=1200.0, numOfYears=1, annualInterestRate=3.5
Fri Nov 25 17:07:18 EST 2016
Hello World
Circle x=40, y=50, radius=8, circleColor=White

