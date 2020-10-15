package com.capgi;

public class Hotel {
	private String hotelName;
	private int rating;
	private int weekEndRateRegCus;
	private int weekDayRateRegCus;

	public Hotel(String hotelName, int rating, int weekDayRateRegCus, int weekEndRateRegCus) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekEndRateRegCus = weekEndRateRegCus;
		this.weekDayRateRegCus = weekDayRateRegCus;

	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getWeekEndRateRegCus() {
		return weekEndRateRegCus;
	}

	public void setWeekEndRateRegCus(int weekEndRateRegCus) {
		this.weekEndRateRegCus = weekEndRateRegCus;
	}

	public int getWeekDayRateRegCus() {
		return weekDayRateRegCus;
	}

	public void setWeekDayRateRegCus(int weekDayRateRegCus) {
		this.weekDayRateRegCus = weekDayRateRegCus;
	}

}
