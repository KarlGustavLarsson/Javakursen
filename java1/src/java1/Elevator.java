package java1;

import java.util.ArrayList;

public class Elevator implements Runnable { 
	private static int topfloor = 8;
	private int floor;
	private ArrayList<Integer>  floorlist = new ArrayList<>();
	private Boolean door;
	private int currentFloor;
	private ArrayList<Person> plist;
	
	
	
 public Elevator(ArrayList<Person> plist) {
		super();
		
		this.plist = plist;
	}
 
 

public Boolean getDoorOpen() {
		return door;
	}

	public void setDoorOpen(Boolean door) {
		this.door = door;
	}



public void moveUp() {
	
    if (currentFloor < topfloor) {
    	currentFloor++;
    }
	 
 }
 
public void moveDown() {
	
	if (currentFloor < topfloor) {
	    currentFloor++;
	}
 }

public void waitAttFloor() {
	 
}

@Override
public void run() {
	
	while (true) {
		for (Person myperson : plist) {
			
			  floor = myperson.getStartfloornumber();
			  floorlist.add(floor);
			//  Vart ska jag åka/stanna ?
			
			// Nu nu åka någonstans om någon vill åka någonstans
			
			// Öppna dörrarna om jag ska stanna och dörrarna är stängda
			
			// Stäng dörrarna om jag ska åka och dörrarna är öppna
			
			
			
			
			System.out.println(floorlist);
			
		} // for
		
	} // while
	
} // run

}
