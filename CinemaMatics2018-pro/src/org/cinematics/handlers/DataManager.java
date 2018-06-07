package org.cinematics.handlers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.cinematics.model.Booking;
import org.cinematics.model.Movie;
import org.cinematics.model.Show;
import org.cinematics.model.Theatre;
/**
 * This class should be used to store all data that the cinema program needs
 * 
 *
 */
public class DataManager {
	
	private Map<String, Theatre> theatres;
	private Map<Integer, Booking> bookings;
	private Set<Movie> movies;
	
	public DataManager() {
		theatres = new TreeMap<String, Theatre>();
		bookings = new TreeMap<Integer, Booking>();
		movies = new TreeSet<Movie>(Comparator.comparing(Movie::getName));
	}
	
	public Theatre getTheatre(String name) {
		return theatres.get(name);
	}
	
	public Set<Movie> getAllMovies(){
		return movies;
	}
	
	public boolean addMovie(Movie movie) {
		return movies.add(movie);
	}
	
	public List<Theatre> getTheatres(){
		return theatres.values().stream().collect(Collectors.toList());
	}
	
	public boolean addTheatre(Theatre theatre) {
		if(!theatres.containsKey(theatre.getName())) {
			theatres.put(theatre.getName(), theatre);
			return true;
		}
		return false;
	}
	
	public boolean addShowToTheatre(Show show, String theatreName) {
		if(theatres.containsKey(theatreName)) {
			Theatre theatre = theatres.get(theatreName);
			theatre.addShow(show);
			return true;
		}
		return false;
	}
	
	
	public boolean saveBooking(Booking booking, Integer row, Integer col, Integer showId, String theatreName) {
		if(theatres.containsKey(theatreName)) {
			Theatre theatre = theatres.get(theatreName);
			Show show = theatre.getShow(showId);
			show.getBookings()[row][col] = booking;
			bookings.put(booking.getBookingId(), booking);
			return true;
		}
		return false;
	}
	
	public Theatre getTheatreForShow(Integer showId) {
		for(Theatre theatre : getTheatres()) {
			for(Show show : theatre.getAllShows()) {
				if(show.getId() == showId) {
					return theatre;
				}
			}
		}
		return null;
	}
	
	public Booking getBooking(Integer bookingId) {
		
		return bookings.get(bookingId);
	}
	
}