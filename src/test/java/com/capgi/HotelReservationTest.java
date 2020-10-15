package com.capgi;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void WhenHotelsAreAddedFindCheapestHotel() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		Hotel cheapestHotel = hotelReservation.findCheapestHotel();
		try {
			hotelReservation.setStartDate1("10sep2020");
			hotelReservation.setEndDate1("11sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		long totalDays = hotelReservation.getTotalNoOfDays();
		long totalCost = cheapestHotel.getWeekDayRateRegCus() * totalDays;
		assertEquals(220, totalCost);
		assertEquals("Lakewood", cheapestHotel.getHotelName());
	}

	@Test
	public void WhenHotelsAreAddedReturnSize() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(3, hotelReservation.totalHotels());
	}

	@Test
	public void WhenHotelsAreAddedFindCheapestHotelBasedOnWeekDayAndWeekEndRates() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 160, 60, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		try {
			hotelReservation.setStartDate1("11sep2020");
			hotelReservation.setEndDate1("12sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		List<String> cheapestHotelList = hotelReservation.findCheapestHotelBasedOnWeekEndAndWeekDaysOffer();
		String cheapestHotel = "";
		for (String name : cheapestHotelList) {
			cheapestHotel = name;
		}
		assertEquals("Lakewood", cheapestHotel);
	}

	@Test
	public void WhenHotelsAreAddedWithRatingsShouldPassTest() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(3, hotel1.getRating());
	}

	@Test
	public void WhenHotelsAreAddedFindCheapestHotelBasedOnWeekDayAndWeekEndRatesAndBestRating() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		try {
			hotelReservation.setStartDate1("11sep2020");
			hotelReservation.setEndDate1("12sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		String cheapestHotelBestRated = hotelReservation.findCheapestHotelBasedOnWeekEndAndWeekDaysOfferAndBestRating();
		assertEquals("Bridgewood:4:200", cheapestHotelBestRated);
	}

	@Test
	public void WhenHotelsAreAddedFindBestRatedHotel() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		try {
			hotelReservation.setStartDate1("11sep2020");
			hotelReservation.setEndDate1("12sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		String HotelBestRated = hotelReservation.findBestRatedHotel();
		assertEquals("Ridgewood:370", HotelBestRated);
	}

	@Test
	public void WhenHotelsAreAddedWithRewardCustomerRatesShouldPassTest() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(110, hotel2.getWeekDayRateRewardCus());
	}

	@Test
	public void WhenHotelsAreAddedFindCheapestHotelBasedOnWeekDayAndWeekEndRatesAndBestRatingForRewardCustomer()
			throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		try {
			hotelReservation.setStartDate1("11sep2020");
			hotelReservation.setEndDate1("12sep2020");
		} catch (InputValidationException e) {
			System.out.println(e.getMessage());
		}
		String cheapestHotelBestRated = hotelReservation
				.findCheapestHotelBasedOnWeekEndAndWeekDaysOfferAndBestRatingForRewardCustomer();
		assertEquals("Ridgewood:5:140", cheapestHotelBestRated);
	}

}
