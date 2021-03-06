package org.system.service;

import java.util.List;

import org.system.pojo.Teacher;

public interface TeacherService {
	 public List<Teacher> queryAllTeachers();
	 public List<Teacher> queryById(String id);
     public void addTeacher(String id,String password,String name,String phonenum);
     public void deleteById(String id);
     public void modifyTeacher(String id,String password,String name,String phonenum);
}
