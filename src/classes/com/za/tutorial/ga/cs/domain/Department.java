package com.za.tutorial.ga.cs.domain;
public class Department{
    private String name;
    private ArrayList<course> courses;
    public Department(String name,ArrayList<course> courses){
        this.name = name;
        this.courses = courses;
    }
    public String getName(){ return name;}
    public ArrayList<course> getCourses(){return courses;}
}