package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student findById(int sid);

	boolean updateData(Student s);

	boolean deletedata(int sid);

	boolean insertdata(Student s);

}
