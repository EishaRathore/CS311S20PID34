package com.za.ga.cs;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

import com.za.ga.cs.connectionProvider.Dbmgr;
import com.za.ga.cs.connectionProvider.dbConnection;

public class Driver {
	 public static final int POPULATION_SIZE=9;
     public static final double MUTATION_RATE= 0.1;
     public static final double CROSSOVER_RATE=0.9;
     public static final int TOURNAMENT_SELECTION_SIZE=9;
     public static final int NUMB_OF_ELITE_SCHEDULE=9;
     private Dbmgr data;
	private int scheduleNumb=0;
	private int classNumb = 1;
	  
      public static void main(String args []){
       System.out.println("driver main running");
       Driver driver= new Driver();
       System.out.println("before stmt running");
		driver.data=new Dbmgr();
		System.out.println("before stmt1 running");
		//driver.printAvailableData();
		System.out.println("before stmt running");
       GeneticAlgorithm geneticAlgorithm=new GeneticAlgorithm(driver.data);
       System.out.println("GA running");
       Population population=new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
       System.out.println("GA1 running");
     int t=0;
       while (population.getSchedule().get(0).getFitness() != 1.0) {
    	   population = geneticAlgorithm.evolve(population).sortByFitness();
    	   t++;
       }
       System.out.println("while loop runned for " + t);
       
       driver.printTimeTable(population.getSchedule().get(0));
       driver.printTimeTable(population.getSchedule().get(1));
      }
      
      public static void generateTimeTable() {
      Driver driver=new Driver();
      driver.data=new Dbmgr();
    //  driver.printAvailableData();
      
      GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(driver.data);
      Population population = new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
      
      int t=0;
      while(population.getSchedule().get(0).getFitness()!=1.0){
          population = geneticAlgorithm.evolve(population).sortByFitness();
          t++;
          System.out.println("inside while "+t);
      }
      
      System.out.println("while loop runned for "+t);
      try {
    	  System.out.println(population.getSchedule().get(0).getClasses().get(20).getInstructor().getId()); 
      }catch(NullPointerException e) {
			System.out.println("NullPointerException thrown!");
		}
      
      driver.printTimeTable(population.getSchedule().get(0));
      //driver.printTimeTable(population.getSchedules().get(1));
  
  }
  private void printTimeTable(Schedule schedule){
      
      Connection conn= dbConnection.getCon();
      Statement stmt=null;
      String str=null;
      
      str="truncate table class";
       try {
          stmt=conn.createStatement();
          stmt.executeUpdate(str);
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "error in truncating");
              JOptionPane.showMessageDialog(null, e);
          }
      
       System.out.println("before forloop");
      for (int i=0;i<schedule.getClasses().size();i++){
          str="insert into class (classId , departmentId , courseId, instructorId , classTImeId, classroom_id) VALUES ('"+(i+1)+"','"+schedule.getClasses().get(i).getDept().getName()+  "','"+schedule.getClasses().get(i).getCourse().getNumber()+ "','"+schedule.getClasses().get(i).getInstructor().getId()+ "','"+schedule.getClasses().get(i).getClassTime().getId()+ "','"+schedule.getClasses().get(i).getRoom().getNumber()+"')";
          
          System.out.println(str);
          try {
          stmt=conn.createStatement();
          stmt.executeUpdate(str);
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "error in inserting where i="+(i+1));
              JOptionPane.showMessageDialog(null, e);
          }
      }
      for (int i=0;i<schedule.getClasses().size();i++){
          System.out.print(schedule.getClasses().get(i).getId() + "  |  ");
          System.out.print(schedule.getClasses().get(i).getDept().getName()+ "  |  ");
          System.out.print(schedule.getClasses().get(i).getCourse().getName()+"   |  ");
          // Instructor ins= schedule.getClasses().get(i).getInstructor();
          //System.out.print(ins+"  ");
          System.out.print(schedule.getClasses().get(i).getInstructor().getName()+"  |   ");
          System.out.print(schedule.getClasses().get(i).getRoom().getNumber()+ "   |  ");
          System.out.println(schedule.getClasses().get(i).getClassTime().getTime());
          //System.out.println("  collisions "+schedule.getNumberOfConflicts());
          
          
      }
      System.out.println("============================================================");
  }
  private void printAvailableData(){
      
      System.out.println("Available Departments=>");
      data.getDept().forEach(x-> 
              System.out.println("name :"+ x.getName()  + " courses :"+ x.getCourses()));
      System.out.println("Available Courses=>");
      data.getCourse().forEach(x ->
              System.out.println("course :"+x.getName() + " id :"+ x.getNumber()));
      
      System.out.println("Available Rooms=>");
      data.getRooms().forEach(x ->
              System.out.println("Room :"+ x.getNumber() + " capacity :" + x.getSeatingCapacity()));
      System.out.println("Available Instructors=>");
      data.getInstructors().forEach(x ->
              System.out.println("name :"+ x.getName()+ " id :"+x.getId()));
      
      
      System.out.println("Available MeetingRooms=>");
      data.getClassTime().forEach(x ->
              System.out.println("id :"+x.getId() + " time:" +x.getTime()));
      
      System.out.println("---------------------------------------------------------------------------------------------\n");
      
      
  }   }
      
      /* int generationNumber=0;
     //  driver.printAvailableData();
      // System.out.println(">Generation # "+generationNumber);
       //System.out.println("     Schedule # |                                    ");
       //System.out.println("Classes [dept,class,room,instructor,Class-Time]      ");
       //System.out.println("                                                | Fitnes | Conflicts");
       //System.out.println("---------------------------------------------------------");  
       //System.out.println("---------------------------------------------------------");
       GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(driver.data);
       Population population=new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
      /* population.getSchedule().forEach(schedule-> System.out.println("          "+driver.scheduleNumb++ +
                                                                "       | "+schedule+"  |  "+
                                                                String.format("%.5f", schedule.getFitness())+
                                                                "  | "+schedule.getNumbOfConflicts()));*/
      // driver.printScheduleAsTable(population.getSchedule().get(0),generationNumber);
     /*  driver.classNumb=1;
       while (population.getSchedule().get(0).getFitness() != 1.0){
             //  System.out.println("> Generation #" + ++generationNumber);
              // System.out.print(" Schedule # |                                          ");
               //System.out.print("Classes [dept,class,room,instructor,meeting-time]    ");
               //System.out.println("                                  | Fitness | Conflicts");
               //System.out.print("------------------------------------------------------------------------------");
               //System.out.println("--------------------------------------------------------------------------------");
               population = geneticAlgorithm.evolve(population).sortByFitness();
               driver.scheduleNumb = 0;
               population.getSchedule().forEach(schedule -> System.out.println("      "+driver.scheduleNumb++ +                                                      " | "+schedule.getNumbOfConflicts()));
               driver.printScheduleAsTable(population.getSchedule().get(0), generationNumber);
               driver.classNumb =1;
       }*/
    
   // }
    
  /*    private void printScheduleAsTable(Schedule schedule,int generation){
          ArrayList<com.za.ga.cs.domain.Class> classes=schedule.getClasses();
       //   System.out.println("\n                 ");
       //   System.out.println("     Class # | Dept | Course (number, max # of students) |  Room (Capacity) | Instructor (ID) | Meeting Time (ID)  ");
      //     System.out.println("                   ");
      //     System.out.println("--------------------------------------");
      //    System.out.println("------------------------------------------------------------");
          classes.forEach(x->{
                  int majorIndex=data.getDept().indexOf(x.getDept());
                  int coursesIndex=data.getCourse().indexOf(x.getCourse());
                  int roomsIndex=data.getRooms().indexOf(x.getRoom());
                  int instructorsIndex=data.getInstructors().indexOf(x.getInstructor());
                  int classTimeIndex=data.getClassTime().indexOf(x.getClassTime());
              //    System.out.print("      ");
              //    System.out.print(String.format("  %1$02d", classNumb)+"   | ");    
             //     System.out.print(String.format("%1$4s", data.getDept().get(majorIndex).getName())+"   | ");
             //     System.out.print(String.format("%1$21s",data.getCourse().get(coursesIndex).getName()+" ("+data.getCourse().get(coursesIndex).getNumber()+" , "+
           //       x.getCourse().getmaxNoOfStudent())+")   | ");
           //       System.out.print(String.format("%1$10s",data.getRooms().get(roomsIndex).getNumber()+
          //        "  ("+x.getRoom().getSeatingCapacity())+")   | ");
          //        System.out.print(String.format("%1$15s",data.getInstructors().get(instructorsIndex).getName()+
           //       "   ("+data.getInstructors().get(instructorsIndex).getId()+")")+"  | ");
           //       System.out.println(data.getClassTime().get(classTimeIndex).getTime()+"("+data.getClassTime().get(classTimeIndex).getId()+") ");
                  classNumb++;        
          });
       //   if(schedule.getFitness()==1) System.out.println("> Solution Found in "+ (generation+1)+" generations");
     //     System.out.println("------------------------------------------------------------");
     //     System.out.println("------------------------------------------------------------");     
  }
    /*    private void printAvailableData(){
        
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
        
        
    }*/
       
