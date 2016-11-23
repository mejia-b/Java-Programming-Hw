public class TestStock {

	public static void main(String[] args) {
		Stock stock1 = new Stock("ORCL","ORACLE CORPORATION");
		System.out.println("SYMBOL: " + stock1.symbol + "\n"+
		"COMPANY NAME: " + stock1.name + "\n" + "PREVIOUS PRICE: " +
				stock1.setpreviousClosingPrice(34.5) + "\n" + "CURRENT PRICE: " + 
		stock1.setcurrentPrice(34.35)); 
		System.out.printf("PERCENT CHANGE: %.3f\n", stock1.getChangePercent());

	}//end of main 

}//end of TestStock class

//////////////////////////////////////////////////////////////////////////////////
class Stock {
	String symbol,name;
	double previousClosingPrice,currentPrice;
	
	Stock(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;
	}//end of default constructor
	
	double setpreviousClosingPrice(double closingPrice){
		return previousClosingPrice = closingPrice;
	}//end of setpreviousClosingPrice
	
	double setcurrentPrice(double price){
		return currentPrice = price;
	}//end of setcurrentPrice
	
	double getChangePercent(){
	 return  ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
 }//end of getChangePercent

}//end of Stock class

///////// OUTPUT////////////////

SYMBOL: ORCL
COMPANY NAME: ORACLE CORPORATION
PREVIOUS PRICE: 34.5
CURRENT PRICE: 34.35
PERCENT CHANGE: -0.435
