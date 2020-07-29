package com.za.ga.cs.domain;

public class Instructor {
	    private int id;
	    private String name;
	    public Instructor(int i, String name){
	        this.id=i;
	        this.name=name;
	    }
	    public int getId(){return id; }
	    public String getName(){ return name;}
	    public String toString(){return name;}
}
