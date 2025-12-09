package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	List<Student> getAllStudent();

	Student searchById(int sid);

	boolean modifyStudent(Student s);

	boolean removestudent(int sid);

	boolean addstudent(Student s);

}
