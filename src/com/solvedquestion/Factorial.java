package com.solvedquestion;

import java.util.Scanner;

public class Factorial {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
	 
		int fact = 1, result = 1;
		
		
	while (num >= 1) {
		    result = num * fact;
		    System.out.println(result);
			num--;
			fact = result * num;
			System.out.println(fact);
			num--;
	}
		
		
}
}

/*

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	int fact = 1;
	
	while(num>=1 && num<=5) {
		fact = num * fact;
		num = num-1;
	}
	System.out.println(fact);


*/
