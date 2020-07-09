package com.za.tutorial.ga.cs.domain;
public class Rooms{
    private String number;
    private int seatingCapacity;
    public Rooms(String number, int seatingCapacity){
        this.number=number;
        this.seatingCapacity=seatingCapacity;
    }
    public String getNumber(){
        return number;
    }
    public int getSeatingCapacity(){
        return seatingCapacity;
    }
}