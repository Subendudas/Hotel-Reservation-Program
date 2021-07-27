package com.hotel_reservation;

import java.util.ArrayList;
public class Reservation
{
	//UC-1
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	public void addHotelDetails() 
	{
		hotelList.add(new Hotel("Lakewood", 110));
		hotelList.add(new Hotel("Bridgewood", 150));
		hotelList.add(new Hotel("Ridgewood", 220));
	}
	public static void main(String args[]) {
		System.out.println("Welcom To Hotel Reservation Program.");
		Reservation reservation = new Reservation();
		reservation.addHotelDetails();
	}
	
}