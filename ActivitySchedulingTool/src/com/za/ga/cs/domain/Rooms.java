package com.za.ga.cs.domain;

public class Rooms {
	   private String number;
	    private String seatingCapacity;
	    public Rooms(String number, String string){
	        this.number=number;
	        this.seatingCapacity=string;
	    }
	    public String getNumber(){
	        return number;
	    }
	    public String getSeatingCapacity(){
	        return seatingCapacity;
	    }
}
