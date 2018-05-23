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
	private static boolean goingup = true;
	public int currentFloor=1;
	public Set<Integer> pushButtonList = new HashSet<>();
	
	
	
	
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
 
public   void moveDown() {
	
	if (currentFloor > bottonfloor) {
		 
		 currentFloor--;
		
	}
 }

public   void move() throws InterruptedException {
	
	synchronized(pushButtonList) {
		
	
		for (Integer myvalue : pushButtonList) {
			
			if (currentFloor == myvalue.intValue()) {
				
					this.setDoorOpen(true);
					System.out.print("Hissten stannar på våning " + currentFloor );
					
					Thread.sleep(5000);      // Väntar på passagerare
					this.setDoorOpen(false);
					removeFromPbList((currentFloor));
					break;
				// Do something
				
			}
		}
		if ( goingup  == true) {
			for (Integer myvalue : pushButtonList) {	
				 goingup =false;
				if (currentFloor < myvalue.intValue()) {
					//System.out.print("up = true");    // komma ihåg att jag for uppåt sist                     
					 goingup = true;
				
				} 		
			}
		}
		if  (goingup  == false)  {   
			for (Integer myvalue : pushButtonList) {	
				 goingup  = true;
				if (currentFloor >  myvalue.intValue()) {
					//System.out.print("up = false");    // komma ihåg att jag for neråt sist                    
					 goingup = false;
				
				} 
				
		     }
		}
	}	 // end synchronized pushButtonList
	//System.out.print("current floor " +  currentFloor);
	if (goingup == true) {
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

		System.out.println(floorlist);
		
	} // while
	
} // run

}
