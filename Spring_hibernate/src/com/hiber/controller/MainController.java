package com.hiber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hiber.dao.InfoDAO;
import com.hiber.vo.InfoVO;

@Controller
public class MainController {

@RequestMapping(value = "/Register.do", method = RequestMethod.GET)
	public ModelAndView add(){
		return new ModelAndView("Register","r",new InfoVO());
}
@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public ModelAndView insert(@ModelAttribute InfoVO vo){
		InfoDAO dao = new InfoDAO();
		dao.insert(vo);
		return new ModelAndView("redirect:Register.do");
	}
}
