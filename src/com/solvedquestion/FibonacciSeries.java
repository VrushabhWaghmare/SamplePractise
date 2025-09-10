        package com.solvedquestion;            // Find and print fibonacci series of a number?  0, 1, 1, 2, 3, 5, 8, 13, 21, 34 
        import java.util.Scanner;
        public class FibonacciSeries {
        	
        	
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a number");
         	int num = sc.nextInt();
        	
            int first = 0, last = 1;
            int n = 10, fibo = 0;
            System.out.print(+ first + "," +last);
        	
        for (int i = 2; i <= n; i++) {
        	
               fibo = first + last;
               System.out.print(","+ fibo);
               first = last;
               last = fibo;
			  
		    }
             			
}
}
