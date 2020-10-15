package com.capgi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class HotelReservation {
	ArrayList<Hotel> listOfHotels = new ArrayList<Hotel>();

	public void addHotel(Hotel obj) {
		listOfHotels.add(obj);
	}

	public int totalHotels() {
		return listOfHotels.size();
	}

	public long getTotalNoOfDays(String start, String end) throws ParseException {
		Date startDate = new SimpleDateFormat("ddMMMyyyy").parse(start);
		Date endDate = new SimpleDateFormat("ddMMMyyyy").parse(end);
		long TotalNoOfDays = 1 + (endDate.getTime() - startDate.getTime()) / 1000 / 60 / 60 / 24;
		return TotalNoOfDays;
	}

	public Hotel findCheapestHotel() {
		Hotel cheapestHotel = listOfHotels.stream().min(Comparator.comparing(Hotel::getWeekDayRateRegCus)).orElse(null);
		return cheapestHotel;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Hotel Reservation System!");
		Hotel hotel1 = new Hotel("Lakewood", 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		System.out.println("Enter the check in date in proper format(ddMMMyyyy)");
		String startDate = sc.nextLine();
		System.out.println("Enter the check out date in proper format(ddMMMyyyy)");
		String endDate = sc.nextLine();
		Hotel cheapestHotel = hotelReservation.findCheapestHotel();
		long totalDays = hotelReservation.getTotalNoOfDays("10Sep2020", "11Sep2020");
		long totalCost = cheapestHotel.getWeekDayRateRegCus() * totalDays;

		System.out.println("Cheapest Hotel for your stay: " + cheapestHotel.getHotelName());
		System.out.println("Total expense: " + totalCost);

	}
}
