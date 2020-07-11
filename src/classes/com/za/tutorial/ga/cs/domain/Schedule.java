package com.za.tutorial.ga.cs.domain;
public class Schedule{
    private ArrayList<Class> classes;
    private int ClassNum = 0;
    private data data;
    public Data getData(){return data;}
    public Schedule(Data  data){
        this.data_ data;
        classes = new ArrayList<Class>(data.getNumberOFClasses());
    }
    public Schedule initialize(){
        new ArrayList<department>(data.getDepts()).forEach(dept ->{
            dept.getCourses().forEach(course ->{
                class newClass = new Class(classNum++,dept,course);
                newClass.setMeetingTime(data.getMeetingTime().get((int)(data.getMeetingTimes().size()* Math.random())));
                newClass.setRoom(data.getRooms(.get((int)(data.getRooms().size()*Math.random())));)
                newClass.setInstructor(course.getInstructor().get((int)(course.getInstructors().size()* Math.random())));
                classses.add(newClass);
            });
        });
        return this;
    }
}
