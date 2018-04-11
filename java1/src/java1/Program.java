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
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Program {
	

	public static void main(String[] args) throws ParseException, IOException {
		
		Boolean bookingok;
		
		BookingHandler mybooking = new BookingHandler();
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		while (true) {
			 System.out.print("********************************" + "\n");
			 System.out.print("            TIDBOKNINING        " + "\n");
			 System.out.print("********************************" + "\n");
		     System.out.print("                                " + "\n");
		     System.out.print(" För att visa bokade tider (A)  " + "\n");
		     System.out.print(" För att boka              (B)  " + "\n");
		     System.out.print("********************************" + "\n");
		     
		     String val = input.readLine();
		     
			while (true) {
				
				if (val.equals("A")) { 
			    	 mybooking.printBookingList();
			    	break;
			     } else if (val.equals("B")) {
			    	
			     } else {
			    	 System.out.print("Felaktikt val endast A eller B är giltigt" + "\n");
			    	 break;
			     }
			
				
				try {
					 System.out.print("Datum (ÅÅÅÅ-MM-DD): ");
					 String date = input.readLine();
					 System.out.println();
					 System.out.print("Starttid (Timme:min): ");
					 String time = input.readLine();
					 System.out.println();
					 System.out.print("Sluttid (Timme:min): ");
					 String time2 = input.readLine();
					 System.out.println();
					 DateTimeFormatter formatterdate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					 DateTimeFormatter formattertime = DateTimeFormatter.ofPattern("HH:mm");
					 LocalDate bdate = LocalDate.parse(date, formatterdate);
					 LocalTime bstarttime = LocalTime.parse(time, formattertime);
					 LocalTime bstoptime = LocalTime.parse(time2, formattertime); 
				
					 bookingok = mybooking.addBookingTime(bstarttime, bstoptime, bdate);
					 
					 if (bookingok == false) {
						 System.out.print("Bokningstiden är upptagen prova en annan tid" + "\n" + "\n");
						 //break;
					 }
					
				}
				catch (DateTimeParseException exc) {
					
				}
					
			} // while
		
		} // while
	} // main

}
