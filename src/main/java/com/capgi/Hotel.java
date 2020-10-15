package com.capgi;

public class Hotel {
	private String hotelName;
	private int weekEndRateRegCus;
	private int weekDayRateRegCus;

	public Hotel(String hotelName, int weekDayRateRegCus, int weekEndRateRegCus) {
		super();
		this.hotelName = hotelName;
		this.weekDayRateRegCus = weekDayRateRegCus;
		this.weekEndRateRegCus = weekEndRateRegCus;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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
