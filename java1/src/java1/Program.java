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
		int numbercounter = 0;
		double result1 = 0;
		double result2 = 0;
		
		ArrayList<Double> mynumbers = new ArrayList<Double>();

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
				  
				  try {
					  
					if (val.equals("D") || (val.equals("M")))    {
						while (!number1.equals("exit") || !number2.equals("exit")) {
						    System.out.print("Mata in önskat nummer 1 avsluta genom att skriva exit: ");  
						    number1 = input.readLine();
						    System.out.print("Mata in önskat nummer 2 avsluta genom att skriva exit: ");  
						    number2 = input.readLine();
						    if (!number1.equals("exit") || !number2.equals("exit")) {
						    	result1 = Double.parseDouble(number1);
				    		    result2 = Double.parseDouble(number2);
						    	
						    } else {
						    	break;
						    }
						    
						}
					
					} else if (val.equals("A")|| (val.equals("S"))) {
						while (!number3.equals("exit")) {
						      System.out.print("Mata in önskat nummer 1 avsluta genom att skriva exit: ");  
						      number3 = input.readLine();
						      if (!number3.equals("exit") ) {
						    	  numbercounter++;
						          result1 = Double.parseDouble(number3);
						          mynumbers.add(result1);
						          
						      } else {
						    	  break;
						      }
						}
					} else {
						break;
					}
					 
					
				  } catch (IOException e ) {
					  
				       System.err.println("IOException: " + e.getMessage());
				       continue;
				     
			      } catch (NumberFormatException e) {
			    	   System.err.println("NumberFormatException: " + e.getMessage());
			    	   continue;
			    	  
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


