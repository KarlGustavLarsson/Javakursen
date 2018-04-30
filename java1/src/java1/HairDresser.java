package java1;

import java.time.LocalTime;
import java.util.ArrayList;

public class HairDresser extends BookingHandler{
	
	private final String name;

	public HairDresser( String nameInput ) {	
		super();
		this.name = nameInput;
		
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void printBookingList() {
		System.out.println(name.toString());
		
    	for (Booking booking : schedurlist) {
    		System.out.println("Pris " + booking.getPrice());
    		System.out.println(booking.toString());
    		
    	}
    	
	}
	

	
}
