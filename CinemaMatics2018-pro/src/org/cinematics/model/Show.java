package org.cinematics.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.cinematics.exceptions.OutOfSeatingBoundsException;

// Describes a show in the theatre, Start, End and Movie

public class Show implements Comparable <Show>{
	
	private static int ID_COUNTER = 1;
	private Integer id; 
	private LocalDateTime start;
	private LocalDateTime end;
	private Movie movie;
	private Booking[][] bookings = new Booking[Theatre.SEAT_ROWS][Theatre.SEAT_COLS];	// The seating arrangement

	public Show() {
		id = ID_COUNTER;
		ID_COUNTER++;
		
	}
	
	public Show(LocalDateTime start, LocalDateTime end, Movie movie) {
		this.start = start;
		this.end = end;
		this.movie = movie;
		
		id = ID_COUNTER;
		ID_COUNTER++;
	}
	
	//Make this object sortable in an arraylist
	@Override
	public int compareTo(Show ob) {
		if(this.start.isEqual(ob.getStart()))
			return 0;
		
		if(this.start.isBefore(ob.getStart()))
			return -1;

		return 1;
	}
	
	public long getDuration() {
		return this.getStart().until(this.getEnd(), ChronoUnit.MINUTES);
	}
	
	public Booking[][] getBookings() {
		return bookings;
	}

	public boolean checkOverlap(LocalDateTime startTime, LocalDateTime endTime) {
		return (start.isBefore(endTime) && startTime.isBefore(end));
	}
	
	/**
	 * @return the start
	 */
	public LocalDateTime getStart() {
		return start;
	}
	
	/**
	 * @param start the start to set
	 */
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	
	/**
	 * @return the end
	 */
	public LocalDateTime getEnd() {
		return end;
	}
	
	/**
	 * @param end the end to set
	 */
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	
	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}
	
	/**
	 * @param movie the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	

	/**
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param show is
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	 @Override
	 public String toString() {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm");
		 String startTime = formatter.format(start);
		 String endTime = formatter.format(end);
		 return "ShowId:" + this.id  + " Namn:" + this.movie.getName() + " Start:" + startTime + " Slut:" + endTime; 
	 }
	
	public void showAllSeats() {
		System.out.print(" |");
		for(int i = 0; i < Theatre.SEAT_COLS; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i = 0; i < Theatre.SEAT_COLS; i++) {
			System.out.print("--");
		}
		System.out.println("-");
		for(int row = 0; row < bookings.length; row++) {
			System.out.print(row+"|");
			for(int col = 0; col < bookings[row].length; col++) {
				System.out.print((bookings[row][col]!=null)?"X ":"O ");
			}
			System.out.println("");
		}
		System.out.print("*\\");
		for(int i = 1; i < Theatre.SEAT_COLS; i++) {
			System.out.print("__");
		}
		System.out.println("/*");
		System.out.println("");
	}

	public void showTickets(Booking booking) {
		List<Seat> bookedSeats = new ArrayList<Seat>();
		for(int row = 0; row < bookings.length; row++) {
			for(int col = 0; col < bookings[row].length; col++) {
				Booking seatInTheatre = bookings[row][col];
				if(seatInTheatre == null) {
					continue;
				}
				if(booking.getBookingId() == seatInTheatre.getBookingId()) {
					bookedSeats.add(new Seat(row,col));	
				}
			}
		}
		System.out.println("----Ticket----");
		System.out.println("Booking id: "+booking.getBookingId());
		System.out.println(booking.getShow().toString());
		System.out.print("Seats: ");
		bookedSeats.forEach(seat -> {
			System.out.print("(row: "+seat.row+", column: "+seat.col+")"+ " ");
		});
		System.out.println("");
		System.out.println("--------------");
	}
	
	public Seat[] getSeats(int startingRow, int startingCol, int numberOfSeats) {
		Seat[] seats = new Seat[numberOfSeats];
		for(int i = 0; i < numberOfSeats; i++) {
			seats[i] = new Seat(startingRow, startingCol+i);
		}
		return seats;
	}
	
	public boolean areSeatsAvailable(Seat[] seats) throws OutOfSeatingBoundsException{
		for(int i = 0; i < seats.length; i++) {
			if(!isSeatAvailable(seats[i].row, seats[i].col)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isSeatAvailable(int row, int col) throws OutOfSeatingBoundsException{
		if(row >= Theatre.SEAT_ROWS || row < 0) {
			throw new OutOfSeatingBoundsException("Row out of bounds");
		} 
		if(col >= Theatre.SEAT_COLS || col < 0) {
			throw new OutOfSeatingBoundsException("Col out of bounds");
		}
		return (bookings[row][col] == null);
	}

}
