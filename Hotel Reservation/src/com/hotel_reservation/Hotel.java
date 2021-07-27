package com.hotel_reservation;

public class Hotel {
	private String hotelName;
	private int regularRate;
	public Hotel(String hotelName, int regularRate) {
		this.setHotelName(hotelName);
		this.setRegularRate(regularRate);
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRegularRate() {
		return regularRate;
	}

	public void setRegularRate(int regularRate) {
		this.regularRate = regularRate;
	}
}
