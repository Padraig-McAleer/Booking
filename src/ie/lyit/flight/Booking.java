package ie.lyit.flight;
import java.util.ArrayList;

public class Booking {
	
	private Flight outbound; //creating the outbound variable
	private Flight inbound;  //creating the inbound variable
	private double totalPrice;  //creating the totalPrice variable
	
	//ArrayList of passengers
	private ArrayList<Passenger> passengers;
	
	//Default constructor for booking
	public Booking()
	{
		this.inbound = new Flight();
		this.outbound = new Flight();
		this.passengers = new ArrayList<Passenger>();
		this.totalPrice = 0;
		
		
	}
	//Initialization Constructor
	public Booking(Flight o, Flight i, ArrayList<Passenger> p) {
		outbound = o;
		inbound = i;
		totalPrice = 0;
		passengers = p;
	}
	
	// Calling toString() method, and adding additional bits
	@Override
	public String toString() {
		return "Outbound: " + outbound + " " + "Inbound: " + inbound + " " + "Total Price: " + totalPrice +  "Passenger Name: " + passengers;
	}
	
	// equals() method
		// ==> Called when comparing an object with another object
	@Override
	public boolean equals(Object obj) {
		Booking bObject;
		if(obj instanceof Booking)
			bObject = (Booking)obj;
		else
			return false;
		
		return this.outbound.equals(bObject.outbound) &&
				this.inbound.equals(bObject.inbound) &&
				this.passengers.equals(bObject.passengers);
	}
	
	public boolean findPassenger(Passenger pr, ArrayList<Passenger>passengers) {
		return passengers.contains(pr);
	}
	
	//method to calculate price
	public double calculatePrice() {
		return totalPrice = (inbound.getPrice() + outbound.getPrice())*passengers.size();
	}
	
	//getters and setters for Booking
	public void setOutbound(Flight outboundIN) {
		this.outbound = outboundIN;
	}
	public Flight getOutboundIN() {
		return outbound;
	}
	
	public void setinbound(Flight inboundIN) {
		this.inbound = inboundIN;
	}
	public Flight getInboundIN() {
		return inbound;
	}
	
	public ArrayList<Passenger> getPassenger(){
		return passengers;
	}
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	public void setTotalPrice() {
		this.totalPrice = calculatePrice();
	}
	public double getTotalPrice() {
		return totalPrice;
	}

}
