package com.capgi;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void WhenHotelsAreAddedFindCheapestHotel() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		Hotel cheapestHotel = hotelReservation.findCheapestHotel();
		long totalDays = hotelReservation.getTotalNoOfDays("10sep2020", "11sep2020");
		long totalCost = cheapestHotel.getWeekDayRateRegCus() * totalDays;
		assertEquals(220, totalCost);
		assertEquals("Lakewood", cheapestHotel.getHotelName());
	}

	@Test
	public void WhenHotelsAreAddedReturnSize() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(3, hotelReservation.totalHotels());
	}

	@Test
	public void WhenHotelsAreAddedFindCheapestHotelBasedOnWeekDayAndWeekEndRates() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		List<String> cheapestHotelList = hotelReservation.findCheapestHotelBasedOnWeekEndAndWeekDaysOffer("11sep2020",
				"12sep2020");
		String cheapestHotel = "";
		for (String name : cheapestHotelList) {
			cheapestHotel = name;
		}
		assertEquals("Lakewood", cheapestHotel);
	}

	@Test
	public void WhenHotelsAreAddedWithRatingsShouldPassTest() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(3, hotel1.getRating());
	}

	@Test
	public void WhenHotelsAreAddedFindCheapestHotelBasedOnWeekDayAndWeekEndRatesAndBestRating() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		String cheapestHotelBestRated = hotelReservation
				.findCheapestHotelBasedOnWeekEndAndWeekDaysOfferAndBestRating("11sep2020", "12sep2020");
		assertEquals("Bridgewood:4:200", cheapestHotelBestRated);
	}

	@Test
	public void WhenHotelsAreAddedFindBestRatedHotel() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		String HotelBestRated = hotelReservation.findBestRatedHotel("11sep2020", "12sep2020");
		assertEquals("Ridgewood:370", HotelBestRated);
	}

}
