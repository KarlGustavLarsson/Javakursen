package org.cinematics.model;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
	
	private String cinemaName;
	List<Theatre> myTheatres;
	
	public Cinema(String cName) {
		cinemaName = cName;
		myTheatres = new ArrayList<>();
	}
	
	public String getCinemaName() {
		return cinemaName;
	}
	
	public void addTheatre(Theatre t) {
		myTheatres.add(t);
	}
	
}
