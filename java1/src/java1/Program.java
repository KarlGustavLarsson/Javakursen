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
		String number3 = "";
		
		ArrayList<Double> mynumbers = new ArrayList<Double>();

		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		  while(true) {
			  
			  System.out.println("****************KALKYLATOR***************");
			  System.out.println("                                         ");
			  System.out.println("    För att Addera välj (A)              ");
			  System.out.println("    För att Subtrahera välj (S)          ");
			  System.out.println("    För att Multiplicera välj (M)        ");
			  System.out.println("    För att Dividera välj (D)            ");
			  System.out.println("    För att Avsluta välj (Enter)         ");
			  System.out.println("                                         ");
			  
			  String val = input.readLine();
			  
			  
			  
			  while(true) {
				  
				  try {
					  
					if (val.equals("D") || (val.equals("M")))    {
						System.out.print("Mata in önskat nummer 1 avsluta genom att skriva exit: ");  
						number1 = input.readLine();
						System.out.print("Mata in önskat nummer 2 avsluta genom att skriva exit: ");  
						number2 = input.readLine();
					
					} else if (val.equals("A")|| (val.equals("S"))) {
						System.out.print("Mata in önskat nummer 1: ");  
						number3 = input.readLine();
					}
					 

				  } catch (IOException e ) {
					  
				     System.err.println("IOException: " + e.getMessage());
				  
			      } catch (NumberFormatException e) {
			    	  System.err.println("NumberFormatException: " + e.getMessage());
			    	  
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


