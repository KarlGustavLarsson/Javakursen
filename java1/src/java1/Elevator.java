package java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Elevator implements Runnable { 
	private static int topfloor = 8;
	private static int bottonfloor = 1;
	private int floor;
	private ArrayList<Integer>  floorlist = new ArrayList<>();
	private Boolean door=false;
	public int currentFloor=1;
	//private ArrayList<Person> plist;
	//public  ArrayList<Integer> pushButtonList = new ArrayList<>();
	public Set<Integer> pushButtonList = new HashSet<>();
	
	//public  ArrayList<Integer> pushButtonList = new ArrayList<>();
	
	
	
 public synchronized void setPushButtonListS(Set<Integer> pushButtonList) {
		this.pushButtonList = pushButtonList;
	}

 public Set<Integer> getPushButtonList() {
	return pushButtonList;
}

public synchronized void addToPbList(int value) {
		this.pushButtonList.add(value);
	}

public synchronized void removeFromPbList(int value) {
	this.pushButtonList.remove(value);
}

public synchronized int getCurrentFloor() {
		return currentFloor;
	}



public Elevator() {
		super();
		
		
	}
 
 

public synchronized  Boolean getDoorOpen() {
		return door;
	}

public synchronized  void setDoorOpen(Boolean door) {
		this.door = door;
	}



public  void moveUp() {
	
    if (currentFloor < topfloor) {
    	currentFloor++;
    }
	 
 }
 
public  void moveDown() {
	
	if (currentFloor <= topfloor && currentFloor > bottonfloor) {
	    currentFloor--;
	}
 }

public synchronized  void move() throws InterruptedException {
	
	Boolean up=false;

	for (Integer myvalue : pushButtonList) {
		
		if (currentFloor == myvalue.intValue()); {
			this.setDoorOpen(true);
			System.out.print("Lika");
			Thread.sleep(1000);      // Väntar på passagerare
			this.setDoorOpen(false);
			// Do something
		}
	}
	for (Integer myvalue : pushButtonList) {	
			
			if (currentFloor < myvalue.intValue()); {
				System.out.print("up = true");
				up = true;
			} 
			
	}
	for (Integer myvalue : pushButtonList) {	
		
		if (currentFloor >  myvalue.intValue()); {
			System.out.print("up = false");
			up = false;
		} 
		
     }
		
	if (up==true) {
		moveUp();
	} else { 
		moveDown();
	}
	
	
	    
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
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//  Vart ska jag åka?
		if (!pushButtonList.isEmpty()) {
			
			try {
				move();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
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
			
		//	this.WaitForNextAction();	
	} // while
	
} // run

}
