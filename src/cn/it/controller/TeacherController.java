package cn.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.javafx.sg.prism.NGShape.Mode;

import cn.it.bean.Teacher;
import cn.it.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/getTeacher")
	public ModelAndView handle_01(@RequestParam(value="id",defaultValue="1")Integer id) {
		Teacher teacher = teacherService.getTeacher(id);
		ModelAndView mav = new ModelAndView("success");
		mav.addObject("teacher", teacher);
		return mav;
	}
	
	
	@RequestMapping("/handle_01")
	public String handle_01() {
		return "success";
	}
}
