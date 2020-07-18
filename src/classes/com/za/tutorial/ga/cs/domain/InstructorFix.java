package com.za.tutorial.ga.cs.domain;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author chandrasekhar ch
 */

public class InstructorFix {
    private Instructor instructor;
    private Course course;
    private Department department;
     
    public InstructorFix(Department department, Course course , Instructor instructor){
        this.department=department;
        this.course=course;
        this.instructor=instructor;
    }

    public Instructor getInstructorFix() {
        return instructor;
    }
    
    public Course getCourseFix(){
        return course;
    }
    
    public Department getDepartmentFix(){
        return department;
    }
    
    public String toString(){
        return  instructor.getName()+" "+course.getName()+" "+department.getName();
    } 
}
