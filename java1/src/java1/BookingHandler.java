package java1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class BookingHandler {
	
	private ArrayList<Booking> schedurlist = new ArrayList<Booking>();
	
	
	
	public Boolean checkBookingTime(Booking trybook) {
				
			if (trybook.getStarttime().compareTo(trybook.getStopTime()) > 0) {
				return false;
			} else {
				for (int i = 0; i < schedurlist.size(); i++) {
					if (trybook.getStarttime().isBefore(schedurlist.get(i).getStarttime())) {
						return true;
					}
					if (trybook.getStopTime().isBefore(schedurlist.get(i).getStarttime())) {
						return true;
					}
					if (trybook.getStarttime().isAfter((schedurlist.get(i).getStopTime()))) {
						return true;
					}
				}
				
			}
		   return false; 
	}
	
	public Boolean addBookingTime(LocalTime starttime, LocalTime stoptime , LocalDate date) {
		  
	   Booking booking = new Booking();
	   
	   booking.setStartTime(starttime);
	   booking.setStoptTime(stoptime);
	   booking.setDate(date);
	   
	   Boolean bookcheck = checkBookingTime(booking);
	   
	   if (bookcheck == true) {
		   schedurlist.add(booking);
		   return true;
	   } else    {
		   return false;
	   }  
		   
	}
	
    public void printBookingList() {
    	for (Booking booking : schedurlist) {
    		
    		System.out.println(booking.toString());
    		
    	}
    	
	}
	

}
