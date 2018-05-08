package java1;

import java.util.ArrayList;

public class Program {
	
	ArrayList<Person> personlist = new ArrayList<Person>();

	public static void main(String[] args) {
		
		//ArrayList<Person> personlist = new ArrayList<Person>();
		Elevator elevator =  new Elevator();
		
	
		Person person1 =  new Person( "Olle Olsson" , elevator);
		Person person2 =  new Person( "Kurt Svensson", elevator);
		
		
		
		
		
		Thread elevthread = new Thread(elevator);

        System.out.println("Starting Thread elevator");
        elevthread.start();
       
        
        
       
       Thread personthread1  = new Thread(person1);
       personthread1.start();
       
       Thread personthread2  = new Thread(person2);
       personthread2.start();
       
		
	}

}
