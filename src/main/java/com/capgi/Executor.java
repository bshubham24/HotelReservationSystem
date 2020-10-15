package com.capgi;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Hotel Reservation System!");
		Customer customer = new Customer();
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);

		boolean check = false;
		while (!check) {
			try {
				System.out.println("Enter the checkin date in proper format(ddMMMyyyy)");
				String startDate = sc.nextLine();
				check = hotelReservation.setStartDate1(startDate);
			} catch (InputValidationException e) {
				System.out.println(e.getMessage());
			}
		}
		check = false;
		while (!check) {

			try {
				System.out.println("Enter the checkout date in proper format(ddMMMyyyy)");
				String endDate = sc.nextLine();
				check = hotelReservation.setEndDate1(endDate);
			} catch (InputValidationException e) {
				System.out.println(e.getMessage());
			}
		}
		check = false;
		while (!check) {

			try {
				System.out.println("Enter the type of customer(Reward/Regular)");
				String typeOfCustomer = sc.nextLine();
				check = customer.setCustomerType(typeOfCustomer);
			} catch (InputValidationException e) {
				System.out.println(e.getMessage());
			}
		}
		String cheapestHotelBestRated = hotelReservation.findCheapestHotelBasedOnWeekEndAndWeekDaysOfferAndBestRating();
		System.out
				.println("Hotel:Rating:Price:Customer = " + cheapestHotelBestRated + ":" + customer.getCustomerType());

	}
}
