package com.za.ga.cs.domain;

public class ClassTime {
	    private String id;
	    private int time;
	    public ClassTime(String id, int i){
	        this.id=id;
	        this.time=i;
	    }
	    public String getId(){
	        return id;
	    }
	    public int getTime(){
	        return time;
	    }
}
