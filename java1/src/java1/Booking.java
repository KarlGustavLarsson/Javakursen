package java1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
	
	private LocalTime starttime;
	private LocalTime stoptime;
	private LocalDate date;
	
	public void setStartTime(LocalTime starttime) {
		this.starttime = starttime;
	}
	  
	public LocalTime getStarttime() {
		return this.starttime;
	}
	
	public void setStoptTime(LocalTime stoptime) {
		this.stoptime = stoptime;
	}
	  
	public LocalTime getStopTime() {
		return this.stoptime;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	  
	public LocalDate getDate() {
		return this.date;
	}
	

	
	@Override
	public String toString(){
		return ("Bokat: "  + date + " " +   starttime + " " + stoptime);
	}

}
