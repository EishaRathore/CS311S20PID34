package com.za.ga.cs.domain;

public class ClassTime {
	    private String id;
	    private String time;
	    public ClassTime(String id, String string){
	        this.id=id;
	        this.time=string;
	    }
	    public String getId(){
	        return id;
	    }
	    public String getTime(){
	        return time;
	    }
}
