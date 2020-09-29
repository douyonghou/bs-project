package org.system.service.impl;


import java.util.List;

import org.system.dao.StudentDao;
import org.system.pojo.Student;
import org.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public Student queryById(String id) {
	 	return studentDao.queryById(id);
	}

	public List<Student> queryAllStudents() {
		return studentDao.queryAllStudents();
	}

	public void addStudent(String id, String password, String name, int year,
			String phonenum) {

		studentDao.addStudent(id, password, name, year, phonenum);
		
	}

	public void deleteStudent(String id) {
		studentDao.deleteStudent(id);
		
	}

	public void modifyStudent(String id, String password, String name,
			int year, String phonenum) {
		studentDao.modifyStudent(id, password, name, year, phonenum);
		
	}



}
