package ie.lyit.flight;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	Flight outbound;
	Flight inbound;
	ArrayList<Passenger> passengers;
	Booking booking;

	//create a booking for a passenger, an outbound flight and inbound flight
	//and passenger details
	@Before
	public void setUp() throws Exception {
		outbound = new Flight("RY 123", "Dublin", "London", 13,12,2018,02,10,100);
		inbound = new Flight("RY 321", "London", "Dublin", 17,12,2018,02,10,100);
		passengers = new ArrayList<Passenger>();
		passengers.add(new Passenger("Mr", "Padraig", "McAleer",1,7,1997,2,true));
		booking = new Booking(outbound, inbound, passengers);
	}

	@Test
	public void testBookingFlightFlightArrayListOfPassenger() {
		//fail("Not yet implemented");
		assertEquals(passengers, booking.getPassenger());
		assertEquals(outbound, booking.getOutboundIN());
		assertEquals(inbound, booking.getInboundIN());
		
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
		String str = "Outbound: " + outbound + " " + "Inbound: " + inbound + " " + "Total Price: " + booking.getTotalPrice() +  "Passenger Name: " + passengers;
		assertEquals(str, booking.toString());
	}

	//finding the passenger
	@Test
	public void testFindPassenger() {
		//fail("Not yet implemented");
		assertTrue(booking.findPassenger(new Passenger ("Mr", "Padraig", "McAleer",1,7,1997,2,true), passengers));
	}
	
	
	//calculating the price
	@Test
	public void testCalculatePrice() {
		//fail("Not yet implemented");
		double price = (inbound.getPrice() + outbound.getPrice())*passengers.size();
		assertEquals(price,booking.calculatePrice(),0.001);
		
	}
	
	
    //testing outbound flight
	@Test
	public void testSetOutbound() {
		//fail("Not yet implemented");
		Flight FlightObj = new Flight("RY 123", "Dublin", "London", 13,12,2018,02,10,100);
		booking.setOutbound(FlightObj);
	}
    
	//testing inbound flight
	@Test
	public void testSetinbound() {
		//fail("Not yet implemented");
		Flight newFlightObject = new Flight("RY 321", "London", "Dublin", 17,12,2018,02,10,100);
		booking.setinbound(newFlightObject);
	}

	@Test
	public void testSetTotalPrice() {
		//fail("Not yet implemented");
		booking.setTotalPrice();
		double price = (inbound.getPrice() + outbound.getPrice())*passengers.size();
		assertEquals(price,booking.getTotalPrice(), 0.001);
	}

}
