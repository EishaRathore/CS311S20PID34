package com.za.tutorial.ga.cs.domain;
public class ClassTime{
    private String id;
    private String time;
    public ClassTime(String id, String time){
        this.id=id;
        this.time=time;
    }
    public String getId(){
        return id;
    }
    public String getTime(){
        return time;
    }
    
}