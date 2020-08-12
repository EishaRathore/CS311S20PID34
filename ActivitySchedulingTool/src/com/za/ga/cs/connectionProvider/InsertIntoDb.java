package com.za.ga.cs.connectionProvider;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoDb {

	public static void main() throws Exception{
		CreateTable();
       InsertIntoTbl();
	}

	private static void InsertIntoTbl() {
		try {
			Connection con=dbConnection.getCon();
			 Statement statement;
			statement = con.createStatement();
			statement.executeUpdate("INSERT INTO role (Role)  SELECT 'Admin' WHERE NOT EXISTS (Select Role From role WHERE Role ='Admin') LIMIT 1 ");
		    statement.executeUpdate("INSERT INTO role (Role)  SELECT 'Student' WHERE NOT EXISTS (Select Role From role WHERE Role ='Student') LIMIT 1 ");

		    statement.executeUpdate("INSERT INTO dept (dname) SELECT 'Computer Science' WHERE NOT EXISTS (Select dname From dept WHERE dname='Computer Science') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO dept (dname) SELECT 'Math' WHERE NOT EXISTS (Select dname From dept WHERE dname='Math') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO dept (dname) SELECT 'Computer Engineering' WHERE NOT EXISTS (Select dname From dept WHERE dname='Computer Engineering') LIMIT 1 ");
		    
		    statement.executeUpdate("INSERT INTO userdata (fName,lName,email,password,cpassword,mbl,urole,dept)  SELECT 'Alisha','Butt','alisha@gmail.com','12345678','12345678','03214567891','Student','Computer Science' WHERE NOT EXISTS (Select fName,lName,email,password,cpassword,mbl,urole,dept From userdata WHERE fName='Alisha' AND lName='Butt' AND email='alisha@gmail.com' AND password='12345' AND cpassword='12345' AND mbl='03214567891' AND urole ='Student' AND dept='Computer Science') LIMIT 1 ");
		    statement.executeUpdate("INSERT INTO userdata (fName,lName,email,password,cpassword,mbl,urole,dept)  SELECT 'Eisha','Butt','eisha@gmail.com','12345678','12345678','03214567890','Admin',NULL WHERE NOT EXISTS (Select fName,lName,email,password,cpassword,mbl,urole,dept From userdata WHERE fName='Eisha' AND lName='Butt' AND email='eisha@gmail.com' AND password='1234' AND cpassword='1234' AND mbl='03214567890' AND urole ='Admin' AND dept=NULL) LIMIT 1 ");	
		    
		     statement.executeUpdate("INSERT INTO rooms (room_no,room_capacity) SELECT 'N11','25' WHERE NOT EXISTS (Select room_no,room_capacity From rooms WHERE room_no ='N11' AND room_capacity='25') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO rooms (room_no,room_capacity) SELECT 'N9','50' WHERE NOT EXISTS (Select room_no,room_capacity From rooms WHERE room_no ='N9' AND room_capacity='50') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO rooms (room_no,room_capacity) SELECT 'N10','25' WHERE NOT EXISTS (Select room_no,room_capacity From rooms WHERE room_no ='N10' AND room_capacity='25') LIMIT 1 ");
		     
		     statement.executeUpdate("INSERT INTO meetingtime (meetingID,meeting_time) SELECT 'MT1','MWF 09:00 - 10:00' WHERE NOT EXISTS (Select meetingID,meeting_time From meetingtime WHERE meetingID ='MT1' AND meeting_time='MWF 09:00 - 10:00') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO meetingtime (meetingID,meeting_time) SELECT 'MT2','MWF 10:00 - 11:00' WHERE NOT EXISTS (Select meetingID,meeting_time From meetingtime WHERE meetingID ='MT2' AND meeting_time='MWF 10:00 - 11:00') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO meetingtime (meetingID,meeting_time) SELECT 'MT3','TTH 09:00 - 10:00' WHERE NOT EXISTS (Select meetingID,meeting_time From meetingtime WHERE meetingID ='MT3' AND meeting_time='TTH 09:00 - 10:00') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO meetingtime (meetingID,meeting_time) SELECT 'MT4','TTH 10:30 - 12:00' WHERE NOT EXISTS (Select meetingID,meeting_time From meetingtime WHERE meetingID ='MT4' AND meeting_time='TTH 10:30 - 12:00') LIMIT 1 ");
		    
		     statement.executeUpdate("INSERT INTO faculty (Iname,Inum) SELECT 'Dr Awais','I1' WHERE NOT EXISTS (Select Iname,Inum From faculty WHERE Iname ='Dr Awais' AND Inum='I1') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO faculty (Iname,Inum) SELECT 'Ms Shazia','I2' WHERE NOT EXISTS (Select Iname,Inum From faculty WHERE Iname ='Ms Shazia' AND Inum='I2') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO faculty (Iname,Inum) SELECT 'Dr Waqar','I3' WHERE NOT EXISTS (Select Iname,Inum From faculty WHERE Iname ='Dr Waqar' AND Inum='I3') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO faculty (Iname,Inum) SELECT 'Dr Nazim','I4' WHERE NOT EXISTS (Select Iname,Inum From faculty WHERE Iname ='Dr Nazim' AND Inum='I4') LIMIT 1 ");
		    
		     statement.executeUpdate("INSERT INTO course (CID,Cname,code,seating_capacity) SELECT 'C1','Programming Fundamental','CS123','25' WHERE NOT EXISTS (Select CID,Cname,code,seating_capacity From course WHERE CID='C1' AND Cname='Programming Fundamental' AND code='CS123' AND seating_capacity='25') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO course (CID,Cname,code,seating_capacity) SELECT 'C2','Math','MA234','30' WHERE NOT EXISTS (Select CID,Cname,code,seating_capacity From course WHERE CID='C2' AND Cname='Math' AND code='MA234' AND seating_capacity='30') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO course (CID,Cname,code,seating_capacity) SELECT 'C3','Analysis of Algorithm','CS452','50' WHERE NOT EXISTS (Select CID,Cname,code,seating_capacity From course WHERE CID='C3' AND Cname='Analysis of Algorithm' AND code='CS452' AND seating_capacity='50') LIMIT 1 ");
			    
		     
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I1','C1' WHERE NOT EXISTS (Select course_instructor,course_numb From course_instructor WHERE course_instructor='I1' AND course_numb='C1') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I1','C2' WHERE NOT EXISTS (Select course_instructor,course_numb From course_instructor WHERE course_instructor ='I1' AND course_numb='C2') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I2','C3' WHERE NOT EXISTS (Select course_instructor,course_numb From course_instructor WHERE course_instructor='I2' AND course_numb='C3') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I2','C1' WHERE NOT EXISTS (Select course_instructor,course_numb From course_instructor WHERE course_instructor ='I2' AND course_numb='C1') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I4','C2' WHERE NOT EXISTS (Select course_instructor,course_numb From course_instructor WHERE course_instructor ='I4' AND course_numb='C2') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I3','C3' WHERE NOT EXISTS (Select course_instructor,course_numb From course_instructor WHERE course_instructor ='I3' AND course_numb='C3') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I3','C2' WHERE NOT EXISTS (Select course_instructor,course_numb From course_instructor WHERE course_instructor ='I3' AND course_numb='C2') LIMIT 1 ");
		    
			    
			 statement.executeUpdate("INSERT INTO dept_course (dept_name,course_numb) SELECT 'Computer Science','C1' WHERE NOT EXISTS (Select dept_name,course_numb From dept_course WHERE dept_name='Computer Science' AND course_numb='C1') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO dept_course (dept_name,course_numb) SELECT 'Math','C2' WHERE NOT EXISTS (Select dept_name,course_numb From dept_course WHERE dept_name='Math' AND course_numb='C2') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO dept_course (dept_name,course_numb) SELECT 'Computer Engineering','C3' WHERE NOT EXISTS (Select dept_name,course_numb From dept_course WHERE dept_name='Computer Engineering' AND course_numb='C3') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO dept_course (dept_name,course_numb) SELECT 'Math','C3' WHERE NOT EXISTS (Select dept_name,course_numb From dept_course WHERE dept_name='Math' AND course_numb='C3') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO dept_course (dept_name,course_numb) SELECT 'Computer Engineering','C2' WHERE NOT EXISTS (Select dept_name,course_numb From dept_course WHERE dept_name='Computer Engineering' AND course_numb='C2') LIMIT 1 ");
		     
		     //  statement.executeUpdate("INSERT INTO meetingtime (meetingID,meeting_time) values('MT1','MWF 09:00 - 10:00'),('MT2','MWF 10:00 - 11:00),('MT3','TTH 09:00 - 10:00),('MT4','TTH 10:30 - 12:00) ");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occurred while inserting into tables.");
			System.out.println("Error"+e.getMessage());
		}
		
		
	}

	private static void CreateTable() {
		try {
			Connection con=dbConnection.getCon();
			 Statement statement;
			statement = con.createStatement();
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS role(Role VARCHAR(50),PRIMARY KEY(Role))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS rooms(room_no VARCHAR(50),room_capacity int,PRIMARY KEY(room_no))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS dept(dname VARCHAR(50) NOT NULL,PRIMARY KEY(dname))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS  userdata(id INT(50) NOT NULL AUTO_INCREMENT,fName varchar(255),lName varchar(255),email varchar(255),password varchar(255),cpassword varchar(255),mbl varchar(255),urole VARCHAR(50),dept varchar(255),PRIMARY KEY(id),FOREIGN KEY (urole) REFERENCES role (Role),FOREIGN KEY (dept) REFERENCES dept (dname))");			 
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS meetingtime(id INT(50) NOT NULL AUTO_INCREMENT,meetingID text,meeting_time TEXT,PRIMARY KEY(id))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS course(CID VARCHAR(50) NOT NULL,Cname TEXT,code VARCHAR(50),seating_capacity int,PRIMARY KEY(CID))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS faculty(Iname TEXT ,Inum VARCHAR(50) NOT NULL,PRIMARY KEY(Inum))");

			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS course_instructor(id INT(50) NOT NULL AUTO_INCREMENT,course_instructor VARCHAR(50),course_numb VARCHAR(50),PRIMARY KEY(id),FOREIGN KEY (course_instructor) REFERENCES faculty (Inum),FOREIGN KEY (course_numb) REFERENCES course (CID))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS dept_course(id INT(50) NOT NULL AUTO_INCREMENT,dept_name VARCHAR(50),course_numb VARCHAR(50),PRIMARY KEY(id),FOREIGN KEY (dept_name) REFERENCES dept (dname),FOREIGN KEY (course_numb) REFERENCES course (CID))");
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occurred while creating tables.");
			System.out.println("Error"+e.getMessage());
		}
		
	}

}
