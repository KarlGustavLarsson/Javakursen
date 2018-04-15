package java1;

import java.util.ArrayList;

public class MyCalculator {
	
	
	public void addNumbers(ArrayList<Double> numberlist) {
		
		double sum=0;
		
		for (int i = 0; i < numberlist.size() ;i++ ) {
			sum  += numberlist.get(i);
		}
		 
		 printResult(sum);
	}
	
	
	public double divideNumbers(double number1, double number2) {
		double result; 
		
		result = number1 / number2;
		
		return result;
		
		
		
	}
	
    public void subtractNumber(ArrayList<Double> numberlist) {
    	
	    double sum=0;
		
		for (int i = 0; i < numberlist.size() ;i++ ) {
			sum  -= numberlist.get(i);
			
            if (i==0){
                sum=numberlist.get(i);
            }
            else {
                sum=sum-numberlist.get(i);
            }

		}
		 
		 printResult(sum);
		
	}
    
    public double multiplyNumbers(double number1, double number2) {
    	
    	
    	double result = number1 * number2;
    	
    	return result;
		
    }
    
     public Boolean checkNumbersAddSubtract(String num1, String val) {
    	 
    	 try {
    		 
    		 int result;
    		 
    		 result = Integer.parseInt(num1);
    		 
    		 if ( val.equals("A")) {
    			// addNumbers(result);
    			 
    		 } else if( val.equals("S")) {
    			// subtractNumber(result);
    			 
    		 } 
    

    	 } catch (NumberFormatException e) {
    		 
    		 return false;

    	 } 
    	 
    	 return true;
		
   	}
     
    public Boolean checkNumbersMultyplyDivide(String num1, String num2,  String val) {
    	 
    	double result1;
		double result2;
    	 try {
    		 
    		
    		 
    		 result1 = Double.parseDouble(num2);
    		 result2 = Double.parseDouble(num2);
    		 
    		 if ( val.equals("M")) {
    			 multiplyNumbers(result1, result2);
    			 
    		 } else if( val.equals("D")) {
    			 divideNumbers(result1, result2);
    			 
    		 } 
    

    	 } catch (NumberFormatException e) {
    		 
    		 return false;

    	 } 
    	 
    	 if ( val.equals("M")) {
			  double resultmultibly = multiplyNumbers(result1, result2);
			  printResult(resultmultibly);
			 
		 } else if( val.equals("D")) {
			 double resultdivide = divideNumbers(result1, result2);
			 printResult(resultdivide);
			 
		 } 
    	 
    	 return true;
		
   	}
     
     public void printResult(double result) {
    	 
     }
 		
   
    
    
		

}
