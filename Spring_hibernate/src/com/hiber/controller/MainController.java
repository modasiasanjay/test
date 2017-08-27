package com.hiber.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping(value = "/search.do", method = RequestMethod.GET)
	public ModelAndView search(HttpSession session){
		List ls = new ArrayList();
		ls = dao.search();
		return new ModelAndView("search","list",ls);
	}
@RequestMapping(value = "/edit.do",method = RequestMethod.GET)
public ModelAndView edit(HttpSession session,@RequestParam("id") int i) throws SQLException
{
	List ls = new ArrayList();	
	InfoVO vo =new InfoVO();
	vo.setId(i);
	ls= dao.edit(vo);
	return new ModelAndView("edit","data",ls);
}
@RequestMapping(value= "/update.do",method = RequestMethod.GET)
public ModelAndView update(@ModelAttribute InfoVO vo,@RequestParam("id") int i){
	
	vo.setId(i);
	dao.update(vo);
	return new ModelAndView("redirect:search.do");	
	}
}

//http://www.baeldung.com/spring-mvc-form-tutorial
//https://stackoverflow.com/questions/21241210/compatability-of-spring-4-0-0-with-hibernate-4-30

