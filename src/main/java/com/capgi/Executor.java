package com.capgi;

import java.util.List;
import java.util.Scanner;

public class Executor {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Hotel Reservation System!");
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		System.out.println("Enter the check in date in proper format(ddMMMyyyy)");
		String startDate = sc.nextLine();
		System.out.println("Enter the check out date in proper format(ddMMMyyyy)");
		String endDate = sc.nextLine();
		long totalDays = hotelReservation.getTotalNoOfDays(startDate, endDate);
		List<String> cheapHotelList = hotelReservation.findCheapestHotelBasedOnWeekEndAndWeekDaysOffer(startDate,
				endDate);
		for (String name : cheapHotelList) {
			System.out.println("Cheapest Hotel for your stay: " + name);
		}

	}
}
