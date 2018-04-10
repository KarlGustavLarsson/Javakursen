package java1;

public class CountWord {
	
	
	
	public  int countWords(String inputstring){

	    int wordCount = 0;

        String[] words = inputstring.split("\\s+");    
        wordCount = words.length;
	           
	    return wordCount;
	}

}
