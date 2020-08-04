package com.za.ga.cs;

import java.util.ArrayList;
import java.io.PrintWriter;
import java.sql.*;
import javax.swing.JOptionPane;

import com.za.ga.cs.connectionProvider.Dbmgr;
import com.za.ga.cs.connectionProvider.dbConnection;

public class Driver {
	 public static final int POPULATION_SIZE=9;
     public static final double MUTATION_RATE= 0.1;
     public static final double CROSSOVER_RATE=0.9;
     public static final int TOURNAMENT_SELECTION_SIZE=5;
     public static final int NUMB_OF_ELITE_SCHEDULE=1;
     private Dbmgr data;
	private int scheduleNumb=0;
	private int classNumb = 1;
	
	  public static void main(){
		  Driver driver= new Driver();
			driver.data=new Dbmgr();
			  int generationNumber=0;
	
			//driver.printAvailableData();
		/*	System.out.println(">Generation# "+generationNumber);
			System.out.println("  Schedule # |");
			   System.out.println("\n                 ");
			   System.out.print("Classes [dept,class,room,instructor,meeting-time]    ");
               System.out.println("                                                                 | Fitness | Conflicts");
              System.out.print("------------------------------------------------------------------------------");
              System.out.println("--------------------------------------------------------------------------------");*/
		         GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(driver.data);
		         Population population=new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
		       /*  population.getSchedule().forEach(schedule-> System.out.println("          "+driver.scheduleNumb++ +
		                                                                  "                 | "+schedule+"  |  "+
		                                                                                     String.format("%.5f", schedule.getFitness())+
		                                                                                     "  | "+schedule.getNumbOfConflicts()));*/
		       driver.printScheduleAsTable(population.getSchedule().get(0),generationNumber);
		         driver.classNumb=1;
		        while (population.getSchedule().get(0).getFitness() != 1.0){
		               /* System.out.println("> Generation #" + ++generationNumber);
		                 System.out.print(" Schedule # |                                          ");
		                 System.out.print("Classes [dept,class,room,instructor,meeting-time]    ");
		                 System.out.println("                                                | Fitness | Conflicts");
		                System.out.print("------------------------------------------------------------------------------");
		                System.out.println("--------------------------------------------------------------------------------");*/
		  		        population = geneticAlgorithm.evolve(population).sortByFitness();
		                 driver.scheduleNumb = 0;
		               /*  population.getSchedule().forEach(schedule-> System.out.println("          "+driver.scheduleNumb++ +
                                 "                 | "+schedule+"  |  "+
                                                    String.format("%.5f", schedule.getFitness())+
                                                    "  | "+schedule.getNumbOfConflicts()));*/
		                 driver.printScheduleAsTable(population.getSchedule().get(0), generationNumber);
		                 driver.classNumb =1;
		         }
	  }
    private void printScheduleAsTable(Schedule schedule,int generation){
         ArrayList<com.za.ga.cs.domain.Class> classes=schedule.getClasses();
       /*  System.out.println("\n                 ");
        System.out.println("     Class # | Dept | Course (number, max # of students) |  Room (Capacity) | Instructor (ID) | Meeting Time (ID)  ");
          System.out.println("                   ");
         System.out.println("--------------------------------------");
         System.out.println("------------------------------------------------------------");*/
         classes.forEach(x->{
                 int majorIndex=data.getDept().indexOf(x.getDept());
                 int coursesIndex=data.getCourse().indexOf(x.getCourse());
                 int roomsIndex=data.getRooms().indexOf(x.getRoom());
                 int instructorsIndex=data.getInstructors().indexOf(x.getInstructor());
                 int classTimeIndex=data.getClassTime().indexOf(x.getClassTime());
               /*  System.out.print("      ");
                 System.out.print(String.format("  %1$02d", classNumb)+"   | ");    
                System.out.print(String.format("%1$4s", data.getDept().get(majorIndex).getName())+"   | ");
                 System.out.print(String.format("%1$21s",data.getCourse().get(coursesIndex).getName()+" ("+data.getCourse().get(coursesIndex).getNumber()+" , "+
                 x.getCourse().getmaxNoOfStudent())+")   | ");
                System.out.print(String.format("%1$10s",data.getRooms().get(roomsIndex).getNumber()+
                 "  ("+x.getRoom().getSeatingCapacity())+")   | ");
                 System.out.print(String.format("%1$15s",data.getInstructors().get(instructorsIndex).getName()+
                 "   ("+data.getInstructors().get(instructorsIndex).getId()+")")+"  | ");
                 System.out.println(data.getClassTime().get(classTimeIndex).getTime()+"("+data.getClassTime().get(classTimeIndex).getId()+") ");*/
                 classNumb++;        
         });
         if(schedule.getFitness()==1) {
            	/* System.out.println("Scheduled Time table: "); 
            	  System.out.println("\n                 ");
                 System.out.println("     Class # | Dept | Course (number, max # of students) |  Room (Capacity) | Instructor (ID) | Meeting Time (ID)  ");
                   System.out.println("                   ");
                  System.out.println("--------------------------------------");
                  System.out.println("------------------------------------------------------------");*/
                  try {
                	  Connection conn=dbConnection.getCon();  
                 	 Statement statement;
          			statement = conn.createStatement();
          			statement.executeUpdate("DROP TABLE IF EXISTS `timetable`");	
          			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS timetable(Id INT NOT NULL AUTO_INCREMENT,\r\n" + 
          			 		"  `dept` TEXT NULL,\r\n" + 
          			 		"  `course(number,max # of students)` TEXT NULL,\r\n" + 
          			 		"  `Room(capacity)` TEXT NULL,\r\n" + 
          			 		"  `Instructor(ID)` TEXT NULL,\r\n" + 
          			 		"  `MeetingTime(ID)` TEXT NULL,\r\n" + 
          			 		"  PRIMARY KEY (`Id`))");
          			
          		
       }catch(Exception e) {
                	  System.out.println("An error occurred while Inserting Scheduled data in table.");
           			System.out.println("Error"+e.getMessage());
                  }    
                  classes.forEach(x->{
                          int majorIndex=data.getDept().indexOf(x.getDept());
                          int coursesIndex=data.getCourse().indexOf(x.getCourse());
                          int roomsIndex=data.getRooms().indexOf(x.getRoom());
                          int instructorsIndex=data.getInstructors().indexOf(x.getInstructor());
                          int classTimeIndex=data.getClassTime().indexOf(x.getClassTime());
                          String dept= data.getDept().get(majorIndex).getName();
                          String course_all=data.getCourse().get(coursesIndex).getName()+" ("+data.getCourse().get(coursesIndex).getNumber()+" , "+  x.getCourse().getmaxNoOfStudent()+")";
                          String Room_all=data.getRooms().get(roomsIndex).getNumber()+ "  ("+x.getRoom().getSeatingCapacity()+")";
                          String Instr_all=data.getInstructors().get(instructorsIndex).getName()+ "   ("+data.getInstructors().get(instructorsIndex).getId()+")";
                          String Classtime_all=data.getClassTime().get(classTimeIndex).getTime()+"("+data.getClassTime().get(classTimeIndex).getId()+") ";
                          try {
                        	  Connection conn=dbConnection.getCon();  
                         	 Statement statement;
                  			statement = conn.createStatement();
              
                  		
                  			 //Insert schedule Time table into db table TimeTable
                  			statement.executeUpdate("INSERT INTO timetable (dept,`course(number,max # of students)`,`Room(capacity)`,`Instructor(ID)`,`MeetingTime(ID)`) VALUES('"+dept+"','"+course_all+"','"+Room_all+"','"+Instr_all+"','"+Classtime_all+"')");
                  		 
                        	//  System.out.print(String.format("  %1$02d", classNumb)+"   | ");    
                           //   System.out.print(String.format("%1$4s", data.getDept().get(majorIndex).getName())+"   | ");
                           //   System.out.print(String.format("%1$21s",data.getCourse().get(coursesIndex).getName()+" ("+data.getCourse().get(coursesIndex).getNumber()+" , "+
                           //   x.getCourse().getmaxNoOfStudent())+")   | ");
                          //   System.out.print(String.format("%1$10s",data.getRooms().get(roomsIndex).getNumber()+
                          //    "  ("+x.getRoom().getSeatingCapacity())+")   | ");
                          //    System.out.print(String.format("%1$15s",data.getInstructors().get(instructorsIndex).getName()+
                          //    "   ("+data.getInstructors().get(instructorsIndex).getId()+")")+"  | ");
                         //     System.out.println(data.getClassTime().get(classTimeIndex).getTime()+"("+data.getClassTime().get(classTimeIndex).getId()+") ");        
                        
               }catch(Exception e) {
                        	  System.out.println("An error occurred while Inserting Scheduled data in table.");
                   			System.out.println("Error"+e.getMessage());
                          }     
                  });
        	        	 
         }    
 }

      /* private void printAvailableData(){
           System.out.println("Available Rooms=>");
           data.getRooms().forEach(x ->
                   System.out.println("Room # :"+ x.getNumber() + ",   seating capacity :" + x.getSeatingCapacity()));
           System.out.println("Available Instructors=>");
           data.getInstructors().forEach(x ->
                   System.out.println("ID :"+x.getId()+",  name :"+ x.getName()));
           
           System.out.println("Available MeetingRooms=>");
           data.getClassTime().forEach(x ->
                   System.out.println("id :"+x.getId() + "  time:" +x.getTime()));
       
           System.out.println("Available Courses=>");
           data.getCourse().forEach(x ->
                   System.out.println("course# :"+x.getNumber()+", name :"+x.getName() +", max # of students :"+x.getmaxNoOfStudent()+ ",  Instructors :"+x.getInstructors()));
           
       System.out.println("Available Departments-->");
       data.getDept().forEach(x-> 
               System.out.println("name :"+ x.getName() + " courses :"+ x.getCourses()));
     
       
       System.out.println("---------------------------------------------------------------------------------------------\n");
       
       
   }*/
}
