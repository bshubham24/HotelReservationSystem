package com.capgi;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void WhenHostelsAreAddedFindCheapestHotel() throws ParseException {
		Hotel hotel1 = new Hotel("Lakewood", 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		Hotel cheapestHotel = hotelReservation.findCheapestHotel();
		long totalDays = hotelReservation.getTotalNoOfDays("10Sep2020", "11Sep2020");
		long totalCost = cheapestHotel.getWeekDayRateRegCus() * totalDays;
		assertEquals(220, totalCost);
		assertEquals("Lakewood", cheapestHotel.getHotelName());
	}

	@Test
	public void WhenHostelsAreAddedReturnSize() {
		Hotel hotel1 = new Hotel("Lakewood", 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150);

		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotel1);
		hotelReservation.addHotel(hotel2);
		hotelReservation.addHotel(hotel3);
		assertEquals(3, hotelReservation.totalHotels());
	}
}
