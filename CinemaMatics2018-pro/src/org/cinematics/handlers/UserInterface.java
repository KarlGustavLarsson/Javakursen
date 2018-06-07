package org.cinematics.handlers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * 
 * This class is mainly used for retrieval of user input
 *
 */
public class UserInterface {
	
	static BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
	
	public void show_menu() {
		System.out.println("-----------------------------------------------------");
		System.out.println("- (1) View all shows in all theatres                -");
		System.out.println("- (2) View all shows for a specific theatre         -");
		System.out.println("- (3) Create show                                   -");
		System.out.println("- (4) Create theatre                                -");
		System.out.println("- (5) Create movie                                  -");
		System.out.println("- (6) Book tickets                                  -");
		System.out.println("- (7) Exit                                          -");
		System.out.println("-----------------------------------------------------");
	}
	
	public static int inputIntWithBreak() {
		int myInt = 0;
		try {
			String input = con.readLine();
			if(input.equals("")) {
				return Integer.MIN_VALUE;
			}
			myInt = Integer.parseInt(input);
		} catch (NumberFormatException | IOException e) {
			System.out.println("Input is not a number");
			return Integer.MIN_VALUE;
		}
		return myInt;
	}
	
	// Get Int from console
	public static int inputInt() {
		int myInt = 0;
		try {
			String input = con.readLine();
			myInt = Integer.parseInt(input);
		} catch (NumberFormatException | IOException e) {
			System.out.println("Input is not a number");
			myInt = inputInt();
		}
		return myInt;
	}
	
	public static String getUserInputString() {
		String input = "";
		try {
			input = con.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return input;
	}
	
	public static String getTheatreName() {
		System.out.println("Input theatre name: ");
		return getUserInputString();
	}
	
	public static int getShowId() {
		System.out.println("Input show id(Leave blank for exit): ");
		return inputIntWithBreak();
	}
	
	public static int enterMovieId() {
		System.out.println("Enter movie id(Leave blank for exit):");
		return inputIntWithBreak();
	}
	

	// ----------------------------------------------------------------------------
	// Create a new LDT object or reinstance a new time from an existing one
	// Copying year/month/date to save input
	public static LocalDateTime readDate(LocalDateTime dateIn) {

		LocalDateTime dt;

		if (dateIn != null) {
			// Dealing with booking end here, we get an starting time in
			try {

				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm");
				String ymd = formatter.format(dateIn);

				System.out.print("Input end time in format <yyyyMMdd> [HH:mm] :");

				String time = con.readLine();
				if (time.length() == 0)
					return LocalDateTime.MIN; // Special case, We deliberately input nothing

				// Did not input atleast HH:mm
				if (time.length() < 5) {
					System.out.println("You need to input at the very least a HH:mm time");
					return null;
				}

				int dateLen = "yyyyMMdd HH:mm".length();
				dateLen -= time.length();
				// Reuse datestring from start time
				dt = LocalDateTime.parse(ymd.substring(0, dateLen) + time, formatter);

				// dt = LocalDateTime.parse(ymd+time, formatter);
			} catch (IOException e) {
				// Console readline error, nothing to do if we cannot read the console
				e.printStackTrace();
				return null;
			} catch (DateTimeParseException e) {
				System.out.println("That is not a valid end time.");
				return null;
			}
		} else {
			try {
				System.out.print("Slot starts at [yyyyMMdd HH:mm] :");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm");

				String time = con.readLine();
				if (time.length() == 0)
					return LocalDateTime.MIN; // We deliberately input nothing, special case, we want to exit

				dt = LocalDateTime.parse(time, formatter);
			} catch (IOException e) {
				// Console readline error, nothing for us to do
				e.printStackTrace();
				return null;
			} catch (DateTimeParseException e) {
				System.out.println("That is not a valid date/time input.");
				return null;
			}
		}
		return dt;
	} // end ReadDate

	public static int chooseSeatCol() {
		System.out.println("Choose seat column(leave blank to exit)");
		return inputIntWithBreak();
	}

	public static int chooseSeatRow() {
		System.out.println("Choose seat row(leave blank to exit)");
		return inputIntWithBreak();
	}
	
	public static int chooseNumberOfSeats() {
		System.out.println("Choose number of seats(leave blank to exit)");
		return inputIntWithBreak();
	}

	public static String checkIfSeatsShouldBeTogether() {
		System.out.println("Seats together? (y/n)");
		return getUserInputString();
	}
	

	
	
	

}
