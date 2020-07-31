package com.za.ga.cs.connectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import com.za.ga.cs.domain.ClassTime;
import com.za.ga.cs.domain.Course;
import com.za.ga.cs.domain.Department;
import com.za.ga.cs.domain.Instructor;
import com.za.ga.cs.domain.Rooms;

public class Dbmgr {
		//public static Dbmgr data;
	private ArrayList<Rooms> rooms;
    private ArrayList<Instructor> instructor;
    private ArrayList<Course> course;
    private ArrayList<Department> dept;
    private ArrayList<ClassTime> classtime;
    private int numberOfClasses = 0;
    public ArrayList<Rooms> getRooms(){return rooms;}
    public ArrayList<Instructor> getInstructors(){return instructor;}
    public ArrayList<Course> getCourse(){return course;}
    public ArrayList<Department> getDept(){return dept;}
    public ArrayList<ClassTime> getClassTime(){return classtime;}
    public int getNumberOfClasses(){return this.numberOfClasses;}

    public   Dbmgr() { 
    	try {
			initialize();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error"+e.getMessage());
		}
    	}
    private Dbmgr initialize() throws SQLException {
        Connection connection = dbConnection.getCon();
        System.out.println("In Initialize");
        rooms = selectRooms(connection);
        System.out.println("dept for each");
        classtime = selectClassTime(connection);
        System.out.println("dept for each1");
        instructor =selectInstructors(connection);
        System.out.println("dept for each2");
        course = selectCourses(connection);
        System.out.println("dept for each4");
        dept = selectDepartments(connection);
        System.out.println("dept for each3");
       
        dept.forEach(x -> numberOfClasses += x.getCourses().size());
        return this;
    }
    public ArrayList<Rooms> selectRooms(Connection connection){
    	try {
    		ArrayList<Rooms> rooms = new ArrayList<Rooms>();
            ResultSet roomRS=null;
            roomRS = connection.createStatement().executeQuery("select * from rooms");
            while (roomRS.next()) rooms.add(new Rooms(roomRS.getString("room_no"), Integer.parseInt(roomRS.getString("room_capacity"))));
            return rooms;
    	}catch(Exception e) {
    		System.out.println("Error"+e.getMessage());
    		// JOptionPane.showMessageDialog(null, "error in getRooms in data class");
             //JOptionPane.showMessageDialog(null, e);
             return null;
    	}
        
    }
    public ArrayList<ClassTime> selectClassTime(Connection connection) throws SQLException{
        ArrayList<ClassTime> classtime = new ArrayList<ClassTime>();
        ResultSet classTimeRS = connection.createStatement().executeQuery("select * from meetingtime");
        while (classTimeRS.next()) classtime.add(new ClassTime(classTimeRS.getString("id"), classTimeRS.getString("meeting_time")));
        return classtime;
    }
    public ArrayList<Instructor> selectInstructors(Connection connection) throws SQLException{
        ArrayList<Instructor> instructor = new ArrayList<Instructor>();
        ResultSet instructorsRS = connection.createStatement().executeQuery("select * from faculty");
        while ( instructorsRS.next()) instructor.add(new Instructor(instructorsRS.getInt("id"),instructorsRS.getString("Iname")));
        return instructor;
    }
    
    public ArrayList<Course> selectCourses(Connection connection) throws SQLException{
        ArrayList<Course> course = new ArrayList<Course>();
        System.out.println("in select course");
        ResultSet courseRS = connection.createStatement().executeQuery("select * from course");
        System.out.println("in select course1");
        while ( courseRS.next()){
        	 System.out.println("in select course2");
            ResultSet courseInstructorRS = connection.createStatement().executeQuery("Select * from course_insrtuctor where course_numb= "+courseRS.getString("code")+"'");
            System.out.println("in select course3");
            ArrayList<Instructor> courseInstructors = new ArrayList<Instructor>();
            System.out.println("in select course4");
            while (courseInstructorRS.next())
            for(int i=0;i<instructor.size();i++)
            if (instructor.get(i).getId()==courseInstructorRS.getInt("instructor_id"))
            courseInstructors.add(instructor.get(i));
            course.add(new Course(courseRS.getString("code"),courseRS.getString("Cname"), courseInstructors, courseRS.getInt("seating_capacity")));
            System.out.println("in select course4");
        }
        return course;
    }
    
    public ArrayList<Department> selectDepartments(Connection connection) throws SQLException{
        ArrayList<Department> dept = new ArrayList<Department>();
        ResultSet deptRS = connection.createStatement().executeQuery("select * from dept");
        while ( deptRS.next()){
            ResultSet deptCourseRS = connection.createStatement().executeQuery("Select * from dept_course where dept_name= "+deptRS.getString("dname")+"'");
            ArrayList<Course> deptCourses = new ArrayList<Course>();
            while (deptCourseRS.next())
            for(int i=0;i<course.size();i++)
            if (course.get(i).getNumber().equals(deptCourseRS.getString("course_numb")))
            deptCourses.add(course.get(i));
            dept.add(new Department(deptRS.getString("dname"), deptCourses));
        }
        return dept;
    }
}



  /*  private Data initialize(){
    Rooms room1= new Rooms("R1",50);
    Rooms room2= new Rooms("R2",50);
    Rooms room3= new Rooms("R3",50);
    rooms=new ArrayList<Rooms> (Arrays.asList(room1,room2,room3));
    ClassTime classtime1=new ClassTime("CT1","MWF 09:00 - 10:00");
    ClassTime classtime2=new ClassTime("CT2","TTH 11:00 - 12:00");
    ClassTime classtime3=new ClassTime("CT3","MWF 10:00 - 11:00");
    ClassTime classtime4=new ClassTime("CT4","MWF 08:00 - 09:00");
    ClassTime classtime5=new ClassTime("CT5","TTH 01:00 - 02:00");
    classtime=new ArrayList<ClassTime> (Arrays.asList(classtime1,classtime2,classtime3,classtime4,classtime5));
    Instructor instructor1=new Instructor("I1","Dr. Amna");
    Instructor instructor2=new Instructor("I2","Dr Awais");
    Instructor instructor3=new Instructor("I3","Dr Riaz");
    Instructor instructor4=new Instructor("I4","Dr Ali");
    Instructor instructor5=new Instructor("I5","Dr Ayesha");
    instructor=new ArrayList<Instructor> (Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5));
    Course course1=new Course("C1","325K",new ArrayList<Instructor>(Arrays.asList(instructor1,instructor2)),50);
    Course course2=new Course("C2","303K",new ArrayList<Instructor>(Arrays.asList(instructor1)),25);
    Course course3=new Course("C3","306K",new ArrayList<Instructor>(Arrays.asList(instructor5,instructor3)),40);
    Course course4=new Course("C4","317K",new ArrayList<Instructor>(Arrays.asList(instructor4,instructor3)),30);


    course=new ArrayList<Course>(Arrays.asList(course1,course2,course3,course4));
   Department dept1=new Department("Math",new ArrayList<Course>(Arrays.asList(course1,course2)));
   Department dept2=new Department("Bio",new ArrayList<Course>(Arrays.asList(course1)));
   Department dept3=new Department("Comp",new ArrayList<Course>(Arrays.asList(course2,course3)));
   dept=new ArrayList<Department> (Arrays.asList(dept1,dept2,dept3));
   dept.forEach(x -> numberOfClasses += x.getCourses().size());
   return this;
} */

    	

