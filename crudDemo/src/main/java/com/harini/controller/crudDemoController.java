package com.harini.controller;

import com.harini.dao.crudDemoDao;
import com.harini.model.crudDemoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class crudDemoController {
	
	@Autowired
	crudDemoDao cruddao;
	
	@RequestMapping("index")
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(crudDemoModel crud)
	{
		cruddao.save(crud);
		return "index.jsp";
	}
	
	@RequestMapping("show")
	public ModelAndView show(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("show.jsp");
		crudDemoModel crud = cruddao.findById(id).orElse(new crudDemoModel());
		mav.addObject("details",crud);
		return mav;
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("delete.jsp");
		crudDemoModel crud=cruddao.findById(id).orElse(new crudDemoModel());
		cruddao.deleteById(id);
		mav.addObject("details", crud);
		return mav;
	}
	
	@RequestMapping("update")
	public ModelAndView update(crudDemoModel crud)
	{
		ModelAndView mav=new ModelAndView("update.jsp");
		crud = cruddao.findById(crud.getId()).orElse(new crudDemoModel());
		cruddao.deleteById(crud.getId());
		mav.addObject("details", crud);
		return mav;
	}
}
