package com.za.ga.cs.domain;

public class Rooms {
	   private String number;
	    private int seatingCapacity;
	    public Rooms(String number, int string){
	        this.number=number;
	        this.seatingCapacity=string;
	    }
	    public String getNumber(){
	        return number;
	    }
	    public int getSeatingCapacity(){
	        return seatingCapacity;
	    }
}
