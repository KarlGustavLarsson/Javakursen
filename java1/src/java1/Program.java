package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String inputstring = "";
		String select = "";
		Boolean notready = true;

		while (notready == true) {
			
			while (inputstring.equals("")) {
				
				System.out.println(" Vill du räkna bokstäver, ord eller båda ?  bokstäver = B ord = O båda = BO");
	
				select = input.readLine();
				
				System.out.println("Skriv in din textstäng om du har ångrat vad som ska räknas tryck enter");
				
				inputstring = input.readLine();
	
		

		     } // while notready
			
			
          if (inputstring.equals("")) {
        	  // Do nothing
        	  
          } else {
        	  
             if (select.equals("B")) {
            	 printLetter(inputstring);
             } else if (select.equals("O")) {
            	 printWord(inputstring);
            	 
             } else printAll(inputstring);  
             inputstring = "";
             
          }  
             
		    
		} // while true
		
	}
    public static void printAll(String inputstring) {
    	printLetter(inputstring);
    	printWord(inputstring); 	
    }

    public static void printWord(String inputstring ) {
    	
    	CountWord myContWord = new CountWord();
    	int numword = myContWord.countWords(inputstring);

	    System.out.format(" Antal ord i textsträngen = %d ", numword);
    }
    
    public static void printLetter( String inputstring) {
    	
	    CountLetter myContLetter = new CountLetter();
	    int numletter = myContLetter.countLetter(inputstring);

        System.out.format(" Antal bokstäver i textsträngen = %d ", numletter);
    }

}
