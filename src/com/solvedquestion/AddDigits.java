		package com.solvedquestion;                 // Add digits of a given number? 321  3 + 2 + 1 = 6
		import java.util.Scanner;
		public class AddDigits {

			
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
 
		int digit = 0, digit2 = 0, count = 0, n = 0, n1,store = 0;
		int sum = 0;
		
        while (num != 0) {
        	
        	sum+= num%10;
        	num = num/10;
        	
        }
    	  System.out.println(sum);
    	  
 }
}
       
        	
        	
        	
        	
        	//	store = digit + num;
        //	System.out.println(store);
        	
        	//store = digit + digit2;
		//	System.out.println(store);
			
		

		
		
		
      /*
		   digit = num%10;
		   System.out.println(digit);
		   
		 //  digit2 = num/10;
		 //  System.out.println(digit2);
		   store = num%10;
		   System.out.println(store);
		   n = num%10;
		   System.out.println(n);
		    
		//   store = digit + digit2; 
		//   System.out.println(store);
		*/ 
		
  

	
	
	

