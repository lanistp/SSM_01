package cn.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.it.bean.Teacher;
import cn.it.dao.TeacherDao;

@Service
public class TeacherService {
	@Autowired
	TeacherDao teacherDao;	
	public Teacher getTeacher(Integer id) {
		return teacherDao.getTeacherById(id);		
	}

}
