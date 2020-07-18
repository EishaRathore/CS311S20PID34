package com.za.tutorial.ga.cs.domain;
import java.util.ArrayList;
public class Course {
    private String number = null;
    private String name="susam";
    private int maxNoOfStudent;
 //   SYSTEM.out.println(name.toUpperCase());
    private ArrayList<Instructor> instructors;
    public Course(String number,String name,ArrayList<Instructor> instructors,int maxNoOfStudent){
        this.number=number;
        this.name=name;
        this.instructors=instructors;
        this.maxNoOfStudent=maxNoOfStudent;
    }
    public String getNumber(){ return number; }
    public String getName(){ return name; }
    public ArrayList<Instructor> getInstructors() { return instructors;}
    public int getmaxNoOfStudent() { return maxNoOfStudent; }
    public String toString(){ return name;}
	public String getId() {
		return null;
	}


}
// public class tes{
//     public static void main(String[] arg) {
//         string name="nsd";
//         SYSTEM.out.println(name.toUpperCase());
//     }
// }
