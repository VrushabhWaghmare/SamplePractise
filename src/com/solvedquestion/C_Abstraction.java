package com.solvedquestion;

public class C_Abstraction {

	public int m1() {

		int result;
		result = 4 + 5;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		C_Abstraction CA = new C_Abstraction();
		CA.m1();
        CA.m2();
	}

	public int m2() {
		
		int temp;
		temp = 8 + 8;
		System.out.println(temp);
		return temp;

	}

}
