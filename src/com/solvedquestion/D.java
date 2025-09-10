package com.solvedquestion;

public class D extends C {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public int vechicle(int maxSpeed) {
		if (maxSpeed > 120) {
			System.out.println("Speed limit exceed dont allow to drive");
		} else {
			System.out.println("Nice! : Lets go for the drive");
		}
		
		return maxSpeed;
	}
	
	public static void main(String[] args) {
		System.out.println("V");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	

}

