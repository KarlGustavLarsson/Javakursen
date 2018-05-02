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
			//  Vart ska jag �ka/stanna ?
			
			// Nu nu �ka n�gonstans om n�gon vill �ka n�gonstans
			
			// �ppna d�rrarna om jag ska stanna och d�rrarna �r st�ngda
			
			// St�ng d�rrarna om jag ska �ka och d�rrarna �r �ppna
			
			
			
			
			System.out.println(floorlist);
			
		} // for
		
	} // while
	
} // run

}
