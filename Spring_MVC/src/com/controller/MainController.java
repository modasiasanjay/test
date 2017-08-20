

package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Dao;
import com.vo.RegiVo;



@Controller
public class MainController {

	@RequestMapping(value = "/Register.do",method = RequestMethod.GET)
	public ModelAndView RegisterPage() {

		return new ModelAndView("Regi","regis",new RegiVo());
	}
	
	@RequestMapping(value = "/insert.do",method = RequestMethod.GET)
	public ModelAndView insert(@ModelAttribute RegiVo regis) throws SQLException
	{
		Dao d=new Dao();
		d.insert(regis);
		return new ModelAndView("redirect:/Register.do");
	}
	
	@RequestMapping(value = "/Search.do",method = RequestMethod.GET)
	public ModelAndView search(HttpSession session) throws SQLException
	{
		List ls=new ArrayList();
		Dao d=new Dao();
		ls=d.Search();
		
		return new ModelAndView("Search","data",ls);
	}
	
	@RequestMapping(value = "/Edit.do",method = RequestMethod.GET)
	public ModelAndView edit(@RequestParam ("id") int id) throws SQLException
	{
		RegiVo vo =new RegiVo();
		vo.setId(id);
		
		Dao d=new Dao();
		List ls=d.Edit(vo);

		return new ModelAndView("Edit","data",ls);
	}
	@RequestMapping(value = "/Delete.do",method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam ("id") int id) throws SQLException
	{
		RegiVo vo =new RegiVo();
		vo.setId(id);
		Dao d=new Dao();
		List ls=d.Delete(vo);

		return new ModelAndView("redirect:/Search.do");
	}
	@RequestMapping(value = "/Update.do",method = RequestMethod.GET)
	public ModelAndView update(@ModelAttribute RegiVo regis , @RequestParam ("id") int id) throws SQLException
	{
		regis.setId(id);
		Dao d=new Dao();
		d.update(regis);
		
		return new ModelAndView("redirect:/Search.do");
		
	}
	
}