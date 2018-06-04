package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java1.BookingHandler;
import java.time.LocalDate;
import java.time.LocalTime;


class BookingHandlerTest {

	


	@Test
	public void testStopTimeBeforeStarttime() {
		String date="";
		String time1="";
		String time2="";
		BookingHandler testbooking = new BookingHandler();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = "2018-04-10";
		//convert String to bdate
		LocalDate bdate = LocalDate.parse(date, formatter);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		time1 = "10:20";
		LocalTime btimestart = LocalTime.parse(time1, formatter2);
		
		time2 = "09:00";
		LocalTime btimestop = LocalTime.parse(time2, formatter2);
		

		
		// Illegal booking
		Assert.assertEquals(false, testbooking.addBookingTime(btimestart, btimestop , bdate));
		
	}
	
	@Test
	public void testStartTimeBeforeStoptime() {
		String date="";
		String time1="";
		String time2="";
		BookingHandler testbooking = new BookingHandler();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = "2018-04-10";
		//convert String to bdate
		LocalDate bdate = LocalDate.parse(date, formatter);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		time1 = "09:00";
		LocalTime btimestart = LocalTime.parse(time1, formatter2);
		
		time2 = "10:20";
		LocalTime btimestop = LocalTime.parse(time2, formatter2);
		

		
		// Ok booking
		Assert.assertEquals(true, testbooking.addBookingTime(btimestart, btimestop , bdate));
		
	}
	
	
	@Test
	public void testNewBookingStarttimeInsideOldBooking() {
		String date="";
		String time1="";
		String time2="";
		BookingHandler testbooking = new BookingHandler();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = "2018-04-10";
		//convert String to bdate
		LocalDate bdate = LocalDate.parse(date, formatter);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		time1 = "09:00";
		LocalTime btimestart = LocalTime.parse(time1, formatter2);
		
		time2 = "10:20";
		LocalTime btimestop = LocalTime.parse(time2, formatter2);
		
		// Add to this to bookinglist
		Assert.assertEquals(true, testbooking.addBookingTime(btimestart, btimestop , bdate));
		
		// Prepare new starttime
		time1="";
		time1 = "09:20";
		LocalTime teststart = LocalTime.parse(time1, formatter2);
		// Illegal booking 
		Assert.assertEquals(false, testbooking.addBookingTime(teststart, btimestop , bdate));
		
	}
	
	@Test
	public void testBookingtimeOccupiedSameTime() {
		String date="";
		String time1="";
		String time2="";
		BookingHandler testbooking = new BookingHandler();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = "2018-04-10";
		//convert String to bdate
		LocalDate bdate = LocalDate.parse(date, formatter);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		time1 = "09:00";
		LocalTime btimestart = LocalTime.parse(time1, formatter2);
		
		time2 = "10:20";
		LocalTime btimestop = LocalTime.parse(time2, formatter2);
		
		// Add to bookinglist
		Assert.assertEquals(true, testbooking.addBookingTime(btimestart, btimestop , bdate));

		
		// Illegal booking 
		Assert.assertEquals(false, testbooking.addBookingTime(btimestart, btimestop , bdate));
		
	}
	
	
	@Test
	public void testNewBookingEndtimeInsideOldBooking() {
		String date="";
		String time1="";
		String time2="";
		BookingHandler testbooking = new BookingHandler();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = "2018-04-10";
		//convert String to bdate
		LocalDate bdate = LocalDate.parse(date, formatter);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		time1 = "09:00";
		LocalTime btimestart = LocalTime.parse(time1, formatter2);
		
		time2 = "10:20";
		LocalTime btimestop = LocalTime.parse(time2, formatter2);
		
		// Add to bookinglist
		Assert.assertEquals(true, testbooking.addBookingTime(btimestart, btimestop , bdate));
		
		
		// Prepare Stoptime
		time2="";
		time2 = "10:10";
		LocalTime teststop = LocalTime.parse(time2, formatter2);

		
		// Illegal booking 
		Assert.assertEquals(false, testbooking.addBookingTime(btimestart, teststop , bdate));
		
	}
	
	@Test
	public void testNewOkBooking() {
		String date="";
		String time1="";
		String time2="";
		BookingHandler testbooking = new BookingHandler();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = "2018-04-10";
		//convert String to bdate
		LocalDate bdate = LocalDate.parse(date, formatter);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		time1 = "09:00";
		LocalTime btimestart = LocalTime.parse(time1, formatter2);
		
		time2 = "10:20";
		LocalTime btimestop = LocalTime.parse(time2, formatter2);
		
		// Add to bookinglist
		Assert.assertEquals(true, testbooking.addBookingTime(btimestart, btimestop , bdate));
		
		// Prepare new starttime
		time1="";
		time1 = "11:00";
		LocalTime teststart = LocalTime.parse(time1, formatter2);
		
		// Prepare new stoptime    
		time2="";
		time2 = "12:10";
		LocalTime teststop = LocalTime.parse(time2, formatter2);

		
		// This time shall be possible to book   
		Assert.assertEquals(true, testbooking.addBookingTime(teststart, teststop , bdate));
		
	}
	
	@Test
	public void testNewOverlappingBooking() {
		String date="";
		String time1="";
		String time2="";
		BookingHandler testbooking = new BookingHandler();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = "2018-04-10";
		//convert String to bdate
		LocalDate bdate = LocalDate.parse(date, formatter);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		time1 = "09:00";
		LocalTime btimestart = LocalTime.parse(time1, formatter2);
		
		time2 = "10:20";
		LocalTime btimestop = LocalTime.parse(time2, formatter2);
		
		// Add to bookinglist
		Assert.assertEquals(true, testbooking.addBookingTime(btimestart, btimestop , bdate));
		
		// Prepare new starttime
		time1="";
		time1 = "08:59";
		LocalTime teststart = LocalTime.parse(time1, formatter2);
		
		// Prepare new stoptime    
		time2="";
		time2 = "10:21";
		LocalTime teststop = LocalTime.parse(time2, formatter2);

		
		// Illegal booking 
		Assert.assertEquals(false, testbooking.addBookingTime(teststart, teststop , bdate));
		
	}
	
	
	


}
