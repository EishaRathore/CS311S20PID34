package com.za.tutorial.ga.cs.domain;
import java.util.ArrayList;
import com.za.tutorial.ga.cs.Data;
import com.za.tutorial.ga.cs.domain.Class;
import com.za.tutorial.ga.cs.domain.Department;

public class Schedule{
    private final ArrayList<Class> classes;
    private int classNum = 0;
    private final Data data;
    public Data getData(){return data;}
    public Schedule(Data  data){
        this.data= data;
        classes = new ArrayList<Class>(data.getNumberOfClasses());
    }
    public Schedule initialize(){
        new ArrayList<Department>(data.getDept()).forEach(dept ->{
            dept.getCourses().forEach(course ->{
                Class newClass = new Class(classNum++,course,dept);
                newClass.setClassTime(data.getClassTime().get((int)(data.getClassTime().size()*Math.random())));
                newClass.setRoom(data.getRooms().get((int)(data.getRooms().size()*Math.random())));
                newClass.setInstructor(course.getInstructors().get((int)(course.getInstructors().size()* Math.random())));
                classes.add(newClass);
            });
        });
        return this;
    }
}
