package org.cinematics.model;
import java.util.ArrayList;
import java.util.List;

// Describes the Theatre studio where the movie is shown

public class Theatre {
	public static int SEAT_ROWS = 5;
	public static int SEAT_COLS = 10;
	private String name;						// The studio might have a name like "Blue Room"
	private List<Show> shows;					// The show that is booked for the studio


	// Constructor
	public Theatre(String name) {
		this.name = name;
		shows = new ArrayList<>();
	}

	public List<Show> getAllShows() {
		return shows;
	}

	
	public void addShow(Show s) {
		shows.add(s);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the show
	 */
	public Show getShow(Integer id) {
		for(Show show : shows) {
			if(show.getId() == id) {
				return show;
			}
		}
		return null;
	}
	/**
	 * @param show the show to set
	 */
	
	public List<Show> getAllShowsInTheatre() {
		return shows;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
