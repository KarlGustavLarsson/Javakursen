package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;

import javax.imageio.IIOException;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Program {
	

	public static void main(String[] args)  {
		
		Boolean bookingok;
		LocalDate bdate=null;               // Date for booking
		LocalTime bstarttime=null;          // Start time for booking
		LocalTime bstoptime=null;           // Stop time for booking
		
		BookingHandler mybooking = new BookingHandler();
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		while (true) {
			 System.out.print("********************************"    +   "\n");
			 System.out.print("            TIDBOKNINING        "    +   "\n");
			 System.out.print("********************************"    +   "\n");
		     System.out.print("                                "    +   "\n");
		     System.out.print(" För att visa bokade tider (A)  "    +   "\n");
		     System.out.print(" För att boka              (B)  "    +   "\n");
		     System.out.print(" För att avsluta           (exit) "  +   "\n");
		     System.out.print("********************************"    +   "\n");
		     
		    
		     String val="";
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
				
				if (val.equals("A")) { 
			    	 mybooking.printBookingList();
			    	break;
			     } else if (val.equals("B")) {
			    	
			     } else {
			    	 System.out.print("Felaktikt val endast A, B eller exit är giltigt" + "\n");
			    	 break;
			     }
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
			
				 bookingok = mybooking.addBookingTime(bstarttime, bstoptime, bdate);
				 
				 if (bookingok == false) {
					 System.out.print("Bokningstiden är upptagen prova en annan tid" + "\n" + "\n");
					 break;
				 } else {
					 System.out.print("Godkänd bokning" + "\n" + "\n");
					 break;
				 }
					
					
			} // while
		
		} // while
	} // main

}
