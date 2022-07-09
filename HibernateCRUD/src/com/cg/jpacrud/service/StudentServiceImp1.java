package com.cg.jpacrud.service;

import com.cg.jpacrud.dao.StudentDao;
import com.cg.jpacrud.dao.StudentDaoImp1;
import com.cg.jpacrud.entities.Student;

public class StudentServiceImp1 implements StudentService
{
	private StudentDao dao;

	public StudentServiceImp1() 
	{
		dao = new StudentDaoImp1();
	}

	@Override
	public void addStudent(Student student) 
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public Student findStudentById(int id)
	{
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) 
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) 
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}
	
	

}
