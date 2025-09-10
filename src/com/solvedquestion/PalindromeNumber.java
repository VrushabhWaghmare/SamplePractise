    package com.solvedquestion;                           // Check if a given number is palindrome?  Two-digit numbers: 11, 22, 33, 44, 55 Three-digit numbers: 101, 111, 121, 131, 141, 151, 181.
    import java.util.Iterator;
    import java.util.Scanner;
    public class PalindromeNumber {

    	
    	
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	int n,r = 0,sum = 0,temp,digit = 0;
	temp = num;
	
    while (num > 0) {
    	
		  r = num % 10;
		//  System.out.println(r);
		  sum=(sum*10) + r;  
		//  System.out.println(sum);
		  num = num / 10;
		//  System.out.println(num);
    }
    
    if(temp == sum) {  
    	  System.out.println("Palindrome Number "); 
    }else {    
    	  System.out.println("Not Palindrome");  
    }
    
    
 }
 }	  
    
    
		  
	//	System.out.println(digit);
	//	n = num / 10;
		//num = n;
	
    
	
	
	
	
  
 


    
    
    
    
    
//  while(num > 0) {
	
//	digit = num % 10;
//	System.out.println(digit);
//	num = num / 10;
//	System.out.println(num);
//	digit = check;
//	System.out.println(num);
//	check = num % 10;
//	System.out.println(check);
//	last = num / 10;
	//System.out.println(last);
	   
//	}