package java1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.format.DateTimeParseException;
import java.io.BufferedReader;
import java.io.IOException;

public class BookingHandler {
	
	private ArrayList<Booking> schedurlist = new ArrayList<Booking>();
	
	
	
	public Boolean checkBookingTime(Booking trybook) {
		
		    
				
			if (trybook.getStarttime().compareTo(trybook.getStopTime()) > 0) {
				return false;
			} else {
				for (int i = 0; i < schedurlist.size(); i++) {
											
					
					Boolean nyBokningFinnsRedan = trybook.getStarttime().equals(schedurlist.get(i).getStarttime()) &&
                                                  trybook.getStopTime().equals(schedurlist.get(i).getStopTime())  &&
                                                  trybook.getDate().equals(schedurlist.get(i).getDate());  
					
					Boolean nyBokningStartInnanforBokning = trybook.getStarttime().isAfter(schedurlist.get(i).getStarttime()) &&
							                                trybook.getStarttime().isBefore(schedurlist.get(i).getStopTime());
							
							
					Boolean nyBokningStopInnanforBokning = trybook.getStopTime().isAfter(schedurlist.get(i).getStarttime()) &&
							                               trybook.getStopTime().isBefore(schedurlist.get(i).getStopTime());
					
					
					Boolean nyBokningOverlapparBefintligBokning = trybook.getStarttime().isBefore(schedurlist.get(i).getStarttime()) &&
							trybook.getStopTime().isAfter(schedurlist.get(i).getStopTime());
					
					if(nyBokningStartInnanforBokning ||  
					   nyBokningStopInnanforBokning  || 
					   nyBokningOverlapparBefintligBokning ||
					   nyBokningFinnsRedan) {
						return false;
					}
					
				}
				return true;
			}
		  
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
    
    public LocalDate handleDateError(BufferedReader input) {
    	LocalDate bdate;
    	String date="";
    	try {
    		date =input.readLine();
    		DateTimeFormatter formatterdate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	    bdate  = LocalDate.parse(date, formatterdate);
    	}
    	catch (DateTimeParseException exc) {
    	    System.out.println("Du har angett felaktigt datumformat använd ÅÅÅÅ-MM-DD ");
    	   return null;
    	} catch (IOException e) {
    		System.out.println("IOException prova igen ");
			return null;
		} 
    	
    	return bdate;
	}
	
    public LocalTime handleTimeError(BufferedReader input) {
    	LocalTime btime;
    	String time="";
    	try {
    		time =input.readLine();
    		DateTimeFormatter formattertime = DateTimeFormatter.ofPattern("HH:mm");
    	    btime  = LocalTime.parse(time, formattertime);
    	}
    	catch (DateTimeParseException exc) {
    	    System.out.println("Du har angett felaktigt tidsformat använd Tmme:min ");
    	   return null;
    	} catch (IOException e) {
    		System.out.println("IOException prova igen ");
			return null;
		} 
    	
    	return btime;
	}
	

}
