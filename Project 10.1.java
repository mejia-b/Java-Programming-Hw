/* Brenda Mejia
 * 10.1 Time Program 
 * Java Programmig COP 2800
 * November 18, 2016
 * 
 */


public class TestTime {

	public static void main(String[] args) {
		//Creates Time object called time1
		Time time1 = new Time();
		//Prints time1 objects time (hour:minute:second)
		System.out.println("Current time is " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());	
		
		//Creates Time object called time2 with specified elapseTime
		Time time2 = new Time(555550000);
		//Prints time2 objects time (hour:minute:second)
		System.out.println("Elapsed time is " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());	
		
	}//end of main 

}//end of TestTime Class

//////////////////////////////////////////////

public class Time {
	//data fields
	long hour, minute, second; 

	public Time() {
		super();
		long totalMillis = System.currentTimeMillis();
		long totalSeconds = totalMillis/1000;
		second = totalSeconds % 60;
		long totalMinute = totalSeconds/60;
		minute = totalMinute % 60;
		long totalHour = totalMinute/ 60;
		hour = totalHour % 24;
	}//end of default constructor

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}//end of specified hour, minute, second constructor
	
	
	public Time(long elapseTime){
		setTime(elapseTime);
	}//end of Constructor

	public int getHour() {
		return (int)hour;
	}//end of getHour

	public int getMinute() {
		return (int)minute;
	}//end of getMinute

	public int getSecond() {
		return (int)second;
	}//end of getSecond
	
	void setTime(long elapseTime){
	
		long totalMillis = elapseTime;
		long totalSeconds = totalMillis/1000;
		second = totalSeconds % 60;
		long totalMinute = totalSeconds/60;
		minute = totalMinute % 60;
		long totalHour = totalMinute/ 60;
		hour = totalHour % 24;
		
	}//end of setTime method
	
}//end of Time class

//////////////// OUTPUT ////////////////

Current time is 22:53:10 // this time will be different every time the program runs
Elapsed time is 10:19:10
