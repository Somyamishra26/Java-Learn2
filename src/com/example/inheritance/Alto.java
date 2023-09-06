package com.example.inheritance;

public class Alto extends Car {

	private int noOfSeats;
	private int noOfWheels;
	
	public Alto(int noOfSeats, int noOfWheels) {
		super(noOfSeats, noOfWheels);
		// TODO Auto-generated constructor stub
	}
	
	public int getdetails(int noOfSeats, int noOfWheels) {
		this.noOfSeats=noOfSeats;
		this.noOfWheels=noOfWheels;
		return noOfWheels;
		
	}

}
