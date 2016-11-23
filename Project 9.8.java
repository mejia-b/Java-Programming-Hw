public class TestFan {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		System.out.println(fan1.toString());
		
		System.out.println(fan2.toString());

	}//end of main 

}// end of TestFan class

/////////////////////////////////////////////////////////////////////////////////////////
class Fan {
	 
	 final static int SLOW = 1, MEDIUM = 2, FAST = 3;
	 private int speed = SLOW;
	 private boolean on;
	 private double radius = 5;
	 String color = "blue";
	 
	 
	public Fan() {
		super();
	}//end of default constructor
	
	
	 
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		if(on == true){
		  return "Fan [speed=" + speed + ",radius=" + radius + ", color=" + color + "]";
		}
		else {
			return "Fan [radius=" + radius + ", color=" + color + " Fan is off ]";
		}//end of if statement
		
	}//end of toString method

	 
}//end of Fan class
///////////////////// OUTPUT ///////////////////////

Fan [speed=3,radius=10.0, color=yellow]
Fan [radius=5.0, color=blue Fan is off ]
