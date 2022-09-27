package lab;

public class RoadTripLog {
	
	
	
	private double TotalDistance;
	private double TotalFuel;
	private String tripName;
	
	public RoadTripLog(String name) {
		this.TotalDistance = 0;
		this.TotalFuel = 0;
		this.tripName = name;
		
	}
	public double addDistance(double dis) {
		return TotalDistance += dis;
	}
	public double addFuel(double fuel) {
		return TotalFuel +=fuel;
	}
	public double getTotalDistance() {
		return TotalDistance;
	}
	public double getTotalFuel() {
		return TotalFuel;
	}
	public double getMPG() {
		return Math.round((TotalDistance/TotalFuel) * 10.0) / 10.0;
	}
	
	public String toString() {
		return ("Trip: "+ tripName + "/n Distance: " + TotalDistance + "/n Fuel Used: " + TotalFuel +  "MPG: "  + Math.round((TotalDistance/TotalFuel)  * 10.0)/ 10.0);
	}
	
	
	
}
