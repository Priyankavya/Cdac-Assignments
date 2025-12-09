package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sdao;
	@Override
	public List<Student> getAllStudent() {
		
		return sdao.getAllStudent();
	}
	@Override
	public Student findById(int sid) {
		
		return sdao.searchById(sid);
	}
	@Override
	public boolean updateData(Student s) {
		
		return sdao.modifyStudent(s);
	}
	@Override
	public boolean deletedata(int sid) {
		// TODO Auto-generated method stub
		return sdao.removestudent(sid);
	}
	@Override
	public boolean insertdata(Student s) {
		
		return sdao.addstudent(s);
	}
	

}
