package java1;

public class CountLetter {
	
	public  int countLetter(String s){	
	  
	    int letterCount = 0;
	    for (int i = 0; i < s.length(); i++) {
	      if (Character.isLetter(s.charAt(i)))
	    	  letterCount++;
	    }

	    return letterCount;
	}


}
