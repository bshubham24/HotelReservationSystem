package com.capgi;

public class Hotel {
	private String hotelName;
	private int rating;
	private int weekDayRateRegCus;
	private int weekEndRateRegCus;
	private int weekDayRateRewardCus;

	public Hotel(String hotelName, int rating, int weekDayRateRegCus, int weekEndRateRegCus, int weekDayRateRewardCus,
			int weekEndRateRewardCus) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekDayRateRegCus = weekDayRateRegCus;
		this.weekEndRateRegCus = weekEndRateRegCus;
		this.weekDayRateRewardCus = weekDayRateRewardCus;
		this.weekEndRateRewardCus = weekEndRateRewardCus;
	}

	private int weekEndRateRewardCus;

	public int getWeekEndRateRewardCus() {
		return weekEndRateRewardCus;
	}

	public void setWeekEndRateRewardCus(int weekEndRateRewardCus) {
		this.weekEndRateRewardCus = weekEndRateRewardCus;
	}

	public int getWeekDayRateRewardCus() {
		return weekDayRateRewardCus;
	}

	public void setWeekDayRateRewardCus(int weekDayRateRewardCus) {
		this.weekDayRateRewardCus = weekDayRateRewardCus;
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
