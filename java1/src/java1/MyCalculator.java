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
	
	
	public void divideNumbers(double number1, double number2) {
		double result=0;; 
		
		result = number1 / number2;
		
		 printResult(result);
		
		
		
	}
	
    public void subtractNumber(ArrayList<Double> numberlist) {
    	
	    double sum=0;
		
		for (int i = 0; i < numberlist.size() ;i++ ) {
			
            if (i==0){
                sum=numberlist.get(i);
            }
            else {
                sum=sum-numberlist.get(i);
            }

		}
		 
		 printResult(sum);
		
	}
    
    public void multiplyNumbers(double number1, double number2) {
    	
    	
    	double result = number1 * number2;
    	
    	printResult(result);
		
    }
    

     
 
     
     public void printResult(double result) {
    	 
    	 System.out.println("Resultat = " + result); 
    	 
    	 
    	 
     }
 		
   
    
    
		

}
