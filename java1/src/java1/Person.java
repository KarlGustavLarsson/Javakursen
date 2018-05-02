package java1;

import java.util.Random;

public class Person implements Runnable {
	
	private int startfloornumber;
	private int endfloornumber;
	private String name;
	private Random r; // Används för att kunna få ut slumpmässiga värden i likadana sekvenser mellan körningar.

	

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
		 // Betämm vart du vill åka när man står utanför hissen första gången 
		while (true) {
			
			 // Har hissen kommit kommit till mitt våningsplan och dörrarna är öppna 
             // liv in i hisss 
			
			 // Har hissen kommit till min slutdestination och är dörrarna öppna ?
			
			 // liv ut ur hiss
			
			
		} // while
	} // run

}
