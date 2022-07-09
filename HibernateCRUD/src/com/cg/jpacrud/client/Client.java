package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImp1;

public class Client {

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImp1();
		
		
		
		// Create Operation
		
		student.setStudentid(4);
	student.setName("Raavi ");
	service.addStudent(student);
		
		
	// Retrieve Operation
		service.findStudentById(4);
		System.out.println("ID: "+student.getStudentid());
		System.out.println("Name: "+student.getName());
		
		
		
		//Update Operation
		student = service.findStudentById(4);
		student.setName("Raavi ");
		service.updateStudent(student);
		
		
	//	service.findStudentById(4);
		System.out.println("ID: "+student.getStudentid());
		System.out.println("Name: "+student.getName());
		
		
		// Delete Operation
//		student=service.findStudentById(4);
//		service.removeStudent(student);
//		System.out.println("Row removed");*/
	
		System.out.println("End of program/Life cycle completed...");
		System.out.println("done");
		
		
	}

}
