package java1;

import java.util.ArrayList;
import java.util.Random;

public class Person implements Runnable {
	
	private int startfloornumber=0;
	private int endfloornumber=1;
	private boolean insideElevator;
	private String name;
	private Random r; // Används för att kunna få ut slumpmässiga värden i likadana sekvenser mellan körningar.
	
    public Elevator elev;
	

	public boolean isInsideElevator() {
		return insideElevator;
	}



	public void setInsideElevator(boolean insideElevator) {
		this.insideElevator = insideElevator;
	}



	public Person(String name, Elevator elev ) {
		super();
		this.name             =  name;
		this.elev             =  elev;
	
	}

	

	public int getEndfloornumber() {
		return endfloornumber;
	}


	public void setEndfloornumber(int endfloornumber) {
		this.endfloornumber = endfloornumber;
	}
	
	public  int getStartfloornumber() {
		return startfloornumber;
	}


	public void setStartfloornumber(int startfloornumber) {
		this.startfloornumber = startfloornumber;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void  setRandomNumbers() { 
		this.setStartfloornumber(getRandomNumberInRange(1,3));
		this.setEndfloornumber(getRandomNumberInRange(1,3));
		
		
	}
	
	
	public  int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}		


	@Override
	public void run() {
		  this.setRandomNumbers();
		       
		
		
		 elev.updateUpdatePbList(this.startfloornumber);
		
		while (true) {
			
			  try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 // Har hissen kommit kommit till mitt våningsplan och dörrarna är öppna 
			  if (this.getStartfloornumber() == elev.getCurrentFloor() && elev.getDoorOpen()== true) {
				  this.setInsideElevator(true);
				  System.out.print("Hissdörr öppen start destination");
			  }
             // liv in i hisss 
			
			 // Har hissen kommit till min slutdestination och är dörrarna öppna ?
              if (this.getEndfloornumber() == elev.getCurrentFloor() && elev.getDoorOpen() == true) {
				  
            	  this.setInsideElevator(false);
            	  System.out.print("Hissdörr öppen end destination");
			  }
			
			 // liv ut ur hiss
			
			
		} // while
	} // run

}
