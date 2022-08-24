package com.grade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grade.service.GradeService;


@Controller
public class GradeController {

	@RequestMapping("/marks")
	public ModelAndView add(@RequestParam("name") String name, @RequestParam("mark") int mark) {
	
		
		//String name=req.getParameter("name");
		//int mark=Integer.parseInt(req.getParameter("mark"));
        
		GradeService gs=new GradeService();
		
		String op=gs.grade(mark);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displaygrade");
		mv.addObject("name",name);
		mv.addObject("grade",op);

		return mv;
	}
}
