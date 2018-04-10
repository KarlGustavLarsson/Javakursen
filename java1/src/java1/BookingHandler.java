package java1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class BookingHandler {
	
	private ArrayList<Booking> schedurlist = new ArrayList<Booking>();
	
	
	
	public Boolean checkBookingTime(Booking trybook) {
		
		/* for (int i = 0; i < schedurlist.size(); i++) {
			
			if (trybook.getStarttime().) )
			 
		} */
		  
		   return true; 
		
		
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
		  
		
	}
	

}
