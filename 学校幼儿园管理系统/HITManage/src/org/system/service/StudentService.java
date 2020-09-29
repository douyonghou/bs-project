package org.system.service;

import java.util.List;

import org.system.pojo.Student;

public interface StudentService {
	public List<Student> queryAllStudents();
	public Student queryById(String id);
	public void addStudent(String id, String password, String name, int year,
			String phonenum);
	public void deleteStudent(String id);
	public void modifyStudent(String id, String password, String name, int year,
			String phonenum);
}
