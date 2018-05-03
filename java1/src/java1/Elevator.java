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
		
	//  Vart ska jag �ka?
		// Knapp tryckt p� en v�ning?.
		// Knapp i hiss �r tryckt p� v�ning.
		
	// Vart ska jag stanna?
		// Aktivitet ska ske p� v�ning ( Vid tr�ff )
		
	// N�r jag stannat:
		// �ppna d�rrarna om jag ska stanna och d�rrarna �r st�ngda
		// Informera alla personer vilken v�ning jag �r p�
		
		// St�ng d�rrarna om jag ska �ka och d�rrarna �r �ppna
	// Forts�tt �ka?
	
	
	
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
