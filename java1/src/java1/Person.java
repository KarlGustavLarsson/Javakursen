package java1;

import java.util.Random;

public class Person implements Runnable {
	
	private int startfloornumber;
	private int endfloornumber;
	private String name;
	private Random r; // Anv�nds f�r att kunna f� ut slumpm�ssiga v�rden i likadana sekvenser mellan k�rningar.

	

	public Person(int startfloornumber, String name ) {
		super();
		this.startfloornumber =  startfloornumber;
		this.name             =  name;
	
	}

	

	public int getEndfloornumber() {
		return endfloornumber;
	}


	public void setEndfloornumber(int endfloornumber) {
		this.endfloornumber = endfloornumber;
	}
	
	public int getStartfloornumber() {
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
		this.setStartfloornumber(getRandomNumberInRange(1,8));
		this.setEndfloornumber(getRandomNumberInRange(1,8));
		
		
	}
	
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}		


	@Override
	public void run() {
		  this.setRandomNumbers();
		 // Bet�mm vart du vill �ka n�r man st�r utanf�r hissen f�rsta g�ngen 
		while (true) {
			
			 // Har hissen kommit kommit till mitt v�ningsplan och d�rrarna �r �ppna 
             // liv in i hisss 
			
			 // Har hissen kommit till min slutdestination och �r d�rrarna �ppna ?
			
			 // liv ut ur hiss
			
			
		} // while
	} // run

}
