package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String s = "";
		String select = "";
		Boolean notready = true;

		while (notready == true) {
			
			while (s.equals("")) {
				
				System.out.println(" Vill du räkna bokstäver, ord eller båda ?  bokstäver = B ord = O båda = BO");
	
				select = input.readLine();
				
				System.out.println("Skriv in din textstäng om du har ångrat vad som ska räknas tryck enter");
				
				s = input.readLine();
	
		

		     } // while notready

             if (select.equals("B")) {
            	 printLetter(s);
             } else if (select.equals("O")) {
            	 printWord(s);
            	 
             } else printAll(s);  
             
             notready = false;
             
		    
		} // while true
		
   
		
	}
    public static void printAll(String s) {
    	printLetter(s);
    	printWord(s); 	
    }

    public static void printWord(String s ) {
    	
    	CountWord myContWord = new CountWord();
    	int numword = myContWord.countWords(s);

	    System.out.format(" Antal ord i textsträngen = %d ", numword);
    }
    
    public static void printLetter( String s) {
    	
	    CountLetter myContLetter = new CountLetter();
	    int numletter = myContLetter.countLetter(s);

        System.out.format(" Antal bokstäver i textsträngen = %d ", numletter);
    }

}
