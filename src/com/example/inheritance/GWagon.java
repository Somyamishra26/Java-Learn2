package com.example.inheritance;

public class GWagon extends Car {

	public GWagon(int noOfSeats, int noOfWheels) {
		super(noOfSeats, noOfWheels);
		// TODO Auto-generated constructor stub
	}
	
	public void getGearDetails() {
		System.out.println("I have 2 gears");
	}

}
