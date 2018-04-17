package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String number1 = "";  // Holds first input number in multiply and divide
		String number2 = "";  // Holds second input number in multiply and divide
		String number3 = "";  // Holds input number in add an subtract
		int numbercounter = 0; // Count number to be added, divided,subtracted, multiply
		double result1 = 0;    // Hold first number in add and subtract
		double result2 = 0;    // Hold second number in add and subtract
		
		ArrayList<Double> mynumbers = new ArrayList<Double>(); // Holds numbers for add and subtract

		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		  while(true) {
			  
			  System.out.println("****************KALKYLATOR***************");
			  System.out.println("                                         ");
			  System.out.println("    För att Addera välj (A)              ");
			  System.out.println("    För att Subtrahera välj (S)          ");
			  System.out.println("    För att Multiplicera välj (M)        ");
			  System.out.println("    För att Dividera välj (D)            ");
			  System.out.println("    För att Avsluta skriv exit           ");
			  System.out.println("                                         ");
			  
			  String val = input.readLine();
			  number1 = "";
			  number2 = "";
			  number3 = "";
			  mynumbers.clear();   
			  numbercounter = 0;
			  
			  if( val.equals("exit")) {
				  break;
			  }
			     
			  while(true) {
				  
					  
					if (val.equals("D") || (val.equals("M")))    {
						while (!number1.equals("exit")) {
						    System.out.print("Mata in önskat nummer 1 avsluta genom att skriva exit: ");
						    try {
						    	number1 = input.readLine();
						    	if (!number1.equals("exit")) {
						    		result1 = Double.parseDouble(number1);
						    		numbercounter++;
						    		break;
						    	} else {
						    		break;
						   
						    	}
						    } catch (IOException e) {
						    	 System.err.println("IOException: " + e.getMessage());
							       continue;
						    } catch (NumberFormatException e ) {
						    	System.err.println("NumberFormatException: " + e.getMessage());
						    	continue;
						    }
						    
						}   // end while number 1
						while ( !number1.equals("exit")) {
						    System.out.print("Mata in önskat nummer 2 avsluta genom att skriva exit: ");  
						    try {
						    	number2 = input.readLine();
						    	if (!number2.equals("exit")) {
							    	result2 = Double.parseDouble(number2);
							    	numbercounter++;
							    	break;
							    	
						    	} else if (number2.equals("exit")) {
						    		break;
						    	}
						    	
						    	
						    } catch (IOException e) {
						    	 System.err.println("IOException: " + e.getMessage());
							       continue;
						    } catch (NumberFormatException e ) {
						    	System.err.println("NumberFormatException: " + e.getMessage());
						    	   continue;
						    }	    					    
						    
						} //while number2
					
					} else if (val.equals("A")|| (val.equals("S"))) {
						while (!number3.equals("exit")) {
						      System.out.print("Mata in önskat nummer 1 avsluta genom att skriva exit: ");  
						     
						      try {
						    	  number3 = input.readLine();
						    	  if (!number3.equals("exit")) {
							          result1 = Double.parseDouble(number3);
							          numbercounter++;
							          mynumbers.add(result1);
						    	  } else {
						    		  break;
						    	  }
							    	
							  } catch (IOException e) {
							    	 System.err.println("IOException: " + e.getMessage());
								       continue;
							  } catch (NumberFormatException e ) {
							    	System.err.println("NumberFormatException: " + e.getMessage());
							    	   continue;
							  }	
						      
						      
						}
					} else {
						break;
					}
					 
					
			    	  
			    
		    	  
		          if (numbercounter < 2) { 
		        	  System.out.println("Minst 2 nummer ska matas in ingen beräkning görs");
		        	  break;
		          }
					  
				  MyCalculator  calc = new MyCalculator();  
				  
				  if (val.equals("D")) {
					  calc.divideNumbers(result1, result2);
				  } else if (val.equals("M")) {
					  calc.multiplyNumbers(result1, result2);
				  } else if (val.equals("A"))  {
					  calc.addNumbers(mynumbers);
				  } else if (val.equals("S")) {
					  calc.subtractNumber(mynumbers);
				  }
				  
				  
				  break;
				  
			  } // while
			  
		        
		      
		  } // while
		
			
	} // main
		

} // program


