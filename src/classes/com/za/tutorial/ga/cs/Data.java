package com.za.tutorial.ga.cs;
import java.util.ArrayList;
import java.util.Arrays;
import com.za.tutorial.ga.cs.domain.Instructor;
import com.za.tutorial.ga.cs.domain.Room;
import com.za.tutorial.ga.cs.domain.Department;
import com.za.tutorial.ga.cs.domain.Course;
import com.za.tutorial.ga.cs.domain.Class;
import com.za.tutorial.ga.cs.domain.ClassTime;


public class Data{
    public static Data data;
	private ArrayList<Room> rooms;
    private ArrayList<Instructor> instructor;
    private ArrayList<Course> course;
    private ArrayList<Department> dept;
    private ArrayList<ClassTime> classtime;

    private int numberOfClasses = 0;
    public Data(){initialize();}
    private Data initialize(){
        Room room1= new Room("R1",50);
        Room room2= new Room("R2",50);
        Room room3= new Room("R3",50);
        rooms=new ArrayList<Room> (Arrays.asList(room1,room2,room3));
        ClassTime classtime1=new ClassTime("CT1","MWF 09:00 - 10:00");
        ClassTime classtime2=new ClassTime("CT2","TTH 11:00 - 12:00");
        ClassTime classtime3=new ClassTime("CT3","MWF 10:00 - 11:00");
        ClassTime classtime4=new ClassTime("CT4","MWF 08:00 - 09:00");
        ClassTime classtime5=new ClassTime("CT5","TTH 01:00 - 02:00");
        classtime=new ArrayList<ClassTime> (Arrays.asList(classtime1,classtime2,classtime3,classtime4,classtime5));
        Instructor instructor1=new Instructor("I1","Dr. Amna");
        Instructor instructor2=new Instructor("I2","Dr Awais");
        Instructor instructor3=new Instructor("I3","Dr riaz");
        instructor=new ArrayList<Instructor> (Arrays.asList(instructor1,instructor2,instructor3));
        Course course1=new Course("C1","325K",new ArrayList<Instructor>(Arrays.asList(instructor1,instructor2)),50);
        Course course2=new Course("C2","303K",new ArrayList<Instructor>(Arrays.asList(instructor1)),25);
        Course course3=new Course("C3","306K",new ArrayList<Instructor>(Arrays.asList(instructor1,instructor3)),40);
        course=new ArrayList<Course>(Arrays.asList(course1,course2,course3));
       Department dept1=new Department("Math",new ArrayList<Course>(Arrays.asList(course1,course2)));
       Department dept2=new Department("Bio",new ArrayList<Course>(Arrays.asList(course1)));
       Department dept3=new Department("Comp",new ArrayList<Course>(Arrays.asList(course2,course3)));
       dept=new ArrayList<Department> (Arrays.asList(dept1,dept2,dept3));
       dept.forEach(x -> numberOfClasses += x.getCourses().size());
       return this;
    } 

    public ArrayList<Room> getRooms(){return rooms;}
    public ArrayList<Instructor> getInstructors(){return instructor;}
    public ArrayList<Course> getCourse(){return course;}
    public ArrayList<Department> getDept(){return dept;}
    public ArrayList<ClassTime> getClassTime(){return classtime;}
    public int getNumberOfClasses(){return this.numberOfClasses;}
	public ArrayList<Class> getMeetingTime() {
		return null;
	}
}