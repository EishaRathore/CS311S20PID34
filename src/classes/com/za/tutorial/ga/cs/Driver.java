/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package implementation;
package com.za.tutorial.ga.cs;
import java.sql.Connection;
import com.za.tutorial.ga.cs.domain.Schedule;
public class Driver {
     public static final int POPULATION_SIZE=9;
     public static final double MUTATION_RATE= 0.1;
     public static final double CROSSOVER_RATE=0.9;
     public static final int SELECTION_SIZE=3;
     public static final int NUM=1;
     public static final int TOURNAMENT_SELECTION_SIZE=9;
     public static final int NUMB_OF_ELITE_SCHEDULE=9;
     private Data data;
     static String database="";
static String url="jdbc:mysql://localhost:3306/";
static String username="root";

     static Connection connection=null;
      public static void main(final String args []){
        
       final Driver driver= new Driver();
       driver.data=new Data();
       driver.printAvailableData();
    }
        private void printAvailableData(){
        
        System.out.println("Available Departments=>");
        data.getDept().forEach(x-> 
                System.out.println("name :"+ x.getName() + " capacity :" + x.getCapacity() + " courses :"+ x.getCourses()));
        System.out.println("Available Courses=>");
        data.getCourse().forEach(x ->
                System.out.println("course :"+x.getName() + " id :"+ x.getId()));
        
        System.out.println("Available Rooms=>");
        data.getRooms().forEach(x ->
                System.out.println("Room :"+ x.getId() + " capacity :" + x.getSeatingCapacity()));
        System.out.println("Available Instructors=>");
        data.getInstructors().forEach(x ->
                System.out.println("name :"+ x.getName()+ " id :"+x.getId()));
        
        System.out.println("Available instructorFix=>");
        data.getInstructors().forEach(x->
                System.out.println("instructor "));
        
        System.out.println("Available MeetingRooms=>");
        data.getMeetingTime().forEach(x ->
                System.out.println("id :" + " time:" +x.getName()));
        
        System.out.println("---------------------------------------------------------------------------------------------\n");
        
        
    }   
        
}
