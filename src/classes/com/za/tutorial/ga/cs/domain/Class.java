package com.za.tutorial.ga.cs.domain;
import java.lang.String;
public class Class {
    private final Department dept;
    private final int id; 
    private final Course course;
    private Instructor instructor;
    private ClassTime classTime;
    private Room room;
    public Class(final int id,final Course course,final Department dept
    ) {
        this.id=id;
        this.course=course;
        this.dept=dept;
    }
    public void setInstructor(final Instructor instructor) { this.instructor=instructor; }
    public void setClassTime(final ClassTime classTime) { this.classTime=classTime; }
    public void setRoom(final Room room) { this.room=room; }
    public int  getId() { return id; }
    public Department getDept() { return dept;}
    public Course getCourse() { return course; }
    public Instructor getInstructor() { return instructor; }
    public ClassTime getClassTime() { return classTime; }
    public Room getRoom(){ return room;}
    public String toString(){
        return "["+dept.getName()+","+course.getNumber()+","+room.getNumber()+","+instructor.getId()+","+classTime.getId()+"]";
    }
}