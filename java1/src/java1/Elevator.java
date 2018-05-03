package java1;

import java.util.ArrayList;
import java.util.Collections;

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

public void move(int mystartfloor ) {
	
	    
 }


public void waitAttFloor() {
	 
}


public void WaitForNextAction() {
	try {
		this.wait(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public void run() {
	
	
	while (true) {
		
	//  Vart ska jag åka?
		// Knapp tryckt på en våning?.
		// Knapp i hiss är tryckt på våning.
		
	// Vart ska jag stanna?
		// Aktivitet ska ske på våning ( Vid träff )
		
	// När jag stannat:
		// Öppna dörrarna om jag ska stanna och dörrarna är stängda
		// Informera alla personer vilken våning jag är på
		
		// Stäng dörrarna om jag ska åka och dörrarna är öppna
	// Fortsätt åka?
	
	
	
	/* GAMLA KODEN */
	//		for (Person myperson : plist) {
				
	//			  floor = myperson.getStartfloornumber();
	//			  floorlist.add(floor);
	//		} // for
	//		Collections.sort(floorlist);
			
	//			  move(floor);
	/* GAMLA KODEN */		
			System.out.println(floorlist);
			
			this.WaitForNextAction();	
	} // while
	
} // run

}
