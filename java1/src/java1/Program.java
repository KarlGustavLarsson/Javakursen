package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String number1 = "";
		String number2 = "";
		
		ArrayList<Double> mynumbers = new ArrayList<Double>();

		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		  while(true) {
			  
			  System.out.println("****************KALKYLATOR***************");
			  System.out.println("                                         ");
			  System.out.println("    F�r att Addera v�lj (A)              ");
			  System.out.println("    F�r att Subtrahera v�lj (S)          ");
			  System.out.println("    F�r att Multiplicera v�lj (M)        ");
			  System.out.println("    F�r att Dividera v�lj (D)            ");
			  System.out.println("    F�r att Avsluta v�lj (Enter)         ");
			  System.out.println("                                         ");
			  
			  String val = input.readLine();
			  
			  
			  
			  while(true) {
				  
				  try {
					  
					if (val.equals("D") || (val.equals("M")))    {
						System.out.print("Mata in �nskat nummer 1: ");  
						number1 = input.readLine();
						System.out.print("Mata in �nskat nummer 2: ");  
						number2 = input.readLine();
						
					} else {
						System.out.print("Mata in �nskat nummer 1: ");  
						number1 = input.readLine();
					}
					 

				  } catch (IOException e ) {
					  
				     System.err.println("IOException: " + e.getMessage());
				  } 
					  
				  MyCalculator  calc = new MyCalculator();  
				  
				  if (val.equals("D") || val.equals("M") ) {
					  Boolean  numok = calc.checkNumbersMultyplyDivide(number1,number2, val);
				  }
				  
				  
				  
				  
				  break;
				  
			  } // while
			  
			  if( !val.equals("\\n") ) 
			      break;
		        
		      
		  } // while
		
			
	} // main
		

} // program


