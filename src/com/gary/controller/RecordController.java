package com.gary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gary.pojo.Record;
import com.gary.service.RecordService;



@Controller 
@RequestMapping("")
public class RecordController {
	@Autowired 
	RecordService recordService;
	@RequestMapping("listRecord")
	public ModelAndView listRecord(){
		ModelAndView modelAndView = new ModelAndView();
		List<Record> cs = recordService.list();	
		modelAndView.addObject("cs",cs);
		modelAndView.setViewName("listRecord");
		return modelAndView;
	}
//	@RequestMapping("addCategory")
//	public ModelAndView addCategory(Category category){
//		categoryService.add(category);
//		ModelAndView mav = new ModelAndView("redirect:/listCategory");
//	    return mav;
//	}
	@RequestMapping("addRecord")
	public ModelAndView addRecord(Record record){
		recordService.add(record);
		ModelAndView modelAndView = new ModelAndView("redirect:/listRecord");
		return modelAndView;
	}
	@RequestMapping("editRecord")
	public ModelAndView editRecord(Record record){
		Record c= recordService.get(record.getId());
		ModelAndView mav = new ModelAndView("editRecord");
		mav.addObject("c", c);
		return mav;
	}	
	@RequestMapping("updateRecord")
	public ModelAndView updateRecord(Record record){
		recordService.update(record);
		ModelAndView mav = new ModelAndView("redirect:/listRecord");
		return mav;
	}	
	@RequestMapping("deleteRecord")
	public ModelAndView deleteRecord(Record record){
		recordService.delete(record);
		ModelAndView modelAndView = new ModelAndView("redirect:/listRecord");
		return modelAndView;
	}
}
