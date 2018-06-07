package org.cinematics.model;

public class Booking {
	
	private static int BOOKING_COUNTER = 0;
	private int bookingId;
	private Customer myCust;
	private Show myShow;
	
	public Booking() {
		bookingId = BOOKING_COUNTER;
		BOOKING_COUNTER++;
	}
		
	public void setCustomer(Customer c) {
		myCust = c;
	}
	public Customer getCustomer() {
		return myCust;
	}
	
	public void setShow(Show s) {
		myShow = s;
	}
	public Show getShow() {
		return myShow;
	}
	
	public int getBookingId() {
		return bookingId;
	}
}
