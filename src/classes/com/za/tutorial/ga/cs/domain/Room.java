package com.za.tutorial.ga.cs.domain;
public class Room{
    private String number;
    private int seatingCapacity;
    public Room(String number, int seatingCapacity){
        this.number=number;
        this.seatingCapacity=seatingCapacity;
    }
    public String getNumber(){
        return number;
    }
    public int getSeatingCapacity(){
        return seatingCapacity;
    }
	public String getId() {
		return null;
	}
}