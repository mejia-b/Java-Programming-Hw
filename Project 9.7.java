import java.util.Date;
public class BankAccount {

	public static void main(String[] args) {
		Account acct1 = new Account(1122,20000);
		acct1.setAnnualInterestRate(4.5);
		acct1.withdraw(2500);
		acct1.deposit(3000);
		
		System.out.printf("Balance: $%.2f\nMonthly Interest: $%.2f\nDate: %s", 
				acct1.getBalance(),acct1.getMonthlyInterest(),acct1.getDateCreated());

	}// end of main 

}//end of BankAccount class

//////////////////////////////////////////////////
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	Date date = new Date();// to get date from system
	DateFormat dataCreated = new SimpleDateFormat("yyyy/MM/dd"); //  to get date from system
	
	public Account() {
		super();
		
	}//default constructor

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}//constructor

	public int getId() {
		return id;
	}//end of getId

	public void setId(int id) {
		this.id = id;
	}//end of setId

	public double getBalance() {
		return balance;
	}//end of getBalance

	public void setBalance(double balance) {
		this.balance = balance;
	}//end of setBalance method

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}//end of getAnnualInterestRate method

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}//end of setAnnualInterestRate method

	public String  getDateCreated() {
		return dataCreated.format(date);
	}//end of getDateCreated method
	
	double getMonthlyInterestRate(){
		return (annualInterestRate/100) / 12;
	}//end of getMonthlyInterestRate method
	
	double getMonthlyInterest(){
		return balance * getMonthlyInterestRate();
	}//end of getMonthlyInterest method
	
	void withdraw(double withdrawal){
		 balance -= withdrawal;
	}//end of withdraw method
	
   void deposit(double deposit){
		balance += deposit;
	}//end of deposit method
	
}//end of Account class

/////////// OUTPUT/////////////

Balance: $20500.00
Monthly Interest: $76.88
Date: 2016/11/23
