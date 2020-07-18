package com.za.tutorial.ga.cs.domain;
public class Instructor{
    private String id;
    private String name;
    public Instructor(String id, String name){
        this.id=id;
        this.name=name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name;
    }
	public Class getInstructors() {
		return null;
	}
	public String getDepartmentFix() {
		return null;
	}
	public String getCourseFix() {
		return null;
	}
}