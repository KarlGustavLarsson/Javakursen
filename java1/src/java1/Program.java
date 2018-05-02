package java1;

import java.util.ArrayList;

public class Program {
	
	ArrayList<Person> personlist = new ArrayList<Person>();

	public static void main(String[] args) {
		
		ArrayList<Person> personlist = new ArrayList<Person>();
		
	
		Person person1 =  new Person( 1, "Olle Olsson");
		Person person2 =  new Person( 1, "Kurt Svensson");
		
		personlist.add(person1);
		personlist.add(person2);
		
		Elevator elevator =  new Elevator(personlist);
		
		Thread elevthread = new Thread(elevator);

        System.out.println("Starting Thread elevator");
        elevthread.start();
       
        
        
       
       Thread personthread1  = new Thread(person1);
       personthread1.start();
       
		
	}

}
