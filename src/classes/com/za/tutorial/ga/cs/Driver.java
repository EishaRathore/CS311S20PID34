/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package implementation;
package com.za.tutorial.ga.cs;
import java.sql.Connection;
import java.util.ArrayList;

import com.za.tutorial.ga.cs.domain.Schedule;

public class Driver {
     public static final int POPULATION_SIZE=9;
     public static final double MUTATION_RATE= 0.1;
     public static final double CROSSOVER_RATE=0.9;
     public static final int SELECTION_SIZE=3;
     public static final int NUM=1;
     public static final int TOURNAMENT_SELECTION_SIZE=9;
     public static final int NUMB_OF_ELITE_SCHEDULE=9;
     private int classNumb=1;
     private Data data;
	private int scheduleNumb=0;
     static String database="";
static String url="jdbc:mysql://localhost:3306/";
static String username="root";

     static Connection connection=null;
      public static void main(final String args []){
        
       final Driver driver= new Driver();
       driver.data=new Data();
       int generationNumber=0;
       driver.printAvailableData();
       System.out.println(">Generation # "+generationNumber);
       System.out.println("     Scheduke # |                                    ");
       System.out.println("Classes [dept,class,room,instructor,Class-Time]      ");
       System.out.println("                                    | Fitnes | Conflicts");
       System.out.println("---------------------------------------------------------");  
       System.out.println("---------------------------------------------------------");
       GeneticAlgorithm geneticAlgorithm=new GeneticAlgorithm(driver.data);
       Population population=new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
       population.getSchedule().forEach(schedule-> System.out.println("          "+driver.scheduleNumb++ +
                                                                "       | "+schedule+"  |  "+
                                                                String.format("%.5f", schedule.getFitness())+
                                                                "  | "+schedule.getNumbOfConflicts()));
    }
    private void printScheduleAsTable(Schedule schedule,int generation){
            ArrayList<com.za.tutorial.ga.cs.domain.Class> classes=schedule.getClasses();
            System.out.println("\n                              ");
            System.out.println("Class # | Dept | Course (number");
            System.out.println("                                ");
            System.out.println("--------------------------------------");
            System.out.println("------------------------------------------------------------");
            classes.forEach(x->{
                    int majorIndex=data.getDept().indexOf(x.getDept());
                    int coursesIndex=data.getCourse().indexOf(x.getCourse());
                    int roomsIndex=data.getRooms().indexOf(x.getRoom());
                    int instructorsIndex=data.getInstructors().indexOf(x.getInstructor());
                    int classTimeIndex=data.getClassTime().indexOf(x.getClassTime());
                    System.out.println("                        ");
                    System.out.println(String.format("  %1$02d", classNumb)+"   | ");    
                    System.out.println(String.format("%1$4s", data.getDept().get(majorIndex).getName())+"   | ");
                    System.out.println(String.format("%1$21s",data.getCourse().get(coursesIndex).getName()+" ("+data.getCourse().get(coursesIndex).getNumber()+" , "+
                    x.getCourse().getmaxNoOfStudent())+")        | ");
                            
            });     
    }
        private void printAvailableData(){
        
        System.out.println("Available Departments-->");
        data.getDept().forEach(x-> 
                System.out.println("name :"+ x.getName() + " courses :"+ x.getCourses()));
        System.out.println("Available Courses=>");
        data.getCourse().forEach(x ->
                System.out.println("course# :"+x.getNumber()+", name :"+x.getName() +", max # of students :"+x.getmaxNoOfStudent()+ ",  Instructors :"+x.getInstructors()));
        
        System.out.println("Available Rooms=>");
        data.getRooms().forEach(x ->
                System.out.println("Room # :"+ x.getNumber() + ",   seating capacity :" + x.getSeatingCapacity()));
        System.out.println("Available Instructors=>");
        data.getInstructors().forEach(x ->
                System.out.println("ID :"+x.getId()+",  name :"+ x.getName()));
        
        System.out.println("Available MeetingRooms=>");
        data.getClassTime().forEach(x ->
                System.out.println("id :"+x.getId() + "  time:" +x.getTime()));
        
        System.out.println("---------------------------------------------------------------------------------------------\n");
        
        
    }   
        
}
