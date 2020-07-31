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
		     statement.executeUpdate("INSERT INTO faculty (Iname,Inum) SELECT 'Dr Nazim','I4' WHERE NOT EXISTS (Select Iname,Inum From faculty WHERE Iname ='Dr Waqar' AND Inum='I4') LIMIT 1 ");
		    
		     statement.executeUpdate("INSERT INTO course (CID,Cname,code,seating_capacity) SELECT 'C1','Programming Fundamental','CS123','25' WHERE NOT EXISTS (Select CID,Cname,code,seating_capacity From course WHERE CID='C1' AND Cname='Programming Fundamental' AND code='CS123' AND seating_capacity='25') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO course (CID,Cname,code,seating_capacity) SELECT 'C2','Math','MA234','30' WHERE NOT EXISTS (Select CID,Cname,code,seating_capacity From course WHERE CID='C2' AND Cname='Math' AND code='MA234' AND seating_capacity='30') LIMIT 1 ");
			 statement.executeUpdate("INSERT INTO course (CID,Cname,code,seating_capacity) SELECT 'C3','Analysis of Algorithm','CS452','50' WHERE NOT EXISTS (Select CID,Cname,code,seating_capacity From course WHERE CID='C3' AND Cname='Analysis of Algorithm' AND code='CS452' AND seating_capacity='50') LIMIT 1 ");
			    
		     
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I1','C1' WHERE NOT EXISTS (Select course_instructor,course_numb From faculty WHERE course_instructor='I1' AND course_numb='C1') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I1','C2' WHERE NOT EXISTS (Select course_instructor,course_numb From faculty WHERE course_instructor ='I1' AND course_numb='C2') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I2','C3' WHERE NOT EXISTS (Select course_instructor,course_numb From faculty WHERE course_instructor='I2' AND course_numb='C3') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I2','C1' WHERE NOT EXISTS (Select course_instructor,course_numb From faculty WHERE course_instructor ='I2' AND course_numb='C1') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I4','C2' WHERE NOT EXISTS (Select course_instructor,course_numb From faculty WHERE course_instructor ='I4' AND course_numb='C2') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I3','C3' WHERE NOT EXISTS (Select course_instructor,course_numb From faculty WHERE course_instructor ='I3' AND course_numb='C3') LIMIT 1 ");
		     statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT 'I3','C2' WHERE NOT EXISTS (Select course_instructor,course_numb From faculty WHERE course_instructor ='I3' AND course_numb='C2') LIMIT 1 ");
		    
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
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS userdata(id int NOT NULL AUTO_INCREMENT,fName varchar(255),lName varchar(255),email varchar(255),password varchar(255),cpassword varchar(255),mbl varchar(255),role varchar(255),PRIMARY KEY(id))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS rooms(id int NOT NULL AUTO_INCREMENT,room_no TEXT,room_capacity int,PRIMARY KEY(id))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS dept(id int NOT NULL AUTO_INCREMENT,dname varchar(255),PRIMARY KEY(id))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS meetingtime(id int NOT NULL AUTO_INCREMENT,meetingID text,meeting_time TEXT,PRIMARY KEY(id))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS course(id int NOT NULL AUTO_INCREMENT,CID text,Cname TEXT,code TEXT,seating_capacity int,PRIMARY KEY(id))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS faculty(id int NOT NULL AUTO_INCREMENT,Iname TEXT,Inum TEXT,PRIMARY KEY(id))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS role(id int NOT NULL AUTO_INCREMENT,Role varchar(20),PRIMARY KEY(id))");
			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS class( classId INT NOT NULL ,departmentId INT,courseId INT, instructorId INT,classTImeId INT, classroom_id INT, PRIMARY KEY (classId), FOREIGN KEY (classroom_id) REFERENCES rooms (id), FOREIGN KEY (classTImeId) REFERENCES meetingtime (id), FOREIGN KEY (instructorId) REFERENCES faculty (id),FOREIGN KEY (courseId) REFERENCES course (id),FOREIGN KEY (departmentId) REFERENCES dept(id) )");
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS course_instructor(id int NOT NULL AUTO_INCREMENT,course_instructor TEXT,course_numb TEXT,PRIMARY KEY(id), CONSTRAINT course_numb  FOREIGN KEY (course_numb)   REFERENCES course (CID)  ON DELETE NO ACTION  ON UPDATE NO ACTION,  CONSTRAINT course_instructor  FOREIGN KEY (course_instructor) REFERENCES faculty (Inum)  ON DELETE NO ACTION ON UPDATE NO ACTION)");
			    // statement.executeUpdate("CREATE TABLE IF NOT EXISTS dept_course(id int NOT NULL AUTO_INCREMENT,dept_id int,course_numb int,PRIMARY KEY(id),FOREIGN KEY (course_numb) REFERENCES course(id),FOREIGN KEY (dept_id) REFERENCES dept(id))");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occurred while creating tables.");
			System.out.println("Error"+e.getMessage());
		}
		
	}

}
