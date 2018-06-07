package test;
import java.util.ArrayList;
import java.util.List;



// Describes the Theatre studio where the movie is shown

public class Theatre {
	
	public static int SEAT_ROWS = 4;
	public static int SEAT_COLS = 9;
	private int id;
	private String name;						
												


	public Theatre() {
		
	}
	// Constructor
	public Theatre(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	public int getId(){
		return this.id;
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
	
	@Override
	public String toString() {
		return name;
	}
}
