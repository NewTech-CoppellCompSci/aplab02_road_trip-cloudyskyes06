package lab;

public class RoadTripLog {
	
	
	
	private double distance;
	private double Totalfuel;
	private String tripName;
	
	public RoadTripLog(String name) {
		this.distance = 0;
		this.Totalfuel = 0;
		this.tripName = name;
		
	}
	public double addDistance(double dis) {
		return distance += dis;
	}
	public double addFuel(double fuel) {
		return Totalfuel +=fuel;
	}
	public double getDistance() {
		return distance;
	}
	public double getTotalfuel() {
		return Totalfuel;
	}
	public double getMPG() {
		return Math.round((distance/Totalfuel) * 10.0) / 10.0;
	}
	
	public String toString() {
		return ("Trip: "+ tripName + "/n Distance: " + distance + "/n Fuel Used: " + Totalfuel +  "MPG: "  + Math.round((distance/Totalfuel)  * 10.0)/ 10.0);
	}
	
	
	
}
