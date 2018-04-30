package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.IOException;

import javax.imageio.IIOException;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Program {
	

	public static void main(String[] args) throws IOException  {
		
		Boolean bookingok=false;
		LocalDate bdate=null;               // Date for booking
		LocalTime bstarttime=null;          // Start time for booking
		LocalTime bstoptime=null;           // Stop time for booking
		
		
		
		
		ArrayList<HairDresser> hairDresserList = new ArrayList<HairDresser>();
	
		HairDresser hair = null;
		BookingHandler mybooking = new BookingHandler();
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		while (true) {
			 System.out.print("********************************"    +   "\n");
			 System.out.print("            TIDBOKNINING        "    +   "\n");
			 System.out.print("********************************"    +   "\n");
		     System.out.print("                                "    +   "\n");
		     System.out.print("                                "    +   "\n");
		     System.out.print("                                "    +   "\n");
		     System.out.print(" Lägg tii frisör             (1)"    +   "\n");
		     System.out.print(" Visa tillgängliga frisörer  (2)"    +   "\n");
		     System.out.print(" Visa bokade tider för frisör(3)"    +   "\n");
		     System.out.print(" För att boka                (4)"    +   "\n");
		     System.out.print(" För att avsluta           (exit) "  +   "\n");
		     System.out.print("********************************"    +   "\n");
		     
		    
		     String val="";
		     String myHress ="";
		     bdate     =null;   // reset before next booking
			 bstarttime=null;   // reset before next booking     
			 bstoptime =null;   // reset before next booking
			  
		     try {
		    	  val = input.readLine();
		    	 
		     } catch(IOException ex) { 
		         System.out.println("IOException");
		     }
		     if (val.equals("exit")) {
		    	 break;
		     }
		     
			while (true) {
				switch (val)   {
				case "1":
					String name;
					System.out.println("Lägg till en ny frisör : ");
					name = input.readLine();
					HairDresser hairdresser = new HairDresser(name);
					hairDresserList.add(hairdresser);
					break;
				case "2":
					mybooking.showHairDressers(hairDresserList);
					break;
				case "3":
					 System.out.print("Vilken frisör vill se bokningar för  ?" + "\n");
					 myHress = input.readLine(); 
					 
					    // show booking   
					 for (HairDresser dresser : hairDresserList) {
						 
						    if (dresser.getName().equals(myHress))  {
						    	
						    	dresser.printBookingList();
			        	    }
			    	 }
					
					mybooking.printBookingList();
					break;
				case "4":
				     while (bdate == null) {
						 System.out.print("Datum (ÅÅÅÅ-MM-DD): ");
						 bdate = mybooking.handleDateError(input);
					 }
						 System.out.println();
					 while (bstarttime == null) {
					    System.out.print("Starttid (Timme:min): ");
						bstarttime = mybooking.handleTimeError(input);
						
					 }
					     System.out.println();
					 while (bstoptime == null) {
					     System.out.print("Sluttid (Timme:min): ");
						 bstoptime= mybooking.handleTimeError(input);
					 }
					 System.out.println();
					 
					 System.out.print("Vilken frisör vill du ha ?" + "\n");
					  myHress = input.readLine(); 
					 
					    // Try too book    
					
					 
					 for (HairDresser dresser : hairDresserList) {
						 
						    if (dresser.getName().equals(myHress))  {
						    	
						    	bookingok = dresser.addBookingTime(bstarttime, bstoptime, bdate, input);
			        	    }
			    	 }
					
			
					 if (bookingok == false) {
						 System.out.print("Bokningstiden är upptagen prova en annan tid" + "\n" + "\n");
						 break;
					 } else {
						 System.out.print("Godkänd bokning" + "\n" + "\n");
						 break;
					 }
				default:
					 System.out.print("Felaktikt val, använd endast giltiga val" + "\n");
					break;
					
					
				}
				
				break; // break out from while
		  
					
			} // while
		
		} // while
	} // main

}
