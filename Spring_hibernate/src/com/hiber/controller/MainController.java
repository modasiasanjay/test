package com.hiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hiber.dao.InfoDAO;
import com.hiber.vo.InfoVO;

@Controller
public class MainController {
	@Autowired
	InfoDAO dao;

@RequestMapping(value = "/Register.do", method = RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("Register","r", new InfoVO());
}
@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public ModelAndView insert(@ModelAttribute("r") InfoVO vo){
		dao.insert(vo);
		return new ModelAndView("redirect:Register.do");
	}
}

//http://www.baeldung.com/spring-mvc-form-tutorial

//https://stackoverflow.com/questions/21241210/compatability-of-spring-4-0-0-with-hibernate-4-30

