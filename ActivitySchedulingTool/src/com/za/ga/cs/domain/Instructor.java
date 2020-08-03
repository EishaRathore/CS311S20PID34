package com.za.ga.cs.domain;

public class Instructor {
	    private String id;
	    private String name;
	    public Instructor(String string, String name){
	        this.id=string;
	        this.name=name;
	    }
	    public String getId(){return id; }
	    public String getName(){ return name;}
	    public String toString(){return name;}
}
