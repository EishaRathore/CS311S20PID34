package com.za.ga.cs.domain;

import java.util.ArrayList;

public class Department {
	 private String name;
	 private ArrayList<Course> courses;
     public Department(String name,ArrayList<Course> courses){
	        this.name = name;
	        this.courses = courses;
	    }
	 public String getName(){ return name;}
	 public ArrayList<Course> getCourses(){return courses;}
}
